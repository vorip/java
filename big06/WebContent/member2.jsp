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
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String day = request.getParameter("day");
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");
%>
당신이 입력한 정보
ID : <%= id %><br>
PW : <%= pw %><br>
Name : <%= name %><br>
Birth : <%= year %>년 <%= month %>월 <%= day %>일<br>
Gender : <%= gender %><br>
Email : <%= email %><br>
Tel : <%= tel %><br>

</body>
</html>