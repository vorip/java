package String테스트;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "I am a java programmer";
		String s2 = "I am a java programmer";
		String s3 = "2011511";
		
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		//참조하고 있는 값을 비교
		System.out.println(s1==s2);
		//객체에 들어있는 주소값을 비교
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		System.out.println(s3.charAt(0));
		StringBuffer name = new StringBuffer("hello");
		System.out.println(name.charAt(0));
		System.out.println(s1.substring(1));//지정된 인덱스부터 끝까지 가져오기
		System.out.println(s1.substring(1,5));//1번이상5번미만 인덱스까지가져오기
		System.out.println(s1.substring(7,11));//java만 가져오기
		String[] result = s1.split(" ");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		String s5 = "Hi, Good Morning!";
		String[] result2 = s5.split(" ");
		System.out.println(result2.length);
		for (String ss : result2) {
			System.out.println(ss);
		}
		
		String[] result3 = s5.split(",");
		System.out.println(result2.length);
		for (String ss : result3) {
			System.out.println(ss);
		}
		String s6 = "Hi. Good Morning!";
		String[] result4 = s6.split("[.]");//.은 접근연산자와 같은 기호로 사용되기 때문에 []안에 넣어서 구분자로 이용해야 한다.
		System.out.println(result4.length);
		for (String ss : result4) {
			System.out.println(ss);
		}
		System.out.println(s6.indexOf("Good"));//String의 시작위치
		
		String s7 = "http://www.naver.com/member/index.jsp";
		System.out.println(s7.lastIndexOf("/"));
		System.out.println(s7.substring((s7.lastIndexOf("/")+1)));//index.jsp를 가져오기
		
		System.out.println(s6.toUpperCase());//대문자로
		System.out.println(s6.toLowerCase());//소문자로
		
		System.out.println(s6.replaceAll("Morning!", "Afternoon!"));
		
		char[] result6 = s6.toCharArray();//스트링을 char로 변환
		for (char c : result6) {
			System.out.println(c);
		}
		String s8 = "     hello!! win  !!   ";
		System.out.println(s8.trim());//공백제거
		
		System.out.println(s8.concat("final"));//문자열 붙이기
		System.out.println(s8.contains("hello"));//포함하고있는지(boolean타입리턴)
		String s9 = "winner class";
		System.out.println(s9.startsWith("winner"));//시작하는지
		System.out.println(s9.endsWith("ss"));//끝나는지
		
		String s10 = "hera@naver.com";
		if(s10.endsWith("com")) {
			System.out.println("닷컴회사군요");
		}else {
			System.out.println("닷컴회사가 아니군요");
		}
		
		
		
		
		
	}

}
