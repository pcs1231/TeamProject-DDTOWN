# Project - DDTOWN
<img src="https://github.com/pcs1231/Project/blob/main/images/mainPage.png">

# 📖프로젝트 소개
**아티스트**와 **팬**이 사이트의 활발한 활동을 장려하기 위함과 다양한 플랫폼을 여러 사이트로부터 얻었던 편의성을 하나의 사이트를 통해 사용자의 편의성을 극대화 시킴을 목표로 합니다.
사용자는 **커뮤니티**와 **실시간 알림 서비스**를 이용하여 다양한 정보를 얻고 소통할 수 있습니다. 또한, 콘서트를 통해 **공연 예매 서비스**, 굿즈샵에서는 아티스트의 **상품 결제 서비스**를 이용할 수 있습니다. 하나의 아티스트를 담당하는 **직원**을 위해 담당 아티스트와 관련된 **멤버십**, **콘서트**, **커뮤니티 관리 서비스**등을 관리할 수 있습니다. 마지막 액터인 사이트의 모든 운영을 담당하는 **관리자**를 위한 **전체 사용자 관리**, **굿즈샵 관리**, **고객센터 서비스**등을 이용할 수 있습니다. 더 나아가 **직원**과 **관리자**는 통계를 통해 분야별 현황을, 전자결재를 통해 간단한 그룹웨어 서비스를 통해 원활한 사이트 운영을 하도록 제공하였습니다.

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
  <tr>
    <td>PL</td>
    <td>AA / subPL</td>
    <td>TA</td>
    <td>QA / UA</td>
    <td>DA</td>
    <td>BA</td>
    <td>QA / UA</td>
  </tr>
</table>

# 🕒개발 기간
**2025-05-02 ~ 2025-07-04 2개월**

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
- 언어 : `Java`,`JavaScript`
- 프레임워크 : `SpingBoot`,`mybatis`
- 데이터베이스 : `Oracle`
- 서버 : `ApacheTomcat`
- 형상관리 : `svn`
- 프론트엔드: `HTML5`,`CSS3`,`BootStrap`

# 💡주요 기능
-  **사용자** <br/>
  
  <table>
    <caption align="center"><strong>1. 카카오페이 간편 결제</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/f52fc4dc-fec0-4f52-8ed1-15eff308830f">
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
        <img src="https://github.com/user-attachments/assets/bf92390f-ac87-4877-9508-16a0dffd1a76">
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
        <img src="https://github.com/user-attachments/assets/f4c41787-ea2b-4b14-93b6-ddb7a25bf209">
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
  <table>
    <caption align="center"><strong>4. 그 외 기능</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/d088dd44-2ca5-4031-9d7e-e20660806182">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/6237fc86-d79b-4351-9ecf-b0a0ec4dbc7e">
      </th>
    </tr>
    <tr>
      <td align="center">커뮤니티 - 아티스트</td>
      <td align="center">커뮤니티 - 팬</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/f8d0e438-3f76-4e88-a5c4-0d22baf70553">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/25586b64-55ae-475d-97fd-baa975730fdd">
      </th>
    </tr>
    <tr>
      <td align="center">커뮤니티 - 스케줄</td>
      <td align="center">커뮤니티 - 공지사항</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/7e472b56-7d4c-4e54-a345-15030aebe817">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/e700641c-3dc0-4bc3-a037-6d72a40d293b">
      </th>
    </tr>
    <tr>
      <td align="center">FAQ</td>
      <td align="center">1대1문의</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/1a63008a-47f8-41f3-9c84-53a66f8bc889">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/56e33ab8-301c-4a19-bef0-8e1380a9a85c">
      </th>
    </tr>
    <tr>
      <td align="center">마이페이지</td>
      <td align="center">커뮤니티 개인 프로필</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/7abb2317-2556-4d9e-985b-31e6861f324b">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/26ce9718-9575-42f8-90ad-d80abb61083e">
      </th>
    </tr>
    <tr>
      <td align="center">DM</td>
      <td align="center">장바구니 & 찜</td>
    </tr>
    <tr>
      <th colspan="2">
        <img src="https://github.com/user-attachments/assets/d6fd34ed-b758-4177-8bd7-dc3169054893">
      </th>
    </tr>
    <tr>
      <td colspan="2" align="center">이상형월드컵</td>
    </tr>
  </table>

