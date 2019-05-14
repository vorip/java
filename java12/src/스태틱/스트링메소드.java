package 스태틱;

public class 스트링메소드 {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "A";
		System.out.println(s1.charAt(0));//첫글자
		System.out.println(s1.concat(s2));//결합
		System.out.println(s2.compareTo(s1));//둘 사이의 거리
		System.out.println(s1.equalsIgnoreCase(s2));//대소문자무시하고비교
		System.out.println(s1.isEmpty());//비어있는지 검사
		System.out.println(s2.length());//길이
		
		
	}
}
