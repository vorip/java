package 클래스;

public class 거실 {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company = "사과";
		p1.shape = "네모";
		p1.size = 11;
		
		System.out.println(p1.toString());
		System.out.println("---------------------");
		
		//메소드 사용(call, 부른다.)
		String name = p1.call();
		System.out.println(name+"과 통화를 하다.");
		System.out.println(p1.call());
		
		System.out.println(p1.alarm()+ "시에 알람을 맞췄습니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
