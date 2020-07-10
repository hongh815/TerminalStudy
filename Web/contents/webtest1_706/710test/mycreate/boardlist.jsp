<%@page import="vo.boardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String pagein = request.getParameter("page"); 
int pagenum = 1;
if(pagein != null) {
	pagenum = Integer.parseInt(pagein);
}
%>

<%BoardDAO dao = new BoardDAO();
ArrayList<boardVO> list = dao.getBoardList(pagenum, 5);
%>

<table border="3">
<tr><td>번호</td><th>제목</th><th>작성자</th><th>조회수</th></tr>
<%
for(boardVO vo : list) {
	out.println("<tr>");
	out.println("<td>" + vo.getSeq() + "</td>");
	out.println("<td>" + vo.getTitle() + "</td>");
	out.println("<td>" + vo.getWriter() + "</td>");
	out.println("<td>" + vo.getViewcount() + "</td></tr>");
%>
}
</table>
</body>
</html>