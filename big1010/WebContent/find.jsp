<%@page import="bean.MemberDTO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript">

</script>
</head>
<body>
	<!-- 스크립트 -->
	<%
			String id = request.getParameter("id");
			MemberDAO dao = new MemberDAO();
			MemberDTO dto = dao.select(id);
	%>
	<form action="update.jsp">
		ID : <input type="text" name="id" value="<%= dto.getId() %>" readonly="readonly"><br><!-- 표현식 -->
		수정할 PW : <input type="text" name="pw" value = "<%= dto.getPw() %>"><br><!-- 표현식 -->
		수정할 Name : <input type="text" name="name" value = "<%= dto.getName() %>"><br><!-- 표현식 -->
		수정할 Tel : <input type="text" name="tell" value = "<%= dto.getTel() %>"><br><!-- 표현식 -->
		<button type="submit" onclick = "update.jsp">제출</button>
	</form>
	

</body>
</html>