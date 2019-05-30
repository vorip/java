package 인터페이스2;

public class CarUser {
	public static void main(String[] args) {
		Car car = new MelonCar();//new BananaCar();
		car.start();
		car.speedUp();
		car.speedDown();
	}
}
