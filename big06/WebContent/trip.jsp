<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String country;
	int count;
	String print;%>
<%
	country = request.getParameter("country");
	count = Integer.parseInt(request.getParameter("count"));
		
	if(count<3){
		print=country+"를 더 갈수도 있겠군요.";
	}else{
		print=country+"를 그만 가셔야겠군요.";
	}
%>
<%= print %>



</body>
</html>