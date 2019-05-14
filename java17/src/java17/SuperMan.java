package java17;

public class SuperMan extends Man {
	boolean fly;
	
	public void flySpeed() {
		System.out.println("500으로 날다.");
	}

	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", eye=" + eye + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
