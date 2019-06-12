<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function deletePost(){
		var data = prompt('삭제하시려면 "삭제" 를 입력해주세요');
		
		if(data=="삭제"){
			alert("삭제되었습니다.");
			location.href = "suggnotice.jsp";
		}
	}
	
</script>
</head>
<body>
	<%
		String info = request.getParameter("info");
		String[] info2 = info.split(",");
	%>
	<%= info2[0] %>
	<%= info2[1] %>
	<%= info2[2] %>
	<%= info2[3] %>
	<%= info2[4] %><br>
	<button onclick = "deletePost()">삭제</button>
	<button >수정</button>
</body>
</html>