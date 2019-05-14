package 클래스;

public class Tv {
	boolean power;
	int size;
	String color;
	
	
	public void changeCh() {
		System.out.println("채널 변경하다.");
	}
	public void sound() {
		System.out.println("소리를 조절하다.");
	}
	public void connect() {
		System.out.println("잭을 연결하다.");
	}
	@Override
	public String toString() {
		return "Tv [power=" + power + ", size=" + size + ", color=" + color + "]";
	}


}
