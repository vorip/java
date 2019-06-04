function sign(){
	var id = document.querySelector("#id").value;
	var pw = document.querySelector("#pw").value;
	var name = document.querySelector("#name").value;
	var tel = document.querySelector("#tel").value;
	location.href="sign.jsp?id="+id+"&pw="+pw+"&name="+name+"&tel="+tel;
	alert("회원가입이 완료되었습니다.")
}
	
function buy(){
	alert("상품의 구매가 완료되었습니다. ");
}
