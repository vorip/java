package 생성자;

public class Tour {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("white",true);
		Car car3 = new Car("red");
		car1.color="Black";
		car1.convertible=true;
		System.out.println(car1);
		car1.change();
		int exSpeed = car1.speedUp(70);
		System.out.println(exSpeed+"km로 속도를 UP");
		System.out.println(car2);
		System.out.println(car3);
		
		
	}

}
