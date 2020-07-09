<%@page import="test.MemberVO"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
공유 데이터 읽어오기 =<%=application.getAttribute("id")%>
<!-- second의 컨텍스트에서 id라는 것을 공유할 게 있는지 찾자 -->

<% MemberVO member =
(MemberVO)application.getAttribute("member");
%>
<h3> 아이디 = <%= member.getMemberid() %> </h3>
<h3> 이름 = <%= member.getName() %></h3>
<h3> 주소 = <%= member.getAddress() %></h3>

<h3> <%= member %></h3>
</body>
</html>