- **아티스트**

  <table>
    <caption align="center"><strong>1. 라이브 스트리밍</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/ec4a9d1b-e2fd-43e2-bdd3-8f345c04eaac">
      </th>
    </tr>
    <tr>
      <td>
        <div>아티스트가 <strong>실시간으로 팬들과 소통</strong>할 수 있는 라이브 방송 플랫폼을 제공합니다. <strong>안정적인 방송 관리</strong>와 <strong>효율적인 실시간 통신</strong>을 중점을 두었습니다.</div><br/>
        <ul>
          <li><strong>방송 생성 및 관리</strong> : 아티스트가 방송을 시작할 때 커뮤니티 프로필 조회, 라이브 전용 채팅 채널 생성, 방송 정보 저장 등 여러 단계를 <strong>하나의 안전한 묶음</strong>으로 처리하여 <strong>데이터 엉킴을 막습니다.</strong>(@Transactional 활용) 또한, 동시에 수많은 시청자가 동시 접속해도 <strong>방송 세션과 시청자 정보를 메모리에 빠르게 저장하고 관리</strong>하며 <strong>시청자가 들어오거나 나갈 때마다 실시간 시청자 수를 업데이트 합니다.</strong>(CurrentHasgMap 활용)</li>
          <li><strong>실시간 상호작용</strong>: 방송 중 <strong>시그널링 메시지 중계</strong>를 통해 <strong>고품질 영상과 음성 스트리밍을 지원</strong>하고, <strong>방송 채팅방을 통해 실시간으로 메시지를 주고 받을 수 있습니다.</strong>(WebRTC 기술 활용) 또한, 라이브 시작 알림을 받으면 <strong>클릭 한 번으로 방송에 참여</strong>할 수 있어 <strong>편리한 접근성을 제공</strong>합니다.</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>2. 실시간 메세지(DM)</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/9b2b27ad-2fe4-45f2-835f-73f68815018b">
      </th>
    </tr>
    <tr>
      <td>
        <div>아티스트와 팬들이 <strong>대화</strong>를 나눌 수 있는 메시징 플랫폼입니다. 아티스트 <strong>다수의 팬들과 1:N 소통</strong>할 수 있고, 팬들은 자신이 좋아하는 아티스트와 <strong>1:1으로 대화하는 듯한 특별한 경험</strong>을 제공합니다. 또한, <strong>파일 첨부 기능</strong>을 지원하여 <strong>풍부한 소통</strong>을 중점으로 두었습니다. </div><br/>
        <ul>
          <li><strong>메시지 관리</strong> : 사용자의 권한과 멤버십 상태를 확인하여 <strong>아티스트와 멤버십 구독자에게만 채팅방 접근을 허용</strong>하도록 제어합니다. 또한, 채팅방 생성, 메시지 전송, 파일 첨부 등 메세지 관련 작업은 <strong>안전하게 저장 및 관리</strong>되어 <strong>데이터의 정확성과 무결성</strong>을 보장합니다.(@Transactional 활용)</li>
          <li><strong>실시간 소통</strong>: <strong>웹소켓(WebSocket)기술</strong>을 활용한 <strong>실시간 메시지 전송</strong>을 지원하여 아티스트와 팬들이 <strong>즉각적으로 소통</strong>할 수 있게 합니다. <strong>이미지 파일 첨부 기능</strong>도 제공하여 대화의 폭을 넓혔습니다. </li>
        </ul>
      </td>
    </tr>
  </table>

