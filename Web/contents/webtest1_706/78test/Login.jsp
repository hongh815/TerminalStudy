<%@page import="sun.awt.RepaintArea"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> <!-- 항상 여기 인코딩은 위의 인코딩값과같아야 텍스트값이 제대로 표현된다. -->
<title>Insert title here</title>
<style type="text/css">
#col {color: red;}
</style>
</head>
<body>


<!-- html태그 + /*< 자바 문장; %>*/ -->
<% 
		if(request.getMethod().equalsIgnoreCase("POST")) {
		
			request.setCharacterEncoding("UTF-8"); 
			// 위의 인코딩값을 일치 시켜서 모두 UTF-8 로 설정되어도 브라우저에서 입력한 한글은 깨진다. 함수값은 이것을 해결해준다.
		
			// id, pw input 태그 입력값 전송받는 것
			String id = request.getParameter("id"); //나에게서 선언되었던 id 읽어와라
			String pw = request.getParameter("pw");
			if(id.equals("jsp")) {
				if(pw.equals("1234")) { %>
					<h1> 아이디: <%=id %> 암호: <%=pw %> 정상적으로 로그인 되었습니다.</h1>
				<% } else {//비번이 아니면 출력버퍼를 모았다가 삭제 한다. %>
					
					<% response.sendRedirect("login.html"); //비번만 틀렸을시에 login.html로 이동%> 
				<% }
			} else {// id도 아니면
				//response.sendRedirect("insert.html"); //error 404
				response.sendRedirect("https://www.daum.net"); //id 와 pw 모두 틀릴시 다음으로 이동
			} 
%>
<!-- id 존재하나 pw 맞지 않는다. :: login.html로 이동
	id 도 맞지 않는다 :: insert.html로 이동 -->
	
<h1> 아이디 : <%=id %> 암호 : <%=pw %> 정상 로그인 완료 </h1>
<% } /*문을 닫는 중괄호*/ else { %>
	<h1> 접속할수 없습니다 </h1>
<% } %>

<!-- 기존의 out 값이 아닌 %=one의 값 출력문 -->
<%--<% //post 방식 get 방식 상관없이 불러오는 부분
	String[] pet = request.getParameterValues("pet");
	for(String one : pet) { --%>
<%--		<h1 id="col"><%=one --%> /*</h1>*/
	<%-- } --%> 



<% //out 내장객체 이용해서 pet값들 받아오는 수행문
String[] pet = request.getParameterValues("pet");
for(String one : pet) {
	out.println("<h1 id=\"col\">" + one + "</h1>");
}%>


<%--<% //login.jsp 를 request.jsp 로 대체
response.sendRedirect("http://localhost:8081/second/request.jsp");
--%>

</body>
</html>