<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>현재 jsp 실행 서버 정보 = <%=application.getServerInfo() %></h3>
<h3>현재 jsp 버전 = <%=application.getMajorVersion() %></h3>
<h3>현재 jsp 버전 .뒷자리 = <%=application.getMinorVersion() %></h3>
<!-- application = 전체 컨텍스트나 서버 정보를 가지고 있다. -->
</body>
</html>