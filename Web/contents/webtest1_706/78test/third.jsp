<%@ 
page buffer="1kb" autoFlush="true"
language="java" 
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>
<%-- buffer 버퍼 크기 지정 기본값은 8kb다 --%>
<%-- autoFlush 버퍼가 꽉차면 자동으로 비워준다 = true--%>
<%-- 404번 에러 : 서버에 해당하는 파일이 없다 --%>
<%-- 500번 에러 : 서버에 해당하는 파일이 있으나 다른 에러가 존재한다. --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> 버퍼 크기가 감소하는지 확인 </h2>
jsp파일 버퍼 크기=<%= out.getBufferSize() %><br>
현재 버퍼 크기=<%= out.getRemaining() %><br>

<%-- out.clearBuffer(); //위의 버퍼 내용 지우는 것.--%>
<% out.flush(); //지금까지의 버퍼의 내용을 웹클라이언트(웹브라우저)에 전송하고 버퍼내용을 비운다 %>
<h1>출력되나요?</h1>
</body>
</html>