- **직원**

  <table>
    <caption align="center"><strong>1. 멤버십 관리</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/9d2d4443-0958-4c85-83d0-bdc3b35c41cf">
      </th>
    </tr>
    <tr>
      <td>
        <div>아티스트의 멤버십 플랜을 <strong>생성, 운영 및 분석</strong>을 위한 시스템입니다. 모든 멤버십 플랜은 조회하며, 운영 현황을 면밀히 모니터링하고 <strong>통계 데이터</strong>를 기반으로 멤버십 상품의 성과를 분석합니다. 이는 <strong>아티스트의 수익 극대화</strong>와 <strong>팬덤의 지속적인 성장</strong>을 최우선 목표로 합니다.</div><br/>
        <ul>
          <li><strong>플랜 관리</strong> : <strong>직관적인 UI</strong>를 통해 멤버십 플랜의 <strong>CRUD</strong>를 손쉽게 관리할 수 있습니다. 특히, <strong>담당 플랜만 수정, 삭제</strong>할 수 있게 접근을 제어하여 <strong>데이터의 안정성</strong>을 높였습니다. 통계 차트로 <strong>인기 플랜 및 월별 매출 추이를 시각적으로 제공</strong>합니다.(Chart.js 활용)</li>
          <li><strong>안정적인 데이터 처리 및 운영 환경</strong> : <strong>AJAX 통신</strong>을 통해 <strong>실시간으로 데이터</strong>를 처리하고 <strong>트랜잭션 관리</strong>를 하여 <strong>데이터의 일관성과 무결성</strong>을 보장합니다.(@Transactional 활용) 또한, <strong>실시간 피드백</strong>을 제공하며(SweetAlert 활용) <strong>오류 로깅</strong>을 활용하여 시스템의 <strong>안정적인 운영환경</strong>을 구축합니다.</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>2. 일정 관리</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/ff2a65ca-9b28-4d4a-8f4a-27eb08a373b1">
      </th>
    </tr>
    <tr>
      <td>
        <div>캘린더 인터페이스를 통해 아티스트의 일정을 관리하고 <strong>정확한 정보를 제공</strong>합니다. 담당 아티스트의 <strong>모든 스케줄을 한눈에 보고 효율적으로 관리</strong>하는 데 중점으로 두었습니다.</div><br/>
        <ul>
          <li><strong>캘린더 기반 스케줄 관리</strong> : 직관적인 캘린더 UI를 제공함으로 모든 일정을 한 눈에 확인하고 <strong>드래그 앤 드롭(Drag & Drop) 기능</strong>을 통해 일정을 빠르게 조정할 수 있습니다.(FullCalendar.js 활용) 또한, 각 일정에는 <strong>툴팁(Tooltip)</strong>이 제공되어 간략한 정보를 확인할 수 있어 정보 접근성을 높였습니다.</li>
          <li><strong>유연하고 안정적인 일정 처리</strong> : 일정 등록 시 <strong>카테고리(행사/공연,기타)</strong>를 나누어 관리하며, 특히 '행사/공연' 카테고리 선택 시 <strong>등록된 있는 콘서트 데이터를 자동으로 불러와</strong> 일정에 필요한 정보를 편리하게 채워줍니다. <strong>AJAX 통신</strong>을 통해 <strong>실시간으로 데이터</strong>를 처리하고 <strong>트랜잭션 관리</strong>를 하여 <strong>데이터의 일관성과 무결성</strong>을 보장합니다.(@Transactional 활용) 또한, <strong>'하루 종일'일정 처리 로직</strong>을 포함하여 다양한 형태의 스케줄을 정확하게 관리할 수 있습니다.</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>3. 그 외 기능</strong></caption>
    <tr>
      <th colspan="2">
        <img src="https://github.com/user-attachments/assets/fa909ef5-268a-4490-9dae-3a9cd37b7661">
      </th>
    </tr>
    <tr>
      <td colspan="2" align="center">직원 메인페이지</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/11bd368c-679b-44cd-aa80-e12dfdddd6cd">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/5ccd280e-9a5d-4065-875c-4956e3f91538">
      </th>
    </tr>
    <tr>
      <td align="center">아티스트 커뮤니티 - 게시물 관리</td>
      <td align="center">아티스트 커뮤니티 - 라이브 요약</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/0e6c0ede-ec44-4400-9f9b-f42242cc0954">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/0148603c-db7c-4f16-a0c2-c11810bf84aa">
      </th>
    </tr>
    <tr>
      <td align="center">아티스트 커뮤니티 - 공지사항 관리</td>
      <td align="center">콘서트 관리 - 콘서트 일정 관리</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/4d06fe1f-5a97-4c01-a606-9b901ed5a81b">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/18a91f87-1a44-400c-bb57-06b3a0aa2551">
      </th>
    </tr>
    <tr>
      <td align="center">콘서트 관리 - 콘서트 좌석 관리</td>
      <td align="center">오디션 관리 - 지원자 정보</td>
    </tr>
    <tr>
      <th colspan="2">
        <img src="https://github.com/user-attachments/assets/c320488d-e4bb-412f-9d8e-9b55f7a1a4c5">
      </th>
    </tr>
    <tr>
      <td colspan="2" align="center">오디션 관리 - 일정 관리</td>
    </tr>
  </table>

