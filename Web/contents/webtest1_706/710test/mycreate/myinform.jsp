<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1> <%= request.getParameter("memberid") %> 회원님 환영합니다. </h1>
<ul>
<li> 주문 배송조회 </li>
<li> 주소변경 </li>
<li> 결제수단 </li>
<li> 장바구니 </li>
<li> <a href="/mycreateserverone/board/boardlist.jsp"> 게시판 가기</a> </li>
</ul>

</body>
</html>