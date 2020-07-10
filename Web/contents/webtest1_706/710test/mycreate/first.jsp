<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%-- page 안에 import 는 여러개 가능하나 contentType이나 다른 속성들은 하나만 가능하다. --%>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%--기본적으로 자바객채를 이해하고 실행 가능한 언어 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Date now = new Date();
SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String file = "login.html";
%>
<%
String test = "주석 테스트";
%>

<h1>현재시각 : <%=f.format(now)%></h1>
<h2><a href="<%=file%>">링크이동</a></h2>
<h3><%=test %></h3>

<%-- 주석 사용시 위의 값처럼 java입력 이 되어있는 것들은 이것처럼 주석을 설정하고 --%>
<!-- 이렇게 html 문장만 있는 것들은 이 주석을 사용하길 바란다 -->
<!-- 자바소스로 된 것들은 페이지 소스에서 보이지 않는데 
	이는 자바소스는 웹서버로 보내지지만 html소스는 브라우저로 바로 보내기 때문이다 -->
<%
//C:\eclipse\workspace.web\.metadata\.plugins\org.eclipse.wst.server.core
//  \tmp0\work\Catalina\localhost\second\org\apache\jsp 에서 first.jsp가 있고,
// 의 _jspService 메소드의 지역변수에 저장되어 있다.
String local = "지역변수";
%>
<%!
String field = "필드변수";
%>
<%!
// jsp -> 자바 클래스 소스 변환 --> <%! % >태그 외의 문장들 _jspService 메소드=main
public String m() {
	return field + ":" + local;
}
%>
<%=m() %>

</body>

</html>