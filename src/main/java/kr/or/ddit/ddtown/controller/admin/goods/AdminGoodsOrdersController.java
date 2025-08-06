package kr.or.ddit.ddtown.controller.admin.goods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.ddit.ServiceResult;
import kr.or.ddit.ddtown.service.admin.goods.orders.IAdminOrdersService;
import kr.or.ddit.ddtown.service.goods.cancel.ICancelService;
import kr.or.ddit.vo.PaginationInfoVO;
import kr.or.ddit.vo.order.OrdersVO;
import kr.or.ddit.vo.security.CustomOAuth2User;
import kr.or.ddit.vo.security.CustomUser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin/goods/orders")
public class AdminGoodsOrdersController {
	
	@Autowired
	private IAdminOrdersService adminOrderService;
	
	@Autowired
	private ICancelService cancelService;
	
    private final ObjectMapper objectMapper = new ObjectMapper(); // 이 줄을 추가합니다.

	
	@GetMapping("/list")
	public String goodsOrdersList(
	        @RequestParam(name = "currentPage", required = false, defaultValue = "1") int currentPage,
	        @RequestParam(name = "orderDateStart", required = false) String orderDateStart,
	        @RequestParam(name = "orderDateEnd", required = false) String orderDateEnd,
	        @RequestParam(name = "orderStatusFilter", required = false) String orderStatusFilter,
	        @RequestParam(name = "orderSearchInput", required = false) String orderSearchInput,
	        Model model) throws Exception {

	    PaginationInfoVO<OrdersVO> pagingVO = new PaginationInfoVO<>();
	    pagingVO.setCurrentPage(currentPage);

	    // 검색 조건을 담을 Map 생성 및 설정
	    Map<String, Object> searchMap = new HashMap<>();
	    
	    if (orderDateStart != null && !orderDateStart.isEmpty()) {
	        searchMap.put("orderDateStart", orderDateStart);
	    }
	    if (orderDateEnd != null && !orderDateEnd.isEmpty()) {
	        searchMap.put("orderDateEnd", orderDateEnd);
	    }

	    if (orderStatusFilter != null && !orderStatusFilter.isEmpty()) {
	        searchMap.put("orderStatusFilter", orderStatusFilter);
	    }
	    if (orderSearchInput != null && !orderSearchInput.isEmpty()) {
	        searchMap.put("orderSearchInput", orderSearchInput);
	    }
	    
	    pagingVO.setSearchMap(searchMap); // <-- searchMap을 pagingVO에 설정합니다.
	    log.info("### AdminGoodsOrdersController - 최종 searchMap: {}", searchMap);

	    log.info("### AdminGoodsOrdersController - goodsOrdersList 호출: currentPage={}, searchMap={}",
	             pagingVO.getCurrentPage(), pagingVO.getSearchMap());

	    int totalRecord = adminOrderService.getTotalOrdersCount(pagingVO);
	    pagingVO.setTotalRecord(totalRecord);

	    List<OrdersVO> orderList = adminOrderService.getAllOrders(pagingVO);
	    pagingVO.setDataList(orderList);
	    
	    // ⭐ 1. 주문 상태별 개수를 가져오는 서비스 메소드 호출 시 searchMap을 전달 ⭐
	    // 이 searchMap은 날짜, 검색어 필터를 포함하고 있습니다.
	    Map<String, Object> orderStatusCounts = adminOrderService.getOrderStatusCounts(searchMap); // <-- 여기에 searchMap 추가!
	    model.addAttribute("orderStatusCounts", orderStatusCounts); 
	    
	 // --- ⭐⭐ 여기에 통계 데이터를 JSON 문자열로 변환하여 Model에 추가합니다. ⭐⭐ ---

	    // 2. 최근 N일간 일별 매출액 조회 (예: 최근 7일)
	    Map<String, Long> dailySalesData = adminOrderService.getDailySales(searchMap);
	    // Map을 JSON 문자열로 변환하여 "dailySalesDataJson" 이라는 이름으로 Model에 추가합니다.
	    model.addAttribute("dailySalesDataJson", objectMapper.writeValueAsString(dailySalesData));
	    log.info("### AdminGoodsOrdersController - dailySalesDataJson: {}", objectMapper.writeValueAsString(dailySalesData));

	    // 3. 인기 상품 TOP N 조회 (예: TOP 5)
	    List<Map<String, Object>> topSellingGoods = adminOrderService.getTopSellingGoods(5, searchMap);
	    // List<Map>을 JSON 문자열로 변환하여 "topSellingGoodsJson" 이라는 이름으로 Model에 추가합니다.
	    model.addAttribute("topSellingGoodsJson", objectMapper.writeValueAsString(topSellingGoods));
	    log.info("### AdminGoodsOrdersController - topSellingGoodsJson: {}", objectMapper.writeValueAsString(topSellingGoods));

	    // --- ⭐⭐ 통계 데이터 추가 로직 끝 ⭐⭐ ---
	    
	    model.addAttribute("pagingVO", pagingVO);

	    model.addAttribute("orderDateStart", orderDateStart);
	    model.addAttribute("orderDateEnd", orderDateEnd);
	    model.addAttribute("orderStatusFilter", orderStatusFilter);
	    model.addAttribute("orderSearchInput", orderSearchInput);


	    return "admin/goods/orders/orders_list";
	}

