
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
<% String id = "application";

MemberVO member = new MemberVO();
member.setMemberid("id");
member.setPassword("password");
member.setName("name");
member.setEmail("email@i.com");
member.setPhone("010-2222-4444");
member.setGender("여");
member.setAddress("서울시 구로구 구로동");
//공유 문자열 생성
application.setAttribute("id", id);
application.setAttribute("member", member); %>

<!-- MemberVO 에 값 세팅 -->

<h1> 공유를 완료했습니다. </h1>
</body>
</html>