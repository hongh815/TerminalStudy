<%@page import="dao.MemberDAO"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% MemberVO vo = new MemberVO();%>

<% 
String method = request.getMethod(); 
if(method.equals("POST")) {
		
	String driver = application.getInitParameter("driver");
	String url = application.getInitParameter("url");
	String account = application.getInitParameter("account");
	String password = application.getInitParameter("password");
	
	MemberDAO dao = new MemberDAO(driver, url, account, password);
	dao.insertMember(vo);
	String result = dao.selectMember(request.getParameter("memberid"), request.getParameter("password"));
	if(result.equals("<h1> 정상 로그인 시발것 </h1>")){  %>
	
	<jsp:include page="myinform.jsp"/>
	<%
} else {
	out.println(resulte);
}
else { %>
	<jsp:include page="loginform.jsp" />
<% }%>

</body>
</html>