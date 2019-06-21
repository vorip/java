<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#div{
position: absolute;
right: 430px;
top : 463px;
font-size: 12px;
}
#png5{
	position: absolute;
	left : 428px;
	top : 515px;
}	
#top10{
	position:absolute;
	left : 455px;
	top : 515px;
}
#top10_0{
	position: absolute;
	left : 455px;
	top : 405px;
}
#top10_1{
	position: absolute;
	top : 563px;
	left : 455px;
}
.top10_2{
	position: absolute;
	top : 595px;
	left : 455px;
}
#top10_2{
	left : 555px;
}
#top10_3{
	position: absolute;
	top : 630px;
	left : 455px;
}
</style>
</head>
<body>
<%
	String[] hospitalInfo = request.getParameter("data").split(",");
	String address = hospitalInfo[1].substring(5,hospitalInfo[1].length()-1);
	Calendar cal = Calendar.getInstance();
	String today;
	String str = (cal.get(Calendar.YEAR) + "");
	today = str + "." + (cal.get(Calendar.MONTH) + 1) + "."
			+ cal.get(Calendar.DATE);
%>
<div style="display: block; margin-left: auto; margin-right: auto; width: 750px; height: 1000px; margin-top : 140px;">
	<div style="width: 750px; height: 240px; padding-top: 50px; padding-bottom: 10px;">
			<h1 align="center" style="padding-top: 30px;"><%= hospitalInfo[0] %></h1>
		<div style="background: white;">
			<center><table>
				<tr>
					<td align="center">정형외과</td>
					<td align="center" style="padding-left:8px; padding-right: 8px;">|</td>
					<td align="center">평점</td>
					<td align="center" style="padding-left:8px; padding-right: 8px;">|</td>
					<td align="center">리뷰</td>
				</tr>
			</table></center>
			<center><table style="padding-top: 15px;">
				<tr>
					<td align="center"><a href=""><img src="1.png"></a></td>
					<td align="center" style="padding-left:25px; padding-right: 25px;"><a href=""><img src="2.png"></a></td>
					<td align="center"><a href=""><img src="3.png"></a></td>
					<td align="center" style="padding-left:25px;"><a href=""><img src="4.png"></a></td>
				</tr>
			</table></center>
		</div>
		<hr color="gray">
		<div style="height: 258px;">
			
			<h3 id="top10_0" style="padding-top: 35px;">상세 정보</h3><div id="div" style="color: gray;"><span>업데이트 <%= today %></span><span style="padding-left: 7px; padding-right: 7px;">|</span><span><a style = "color: gray;" href="">틀린정보 신고</a></span></div>
			<span id="top10"><%= address %></span><br>
			<a id = "top10_1" href="http://mgr.kgitbank.com">http://mgr.kgitbank.com</a><br>
			<span class = "top10_2"><%= hospitalInfo[2] %></span><span class="top10_2" style="color : gray; padding-left: 8px;" id="top10_2">대표번호</span><br>
			<span id = "top10_3">경력있는 의료진과 깨끗한 시설이 장점</span>
			<a href="" id="png5"><img src="5.png"></a>
		</div>
		<hr color="gray">
	</div>
</div>

</body>
</html>