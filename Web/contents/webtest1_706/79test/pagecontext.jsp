<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- String m(){
	return "pagecontext.jsp";
}
--%>

<%! void s(PageContext p) throws IOException { //그냥은 출력되지 않는 메소드를 출력 가능하게 만들어주는 클래스
	p.getOut().println("pagecontext.jsp");
}
%>
<%= s(pageContext) %>
</body>
</html>