- **관리자**

  <table>
    <caption align="center"><strong>1. 신고 및 블랙리스트 관리</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/3c8550de-8ba3-44d6-bdfe-7cf38a25b7bc">
      </th>
    </tr>
    <tr>
      <td>
        <div>부적절한 활동으로 신고된 사용자들을 관리하여, 신고 사유와 신고 내역을 제공하여 운영 효율성을 극대화합니다. 이를 통해 서비스의 안정성과 신뢰성을 확보하는데 중점을 두었습니다.</div><br/>
        <ul>
          <li><strong>종합적인 신고 관리 및 유연한 제재</strong> : 신고 사유별 신고 목록을 파악부터 개별 신고 상세 내역, 그리고 이전 신고 이력까지 통합적으로 확인합니다. 이를 기반으로 다양한 유형의 신고를 처리하며, 단순 경고를 넘어 기간제 차단 및 영구 차단에 이르는 유연한 제재 방안을 제공합니다. 필요시 즉시 해제 기능으로 신속한 상황 대응이 가능합니다</li>
          <li><strong>투명하고 견고한 시스템 운영</strong> : 모든 신고 및 블랙리스트 조치에 대한 상세 사유와 담당 관리자 정보를 명확히 기록하여 관리 업무의 투명성을 보장합니다. 더불어 해제된 항목 버튼 비활성화와 같은 논리적인 제어 및 CSRF 방어 보안 기술을 적용하여 시스템의 안정성과 신뢰도를 한층 더 높였습니다.</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>2. 굿즈샵 관리</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/efae9f11-84d5-4afd-9ca9-3f6ff5ffe440">
      </th>
    </tr>
    <tr>
      <td>
        <div> 복잡한 운영 업무를 <strong>간소화</strong>하고, <strong>통계 데이터를 제공하여 굿즈샵의 지속적인 성장을 목표</strong>로 합니다. <strong>주문, 취소, 품목, 공지사항</strong>와 같은 <strong>핵심 데이터를 효율적이고 안정적으로 제어</strong>를 중점으로 두었습니다.</div><br/>
        <ul>
          <li><strong>데이터 관리 및 자동화, 비즈니스 통찰력 제공</strong> : <strong>주문, 취소, 품목, 공지사항 핵심 데이터를 검색, 필터링, 페이지네이션하며 관리</strong>합니다. <strong>트랜잭션 관리</strong>를 하여 <strong>데이터의 일관성과 무결성</strong>을 보장합니다.(@Transactional 활용) 또한, <strong>다양한 시각화된 차트</strong>를 통해 굿즈샵의 상태를 <strong>직관적으로 파악</strong>하고 데이터 기반의 <strong>합리적인 의사결정을 지원</strong>합니다.(Chart.js 활용)</li>
          <li><strong>안정적인 직관적인 운영 환경</strong> : <strong>SpringSecurity 및 CSRF 방어 구현</strong>으로 <strong>보안 조치를 적용하여 안정성을 높였습니다.</strong> 사용자 인터페이스와 경험(UI/UX)를 직관적으로 제공하여 <strong>업무 효율을 향상</strong>시켰으며, 텍스트 편집기를 지원하여 <strong>풍부한 콘텐츠 작성을 지원</strong>합니다.(CKEditor5 활용)</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>3. 고객센터 관리</strong></caption>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/029baf6c-ac9e-4248-ae5e-47c35875566e">
      </th>
    </tr>
    <tr>
      <td>
        <div>1대1문의와 FAQ의 핵심 데이터를 효율적으로 고객지원 업무를 수행하고, 빠르고 정확한 정보를 제공하는 것을 중점으로 두었습니다.</div><br/>
        <ul>
          <li><strong>통합적이고 효율적인 고객 지원 시스템 구축</strong> : <strong>1대1문의와 FAQ를 함께 제공하여</strong>, 다각적인 고객 지원 채널을 구축하고 <strong>고객 지원 프로세스를 통합하여 운영 효율성을 극대화</strong>합니다.</li>
          <li><strong>편의성과 시스템 안정성 확보</strong> : 텍스트 편집기를 지원하여 <strong>풍부한 콘텐츠 작성을 지원합니다.</strong>(CKEditor5 활용) <strong>검색/필터링 및 페이징과 같은 관리 기능으로 업무 편의성을 높였습니다.</strong> 또한, <strong>Spring Security를 통한 인증 및 권한 관리</strong>를 통해 모든 관리 활동에 대한 <strong>책임 추적성을 확보하여 시스템의 안정성과 신뢰성을 강화</strong>합니다.</li>
        </ul>
      </td>
    </tr>
  </table>
  <table>
    <caption align="center"><strong>4. 그 외 기능</strong></caption>
    <tr>
      <th colspan="2">
        <img src="https://github.com/user-attachments/assets/ac656c92-2d2d-4815-bde1-32b1d4c155ad">
      </th>
    </tr>
    <tr>
      <td colspan="2" align="center">관리자 메인페이지</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/d213aff5-a7a6-4261-9edc-115cde6e1b6d">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/71b2f574-125e-4f69-bee4-6d0a8b5e7ba0">
      </th>
    </tr>
    <tr>
      <td align="center">아티스트 커뮤니티 관리 - 회원관리</td>
      <td align="center">아티스트 커뮤니티 관리 - 그룹관리</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/1a880891-0d73-4673-aa56-15c4e430b66c">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/32028b60-52a2-4303-b9d0-a1881832be26">
      </th>
    </tr>
    <tr>
      <td align="center">아티스트 커뮤니티 관리 - 아티스트 관리</td>
      <td align="center">공지사항 관리</td>
    </tr>
    <tr>
      <th>
        <img src="https://github.com/user-attachments/assets/85ed59a4-7584-428b-a88c-5a4d0cf9d7b5">
      </th>
      <th>
        <img src="https://github.com/user-attachments/assets/204bdba1-0a6c-4b99-b9ab-c3a1fb64df1c">
      </th>
    </tr>
    <tr>
      <td align="center">전자결재 - 상신 문서함</td>
      <td align="center">전자결재 - 받은 결재/참조 문서함</td>
    </tr>
    <tr>
      <th colspan="2">
        <img src="https://github.com/user-attachments/assets/a06bf0dc-7c83-46ed-8daf-c29d28ab1279">
      </th>
    </tr>
    <tr>
      <td colspan="2" align="center">전자결재 - 기안서 작성</td>
    </tr>
  </table>

