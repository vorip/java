<%@page import="bean.NoticeDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.NoticeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%! NoticeDAO dao = new NoticeDAO(); %> --%>
	<jsp:useBean id="dto" class="bean.NoticeDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	
	<%
			NoticeDAO dao = new NoticeDAO();
			ArrayList<NoticeDTO> list= dao.selectAll();
			int i=0;
			NoticeDTO conDto = null;
			while(i<list.size()){
				conDto = list.get(i);
				String info=conDto.toString();
			%>
						<a href = "post2.jsp?info=<%= info %>"><%= conDto.getTitle() %>
						<%= conDto.getName() %>
						<%= conDto.getContent() %>
						<%= conDto.getTime() %>
						<%= conDto.getUnum() %></a><br>
	 	<%
	 	i++;
			} %> 

</body>
</html>