<%@ page import="dao.MemberDAO"%>
<%@ page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String id = request.getParameter("id");
String password = request.getParameter("password");
String name = request.getParameter("name");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String gender = request.getParameter("gender");
String address = request.getParameter("address");

MemberVO vo = new MemberVO();
vo.setId(id);
vo.setPassword(password);
vo.setName(name);
vo.setEmail(email);
vo.setPhone(phone);
vo.setGender(gender);
vo.setAddress(address);

String driver = application.getInitParameter("driver");
String url = application.getInitParameter("url");
String account = application.getInitParameter("account");
String pw = application.getInitParameter("password");

MemberDAO dao = new MemberDAO(driver, url, account, pw);
dao.insertMember(vo);
%>


<h1> 아이디 : <%= vo.getId() %> 회원님 회원가입 되셨습니다 .</h1>


</body>
</html>