package 클래스;

public class 계산기 {
	
	
	
	//자바는 메소드 이름을 동일하게 할 수 있다.
	//하나의 이름으로 동일한 기능을 표현하게 하는 기능
	//다형성(overloading, 오버로딩)
	//입력값에 사용되는 변수를 매개변수(파라미터,parameter)
	
	public int add(int num1) {
		int sum=0;
		
		return sum+=num1;
	}
	
	public void devide(int num1,int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다");
		}else {
			System.out.println(num1/num2);			
		}
	}
	public void subtract(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public void multiple(int num1, int num2) {
		System.out.println(num1*num2);
	}

}
