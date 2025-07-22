# Project - DDTOWN
<img src="https://github.com/pcs1231/Project/blob/main/images/mainPage.png">

# 📖프로젝트 소개
**아티스트**와 **팬**이 사이트의 활발한 활동을 장려하기 위함과 다양한 플랫폼을 여러 사이트로부터 얻었던 편의성을 하나의 사이트를 통해 사용자의 편의성을 극대화 시킴을 목표로 **커뮤니티**와 **실시간 알림 서비스**를 이용하여 다양한 정보를 얻고 소통하며 콘서트를 통해 **공연 예매 서비스**, 굿즈샵을 통해 아티스트의 **상품 결제 서비스**를 구현하였습니다. 또한 하나의 아티스트를 담당하는 **직원**을 위해 담당 아티스트와 관련된 **멤버십**, **콘서트**, **커뮤니티 관리 서비스**를 구현하였습니다. 마지막 액터인 사이트의 모든 운영을 담당하는 **관리자**를 위한 **전체 사용자 관리**, **굿즈샵 관리**, **고객센터 서비스**를 구현하였습니다. **직원**과 **관리자**는 통계를 통해 분야별 현황을, 전자결재를 통해 간단한 그룹웨어 서비스를 통해 원활한 사이트 운영을 하도록 제공하였습니다.

# 👨‍👨‍👧‍👧팀원소개
<table>
  <tr>
    <th>박건우</th>
    <th>강유정</th>
    <th>김승연</th>
    <th>이혜리</th>
    <th>김예찬</th>
    <th>박철순</th>
    <th>원지은</th>
  </tr>
  <tr align="center">
    <td>PL</td>
    <td>AA / sub PL</td>
    <td>TA</td>
    <td>QA / UA</td>
    <td>DA</td>
    <td>BA</td>
    <td>QA / UA</td>
  </tr>
</table>

# 🕒개발 기간
**2025-04-30 ~ 2025-07-04 총66일**

<img src="https://github.com/pcs1231/Project/blob/main/images/projectSchedule.png" >

- **1주차** : 프로젝트 팀 구성 및 주제선정, **요구사항 분석 시작**
- **2주차** : 요구사항 분석 완료, **산출물 설계 및 아키텍쳐 수립 시작**, 착수 발표
- **3주차** : 산출물 설계 완료, **공통 기능 수립 시작**
- **4주차** : 아키텍쳐 수립 완료, **업무 시스템 개발(기능구현) 시작**
- **5주차** : 공통 기능 수립 완료, **단위 테스트 시작**
- **6주차** : 단위 테스트 완료
- **7주차** : **통합 테스트 시작**
- **8주차** : 업무시스템 개발 완료, 통합테스트 완료, **최종 발표**

# 📁주요 산출물
<div align="right">각 산출물 중 대표만 사용함</div>
<table>
  <tr>
    <th>수행계획서</th>
    <th>요구사항 정의서</th>
    <th>유스케이스</th>
    <th>메뉴 구조도</th>
    <th>화면정의서</th>
    <th>ERD</th>
  </tr>
  <tr>
    <td><img src="https://github.com/pcs1231/Project/blob/main/images/workPlan.png"></td>
    <td><img src="https://github.com/pcs1231/Project/blob/main/images/RDD.png"></td>
    <td><img src="https://github.com/pcs1231/Project/blob/main/images/usecase.png"></td>
    <td><img src="https://github.com/pcs1231/Project/blob/main/images/MenuStructureDiagram.png"></td>
    <td><img src="https://github.com/pcs1231/Project/blob/main/images/ScreenDefinitionDocument.png"></td>
    <td><img src="https://github.com/pcs1231/Project/blob/main/images/ERD.png"></td>
  </tr>
  <tr>
    <td><strong>4개의 액터</strong>를 기준으로 각 기능을 구분시킴</td>
    <td>클라이언트로부터 필요한 <strong>기능</strong>과 액터별 기능 <strong>활성 여부 체크</strong></td>
    <td><strong>관리자</strong> 액터가 아티스트 커뮤니티 관리 서비스 이용 시</td>
    <td><strong>팬, 아티스트</strong> 액터가 이용할 수 있는 메뉴구성</td>
    <td><strong>카카오페이</strong>를 이용한 결제 서비스</td>
    <td><strong>총 60개</strong>의 테이블을 사용</td>
  </tr>
</table>

# 🛠기술 스택
- IDE : `SpringToolSuite4`
- 데이터베이스 : `Oracle`
- 서버 : `ApacheTomcat`
- 형상관리 : `svn`
- 프론트엔드: `HTML5`,`CSS3`,`JAVASCRIPT`,`BootStrap`

