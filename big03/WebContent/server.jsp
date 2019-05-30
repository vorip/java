<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
%>
받아온 파라메터 값
<hr>
ID : <%= id %> <br>
PW : <%= pw %> <br>
Name : <%= name %> <br>
Tel : <%= tel %> <br>


</body>
</html>