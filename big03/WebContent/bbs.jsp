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
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	String pw = request.getParameter("pw");
	String[] hobby = request.getParameterValues("hobby");
	for(int i=0;i<hobby.length;i++){
		out.print(hobby[i]+"<br>");
	}
%>

제목 : <%= title %><br>
내용 : <%= content %><br>
작성자 : <%= writer %><br>
비밀번호 : <%= pw %><br>
음식 : ${param.food}<br>
성별: ${param.gender}


</body>
</html>