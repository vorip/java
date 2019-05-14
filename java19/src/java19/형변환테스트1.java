package java19;

public class 형변환테스트1 {

	public static void main(String[] args) {
		//형변환(type change : 타입 변환, casting, 캐스팅)
		
		//기본형 형변환
		
		//메모리 크기가 작은 > 큰 : 자동형변환
		byte a = 127;
		int b = a;
		//큰>작 : 강제 형변환
		int c = 2000;
		byte d = (byte)c;
		System.out.println(d);
		
		//참조형 형변환(클래스의 형변환)
		
		//상속관계에 있는 클래스들만 형변환 가능
		//작(자식)->큰(부모) : 자동형변환(업캐스팅)
//		Car car = new Car();//부모(크다)
//		Truck truck = new Truck();//자식(작다)
//		car = truck;//up casting
		
		//큰(부모)->작(자식) : 강제형변환(다운캐스팅)
//		truck = (Truck)car;//down casting
	}

}
