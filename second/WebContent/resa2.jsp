<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String[] hospitalInfo = request.getParameter("data").split(",");
	String address = hospitalInfo[1].substring(5,hospitalInfo[1].length()-1);
%>
<div style="display: block; margin-left: auto; margin-right: auto; background: black; width: 750px; height: 1000px; margin-top : 140px;">
	<div style="background: green; width: 750px; height: 240px;">
			<h1 align="center" style="padding-top: 30px;"><%= hospitalInfo[0] %></h1>
		<div style="background: white;">
			<center><table>
				<tr>
					<td align="center">정형외과</td>
					<td align="center" style="padding-left:6px; padding-right: 6px;">|</td>
					<td align="center">평점</td>
					<td align="center" style="padding-left:6px; padding-right: 6px;">|</td>
					<td align="center">리뷰</td>
				</tr>
			</table></center>
		</div>
	</div>
</div>

</body>
</html>