	    @GetMapping("/detail")
	    public String goodsOrdersDetail(
	            @RequestParam("orderNo") int orderNo,
	            // 상세 페이지 '목록' 버튼을 위해 검색 파라미터들을 그대로 받아서 Model에 넘겨줍니다.
	            @RequestParam(name = "currentPage", required = false, defaultValue = "1") int currentPage,
	            @RequestParam(name = "orderDateStart", required = false) String orderDateStart,
	            @RequestParam(name = "orderDateEnd", required = false) String orderDateEnd,
	            @RequestParam(name = "orderStatusFilter", required = false) String orderStatusFilter,
	            @RequestParam(name = "orderSearchInput", required = false) String orderSearchInput,
	            Model model) {

	        log.info("### AdminGoodsOrdersController - goodsOrdersDetail 호출: orderNo={}", orderNo);
	        OrdersVO order = adminOrderService.getOrderDetail(orderNo);
	        
	        // 🚨🚨🚨 여기 로그 추가
	        log.info("조회된 주문 정보 (order.orderStatCode): {}", order.getOrderStatCode());
	        log.info("조회된 주문 정보 (order.refundedAmount): {}", order.getRefundedAmount());
	        log.info("조회된 주문 정보 (order.totalGoodsPrice): {}", order.getTotalGoodsPrice());
	        log.info("조회된 주문 정보 (order.actualShippingFee): {}", order.getActualShippingFee());
	        // ... 필요하면 order 객체 전체를 출력 (toString() 자동 생성)
	        // log.info("조회된 주문 정보 전체: {}", order);

	        model.addAttribute("order", order);

	        // JSP '목록' 버튼 구성을 위한 파라미터 전달
	        model.addAttribute("currentPage", currentPage);
	        model.addAttribute("orderDateStart", orderDateStart);
	        model.addAttribute("orderDateEnd", orderDateEnd);
	        model.addAttribute("orderStatusFilter", orderStatusFilter);
	        model.addAttribute("orderSearchInput", orderSearchInput);

	        return "admin/goods/orders/orders_detail";
	    }
	    
	    // 🚨🚨🚨 새로 추가할 주문 정보 업데이트 메서드 🚨🚨🚨
	    @PutMapping("/update") // JSP에서 PUT 메서드로 요청하므로 @PutMapping 사용
	    @ResponseBody // JSON 응답을 위해 추가
	    public ResponseEntity<Map<String, String>> updateOrder(@RequestBody OrdersVO orderVO) {
	        log.info("### AdminGoodsOrdersController - updateOrder 호출: orderNo={}, orderStatCode={}, orderMemo={}",
	                 orderVO.getOrderNo(), orderVO.getOrderStatCode(), orderVO.getOrderMemo());

	        Map<String, String> response = new HashMap<>();
	        try {
	            // 서비스 계층에서 업데이트 로직 호출
	            // 예를 들어, adminOrderService.updateOrderStatusAndMemo(orderVO);
	            // 이 메서드를 IAdminOrdersService에 추가하고 구현해야 합니다.
	            int updateCount = adminOrderService.updateOrderStatusAndMemo(orderVO); // 서비스에 추가할 메서드

	            if (updateCount > 0) {
	                response.put("status", "OK");
	                response.put("message", "주문 정보가 성공적으로 업데이트되었습니다.");
	                return new ResponseEntity<>(response, HttpStatus.OK);
	            } else {
	                response.put("status", "FAILED");
	                response.put("message", "주문 정보 업데이트에 실패했습니다. 변경된 내용이 없거나 주문 번호가 유효하지 않습니다.");
	                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST); // 실패 시 BAD_REQUEST
	            }
	        } catch (Exception e) {
	            log.error("주문 정보 업데이트 중 오류 발생: {}", e.getMessage(), e);
	            response.put("status", "ERROR");
	            response.put("message", "서버 오류가 발생했습니다: " + e.getMessage());
	            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR); // 예외 발생 시 INTERNAL_SERVER_ERROR
	        }
	    }
	    
	    
	    @PutMapping("/cancel/{orderNo}") // PUT 요청을 받도록 매핑
	    @ResponseBody // JSON 응답을 위해 추가 (ServiceResult가 JSON으로 변환됨)
	    public ResponseEntity<String> cancelOrder(
	            @PathVariable("orderNo") int orderNo,
	            @AuthenticationPrincipal Object principal
	            ) {
	        log.info("### AdminGoodsOrdersController - cancelOrder 호출: orderId={}", orderNo);

	        String empUsername = null;

	        if (principal instanceof CustomUser) {
	            CustomUser customUser = (CustomUser) principal;
	            if (customUser.getEmployeeVO() != null) {
	                empUsername = customUser.getEmployeeVO().getEmpUsername();
	                log.info("로그인한 관리자 ID (Employee): {}", empUsername);
	            } else if (customUser.getMemberVO() != null) {
	                empUsername = customUser.getMemberVO().getMemUsername();
	                log.warn("일반 회원(MemberVO)이 관리자 기능을 시도: {}", empUsername);
	            }
	        } else if (principal instanceof CustomOAuth2User) {
	            empUsername = ((CustomOAuth2User) principal).getMemberVO().getMemUsername();
	            log.warn("OAuth2 사용자가 관리자 기능을 시도: {}", empUsername);
	        }

	        if (empUsername == null) {
	            log.error("로그인한 관리자 정보를 가져올 수 없거나, 유효한 계정이 아닙니다.");
	            return new ResponseEntity<>("UNAUTHORIZED", HttpStatus.UNAUTHORIZED); // 401 Unauthorized
	        }

	        log.info("Controller에서 Service로 전달될 empUsername: {}", empUsername);

	        ServiceResult result = adminOrderService.cancelOrder(orderNo, empUsername); // AdminOrdersServiceImpl로 orderNo와 empUsername 전달


	        if (result == ServiceResult.OK) {
	            return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("FAILED", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}