# ⛳개선 목표

### 1. 수동 데이터 입력을 자동화로 작업으로 개선
- **직원**은 아티스트의 일정관리, 콘서트 관리 등, **관리자**는 신고, 블랙리스트 관리, 고객센터, 굿즈샵 관리 등에서 **수동 데이터 입력을 자동 작업의 필요성을 느낌**

- **상세** : 먼저 데이터를 비동기 처리, 스케줄링 기능, 오류 발생 가능성을 생각했을 때 **백엔드 로직** 수정 후 안정성과 효율성을 위해서 **데이터베이스** 수정이 완료가 된다면 사용자 **UI/UX**를 수정
  
- **직원 기능 변경 후 모습** :<br/> 1. **일정관리**에서 다양한 카테고리를 설정하여 카테고리 선택 시 해당 카테고리에 맞는 일정을 선택 시 해당 **일정의 정보를 자동으로 입력**<br/>
  2. **콘서트 일정 등록 시** 스케줄에도 **자동으로 등록**
- **관리자 기능 변경 후 모습** :<br/> 1. **신고, 블랙리스트** 조치를 다양하게 설정, 조치시 결과를 자동으로 **문자로 전송**<br/> 
  2. **고객센터**에서 중복 문의가 많은 경우 **FAQ의 질문과 답변이 자동으로 입력** 후 등록<br/> 
  3. **굿즈 배송 내역 변경 시** 마다 **자동으로 문자로 전송**<br/> 
  4. **신상품 등록 시** 자동으로 신상품 **알림 전송**


