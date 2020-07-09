
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {margin: auto;}
h1 {width: 400px; background-color: yellow; border: solid blue 3px; text-align: center;}
input {border: solid blue 3px;}
</style>
</head>

<body>
<h1>회원가입</h1>
<form action="insertresult.jsp">
	아이디 : <input type="text" name=id><br>
	암호 : <input type="password" name=password><br>
	이름 <input type="text" name=name><br>
	이메일<input type="email" name=email><br>
	폰: <input type="tel" name=phone><br>
	성별 : 
	<input type="radio" name=gender value="남자" > 남
	<input type="radio" name=gender value="여자" > 여<br>
	주소 <input type="text" name=address><br>
	<input type="submit" value="회원가입">
</form>

</body>
</html>