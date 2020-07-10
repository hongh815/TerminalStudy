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
<!-- web.xml 을 편집한 내용을 기반으로 데이터를 불러오는 설정 -->
</body>
</html>