- **기대효과** : 직원, 관리자의 **업무 효율**을 높이고 **상황에 맞는 빠른 대처**를 행함으로 **운영관리가 크게 향상**을 기대함

### 2. 사용자 경험(UX) 인터페이스 개선 및 기능 확장
- **커뮤니티, 굿즈샵, 콘서트 이용 시** 다양한 기능을 가지고 있는 **사이드 메뉴가 필요성**과 시각 장애인 등 **다양한 사용자**들이 사이트를 이용시 불편함과 커뮤니티 내 **비속어 필터의 필요성**, 아티스트의 **음원을 BGM으로 설정**할 수 있는 기능 추가

- **상세** : **계산기, 주문내역, 챗봇 등**을 사이드 메뉴로 추가, **웹 콘텐츠 접근 지침**을 준수하여 JSP파일 작성, 구글 Perspective API 등 **AI기반 필터링 외부 API를 추가**, **spotify API를 활용**하여 BGM 기능 구현

- **변경 후 모습** :<br/> 1. **사이드 메뉴를 이용**하여 어느 페이지를 이용하여도 **다양한 기능을 활용 가능**<br/>
  2. **웹 콘텐츠 접근성**을 기준으로 적용하여 **다양한 사용자**가 사이트를 이용해도 불편함 없이 **이용 가능**<br/>
  3. 커뮤니티 내 **비속어 사용 시** 경고창 노출 후 비속어 **입력 불가**<br/>
  4. 커뮤니티 내 또는 아티스트 프로필 확인 시 해당 아티스트의 음원을 **BGM을 키고 끌 수 있도록 설정 가능**
 
- **기대효과** : 사용자가 **사이트를 이용하기 편리**하고다양한 기능을 접함으로 **사이트 이용 횟수가 크게 향상**을 기대함

# 📝프로젝트 후기

### 🧑박건우(PL)
계절이 세 번 바뀌는 7개월 동안, 처음 접한 코딩의 세계는 매우 낯설고 어려웠습니다. 하지만 친절하신 교수님들 덕분에 비전공자도 포기하지 않으면 멋진 결과물을 만들 수 있다는 것을 느낄 수 있었습니다. 제 인생에서 이렇게 무언가에 몰두하고 치열하게 고민한 적은 처음이었습니다. 특히 실시간 라이브 방송과 채팅 기능을 구현하며 수많은 밤을 지새웠던 경험은, 실무적인 역량을 키우고 훌륭한 신입 개발자로 한 발짝 다가설 수 있게 된 소중한 경험이었습니다. 이 값진 경험을 항상 마음에 새기겠습니다. 부디 저를 믿고 따라준 팀원들의 앞날에 따뜻한 봄(Spring)이 찾아오길 바랍니다. 다시 한번 이끌어주신 교수님들, 동료들 그리고 팀원들에게 감사의 인사를 전합니다.

