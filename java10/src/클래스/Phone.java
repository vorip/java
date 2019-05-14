package 클래스;

public class Phone {
	//변수(멤버변수)
	String shape;
	int size;
	String company;
	
	//생성자
	
	
	//메소드(멤버메소드)
	public String call() {
		
		return "친구";
	}
	public void text() {
		System.out.println("문자하다.");
	}
	public int alarm() {

		return 6;
	}
	@Override
	public String toString() {
		return "Phone [shape=" + shape + ", size=" + size + ", company=" + company + "]";
	}

	
}
