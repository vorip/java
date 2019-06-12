<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<% 
		String id = request.getParameter("id");
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = dao.select(id);
		if(dto!=null){
	%>
		<h3 class="bg-dark text-white">검색결과입니다! 수정이 가능합니다.</h3>
		<form action = update1.jsp>
			<input class="form-control-plaintext" type = "text" name = "id" value="<%=dto.getId() %>" readonly="readonly"><br>
			<input class="form-control-plaintext" type = "text" name = "title" value="<%=dto.getTitle() %>"><br>
			<input class="form-control-plaintext" type = "text" name = "content" value="<%=dto.getContent() %>"><br>
			<input class="form-control-plaintext" type = "text" name = "etc" value="<%=dto.getEtc() %>"><br>
			<button type = "submit" onclick = "update1.jsp" class="btn btn-success">수정하기!</button>
		</form>
		<form action = "delete.jsp">
			<input type = "hidden" name = "id" value="<%=dto.getId() %>">
			<button type = "submit" onclick = "delete.jsp" class="btn btn-danger">삭제하기!</button>
		</form>
	<%} %>
	

</body>
</html>