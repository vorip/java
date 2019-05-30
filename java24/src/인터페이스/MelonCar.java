package 인터페이스;

public class MelonCar implements Car {

	public void start() {
		System.out.println("메론 카 출발");
	}

	public void speedUp() {
		System.out.println("메론 카 속도UP");
	}

	@Override
	public void speedDown() {
		System.out.println("메론 카 속도Down");
	}

}
