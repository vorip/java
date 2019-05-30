package String테스트;

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "winner";//winner 생성 후 주소값 저장
		String s2 = "success";//success 생성 후 주소값 저장
		String s3 = "winner";//winner라는 값이 있는지 메모리에서 찾은 후 없으면
		// 생성 후 주소값 저장, 있으면 그 곳의 주소값 저장
		String s4 = new String("winner"); 
		//String은 값을 변경하면 새로운 값을 할당 후 주소값을 저장
		
		
		StringBuffer s5 = new StringBuffer("winner");//새로운 값 할당 후 주소값 저장.
		//값을 변경하면 실제 값이 변경됨. 주소값은 변하지 않음
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}

}
