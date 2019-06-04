<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="sign.css" type="text/css">
<link rel="stylesheet" href="main.css" type="text/css">
</head>
<body>
<div id="d1">
	
	<table   align="center">
		<tr>
			<td colspan="2" id = "td1">${param.id}님의 정보</td>
		</tr>
		<tr>
			<td class="t1">아이디</td>
			<td align="center" class="t2">${param.id}</td>
		</tr>
		<tr>
			<td  class="t1">패스워드</td>
			<td align="center" class="t2">${param.pw}</td>
		</tr>
		<tr>
			<td class="t1">이름</td>
			<td align="center" class="t2">${param.name}</td>
		</tr>
		<tr>
			<td class="t1">전화번호</td>
			<td align="center" class="t2">${param.tel}</td>
		</tr>
			<tr>
				<td colspan="2" class="t1"><a href = "sign.html">뒤로가기</a></td>
			</tr>
	</table>
</div>

</body>
</html>