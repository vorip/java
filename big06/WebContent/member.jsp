<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
%><!-- 선언문 : 전역변수 사용, 메소드사용-->
<!-- 스크립트릿 : 자바 코드가 들어가는 부분.(service())-> 지역변수! -->
<!-- 메소드 정의 할 수 없음. 전역변수 사용 불가! -->
<%
	/* HttpServletRequest requst = new HttpServletRequest(); */
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String[] hobby = request.getParameterValues("hobby");
	String result="";
	for(int i=0;i<hobby.length;i++){
		result+=hobby[i]+" ";
	}
%>
<h1>당신이 입력한 정보는 아래와 같습니다.</h1>
<hr color = "blue">
ID : <%= id %><br>
표현식 연산결과 출력:<%= 100+200 %><br>
PW : <%= pw %><br>
Name : <%= name %> <br>
Tel : <%= tel %><br>
취미 : <%= result %>

</body>
</html>