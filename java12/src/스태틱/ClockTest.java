package 스태틱;

public class ClockTest {

	public static void main(String[] args) {
		Clock c1 = new Clock(1000,"롤렉스");
		Clock c2 = new Clock(10000,"내시계",12,"렉스");
		Clock c3 = new Clock(100000,11,"스렉");
		
		System.out.printf("가격 : %d 회사이름 : %s\n",c1.price,c1.company);
		System.out.printf("가격 : %d 회사이름 : %s\n",c2.price,c2.company);
		System.out.printf("가격 : %d 회사이름 : %s\n",c3.price,c3.company);
		
	}

}