# 💡주요 기능
- **사용자** <br/>
  
  <table>
    <caption align="center"><strong>1. 카카오페이 간편 결제</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/pcs1231/Project/blob/main/images/mainPage.png">
      </th>
    </tr>
    <tr>
      <td>
        <div>카카오페이 API를 연동하여 사용자가 카카오톡을 통해 간편하고 안전하게 상품을 결제할 수 있도록 구현했습니다. 복잡한 카드 정보 입력 없이, 카카오페이 앱으로 즉시 결제를 완료하는 편리함을 경험해 보세요.</div><br/>
        <ul>
          <li><strong>결제</strong>: 상품 구매 시 카카오페이로 손쉽게 결제할 수 있습니다.</li>
          <li><strong>결제 조회</strong>: 마이페이지를 통해서 결제 내역을 언제든지 확인하고 관리할 수 있습니다.</li>
          <li><strong>결제 취소</strong>: 마이페이지를 통해 구매했던 상품의 결제를 간편하게 취소할 수 있습니다. 취소 즉시 관련 내역이 업데이트됩니다. </li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>2. 콘서트 예매</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/pcs1231/Project/blob/main/images/mainPage.png">
      </th>
    </tr>
    <tr>
      <td>
        <div><strong>SVG 파일</strong>을 활용하여 <strong>실제 공연장과 비슷한 UI</strong> 제공함으로 <strong>선명하고 직관적인</strong> 사용자 인터페이스와 <strong>간편한 결제 시스템</strong>을 제공하여 <strong>편리한 예매 경험</strong>을 선사하기 위함을 중점으로 두었습니다.</div><br/>
        <ul>
          <li><strong>콘서트 조회</strong>: 온/오프라인 콘서트 목록을 조회할 수 있으며 <strong>종료된 콘서트는 자동으로 비활성화</strong> 되어 선택이 불가능하며, <strong>유효한 콘서트만 선택이 가능하도록 구분</strong>됩니다.</li>
          <li><strong>콘서트 예매</strong>: <strong>원하는 좌석을 선택</strong>할 수 있으며 <strong>이미 선택완료된 좌석은 중복 선택이 불가하도록 설계</strong>하여 예매 충돌을 방지합니다.(SweetAlert API 활용) <strong>간편한 결제</strong>를 위해 <strong>카카오페이 API를 연동</strong>하여 콘서트 결제하고 <strong>즉시 예매를 완료</strong>합니다.</li>          
          <li><strong>콘서트 취소</strong>: 마이페이지를 통해 <strong>구매했던 콘서트의 결제를 간편하게 취소</strong>할 수 있습니다. <strong>취소 즉시 관련 내역이 업데이트</strong>됩니다.</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>3. 실시간 알림</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/pcs1231/Project/blob/main/images/mainPage.png">
      </th>
    </tr>
    <tr>
      <td>
        <div>사용자에게 <strong>실시간</strong>으로 <strong>개인화된 중요 정보</strong>를 전달합니다. 특정 이벤트 발생 시 사용자에게 <strong>즉시 알림을 발송</strong>하고, 각 사용자의 선호에 따라 알림 수신 여부를 설정함으로 사용자가 <strong>서비스 이용 편의성</strong>에 중점을 두었습니다.</div><br/>
        <ul>
          <li><strong>알림 전송</strong> : 알림에 대한 정보를 <strong>정확하게 저장</strong>되고 알림이 동시에 발생해도 <strong>누락되거나 중복되지 않고 안정적으로 전달</strong>됩니다.(@Transactional 활용) 또한, <strong>웹소켓(WebSocket) 기술</strong>를 활용하여 사용자에게 <strong>실시간으로 알림을 전송</strong>됩니다.</li>
          <li><strong>개인 맞춤 알림</strong>: 콘서트 티켓 오픈, 라이브 방송 시작, 새 게시글/댓글/좋아요, DM 등 <strong>다양한 이벤트들을 실시간으로 감지</strong>하여 알림을 보냅니다. <strong>마이페이지를 통해 불필요한 알림은 끄고 원하는 알림만 받을 수 있습니다.</strong></li>          
          <li><strong>알림 내역</strong>: 마이페이지 또는 상단 알림 아이콘을 통해 <strong>알림 내역을 조회</strong>할 수 있으며 <strong>읽음 표시 또는 삭제</strong>를 할 수 있습니다. <strong>알림 클릭 시 알림에 해당하는 페이지로 이동</strong>합니다.</li>
        </ul>
      </td>
    </tr>
  </table>
