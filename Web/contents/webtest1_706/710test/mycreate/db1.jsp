<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>db 정보를 읽어 옵니다</h1>
<h3>드라이버=<%=application.getInitParameter("driver") %></h3>
<h3>연결url=<%=application.getInitParameter("url") %></h3>
<h3>계정=<%=application.getInitParameter("account") %></h3>
<h3>암호=<%=application.getInitParameter("password") %></h3>

<% application.log(request.getRequestURI() + "db1.jsp의 로그를 가져옵니다."); %>
</body>
</html>