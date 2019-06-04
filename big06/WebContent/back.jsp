<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%! String color; %>
<%
	color = request.getParameter("color");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="<%= color %>">
바탕색 선택하기<br>
<form action="back.jsp">
<input type="radio" name = "color" value="red">빨강
<input type="radio" name = "color" value="blue">파랑
<input type="radio" name = "color" value="pink">핑크
<input type="radio" name = "color" value="yellow">노랑<br>
<input type="submit" value="결정!">
</form>



</body>
</html>