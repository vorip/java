package String테스트;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.random());
		int num = (int)(Math.random()*10);
		System.out.println(num);
		
		double num2 = 12345.6789;
		System.out.println(Math.ceil(num2));//올림
		System.out.println(Math.floor(num2));//버림
		System.out.println(Math.round(num2));//반올림
		final double NUM = 1000;
//		NUM = 2000;//변경 불가.
		//상수는 한번 값을 초기화 후 변하지 않아야 하는
		//데이터를 넣어둘 때 사용
		//상수는 final을 키워드로 사용.
		//상수에 들어간 데이터는 변경 불가.
		//일반 변수와 비교하기 위해 대문자로 써두는 것이 국룰
		//final이 붙은 클래스는 상속을 받을 수 없다.(종단클래스)
		
		int num3 = -100;
		System.out.println(Math.abs(num3));//절대값
		
		int num4 = -200;
		System.out.println(Math.max(num3,num4));//최대값
		System.out.println(Math.min(num3,num4));//최소값
		int num5 = 3;
		System.out.println(Math.pow(num5, 2));//자동형변환
		
		Random r = new Random();
		r.setSeed(100);//랜덤을 실행하면 계속 같은 값이 나옴.
		for(int i= 0;i<100;i++) {
			System.out.println(r.nextInt(100));
		}
		
		
	}
}
