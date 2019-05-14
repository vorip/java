package 클래스;

public class 내방 {

	public static void main(String[] args) {
		Phone p1 = new Phone ();
		p1.company = "apple";
		p1.shape = "사각형";
		p1.size = 11;
		Phone p2 = new Phone();
		p2.company = "samsung";
		p2.shape = "사각형";
		p2.size = 13;
		
		
		System.out.println(p1.company);
		System.out.println(p1.shape);
		System.out.println(p1.size);
		p1.call();
		p1.text();
		p1.alarm();
		System.out.println("----------------------------");
		Tv tv1 = new Tv();
		
		tv1.color = "검정색";
		tv1.power = true;
		tv1.size = 50;
//		System.out.println(tv1.color);
//		System.out.println(tv1.power);
//		System.out.println(tv1.size);
		System.out.println(tv1.toString());
		
		tv1.changeCh();
		tv1.connect();
		tv1.sound();
		System.out.println("----------------------------");
		Tv tv2 = new Tv();
		
		//class를 복사해서 만든 tv2를 객체(대상,object)
		//new의 역할 : 객체 생성
		tv2.color = "투명";
		tv2.power = false;
		tv2.size = 50;

//		System.out.println(tv2.color);
//		System.out.println(tv2.power);
//		System.out.println(tv2.size);
		

		System.out.println(tv2.toString());
		tv2.changeCh();
		tv2.connect();
		tv2.sound();
		
		
	}

}