### 👩강유정(AA/sub PL)
7개월간의 네이버인재개발원 IT 전자정부 프레임워크 & 리액트 4기 과정을 통해 JAVA와 SPRING 기반의 실무 역량을 키워주신 교수님들께 진심으로 감사드립니다. 사실 비전공자로써 시작이 막막하기도 했지만, 교수님들의 따뜻한 응원 덕분에 힘을 낼 수 있었습니다. 졸업 프로젝트에서 기능 구현에 어려움이 있을 때마다 팀원들과 함께 코드를 분석하고, 해결 방안을 논의하며 즐겁게 극복했습니다. 서로 상처주고 배려했던 1조 팀원들 덕분에 프로젝트를 성공적으로 마친 것 같아 정말 고맙습니다.💜 대덕인재개발원에서 얻은 이 소중한 경험을 발판 삼아 저뿐만 아니라 305호 모든 동기들이 각자의 자리에서 꾸준히 성장해가는 멋진 개발자가 되기를 진심으로 응원하겠습니다!

### 👦김승연(TA)
저는 이번 프로젝트에서 TA로서 로그인/회원가입, 전자결제를 개발하고 팀원들이 기술적 난관에 부딪혔을 때 함께 해결책을 모색하며 프로젝트 성공에 기여할 수 있었던 점이 가장 보람 있었습니다. 7개월 동안 Java, Spring Boot, JavaScript 등 새로운 기술을 배울 수 있도록 이끌어주신 교수님들께 감사드리며, 끝까지 함께 해준 팀원들에게도 진심으로 감사하다는 말씀을 전하고 싶습니다.

### 👱🏼‍♀️이혜리(QA/UA)
처음에 아무것도 몰라 걱정도 되었고, 프로젝트 하며 느려서 답답한 부분도 있었을 텐데 교수님들과 동기들이 옆에서 많이 도와주고 격려해줘서 무사히 마칠 수 있었던 것 같아 정말 고맙다는 말을 하고 싶었습니다. 또한 7개월이라는 시간이 길게만 느껴졌는데 벌써 수료를 하는 걸 생각하니 뭔가 후련하면서 앞으로가 두렵지만 이 네이버인재개발원에서의 경험을 가지고 저 뿐만이 아니라 모두 사회나가서도 지금처럼 열심히 해나갔으면 좋겠습니다.

### 👨🏻‍🦱김예찬(DA)
안녕하세요 DA 김예찬입니다. 최종 프로젝트에 들어서면서 조원들이 각자 맡은 파트도 열심히 해서 트러블 없이 잘 마무리 될 수 있었던 것 같습니다. 팀 프로젝트를 하며 협업의 중요성을 많이 느낀 소중한 경험이었습니다. 다들 수료 이후에 원하는 곳에 취업했으면 좋겠습니다. 마지막으로 심심찮게 많이 봐주신 교수님들 감사합니다. 이상입니다.

### 🧑🏽‍🦱박철순(BA)
누군가 저에게 개발원에서 무엇을 배웠냐고 물어보면 실패에 대한 두려움을 이기는 방법을 배웠다고 말하고 싶습니다. 팀원들과 함께 프로젝트를 진행하면서 많은 실패와 장애물들을 마주했지만 오히려 실패를 통해서 해결하는 과정을 통해서 배우고 성장하고 있다는 걸 느꼈습니다. 실패할까봐 하는 두려움이 오히려 기회라고 생각이 들었고 결국에는 해냈다는 성취감을 얻었습니다. 팀원과 함께 보폭을 맞춰 길을 걸어가는 동안 믿고 손 놓지 않아서 너무 감사했습니다. 모두 무운을 빕니다.

### 👩🏻‍🦰원지은(QA/UA)
7개월 간 함께 공부하고 프로젝트를 하면서, 힘들고 어려운 일도 저희 조원들 덕에 이겨낼 수 있었어요! 정말 정이 많이 들어서 끝이라는 게 너무 아쉽고 슬프네요. 당장 내일이라도 다시 나와야 할 것 같아요. 하지만 305호의 여정은 이제부터 시작이라 생각합니다! 앞으로 펼쳐질 여러분의 길을 항상 응원하겠습니다 화이팅! 그리고 항상 친절하게 알려주신 선생님들께도 감사하던 말씀 드리고 싶습니다 감사합니다!
