<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- request 내장객체 : 요청정보 저장 객체 -->
<h3> 클라이언트IP : <%= request.getRemoteAddr() %></h3>
<h3> 컨텐츠타입 : <%= request.getContentType() %></h3>
<h3> 요청방식 : <%= request.getMethod() %></h3>
<h3> 요청파일 : <%= request.getRequestURI() %></h3>
<h3> 서버이름 : <%= request.getServerName() %></h3>
<h3> 포트번호 : <%= request.getServerPort() %></h3>
<h3> 브라우저 : <%= request.getHeader("user-agent") %></h3>
<h3> 컨텍스트명 : <%= request.getContextPath() %></h3>

request.getParameter("page");

second/first/a.jsp --> second/test/b.jsp 전송
a.jsp 파일
</form>
</body>
</html>