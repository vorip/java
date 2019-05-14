package java20;

public class SuperMan extends Man{
	int height;
	String power;
	
	
	
	public SuperMan() {
		super();
	}
	public SuperMan(int height, String power) {
		super();
		this.height = height;
		this.power = power;
	}
	public SuperMan(String name, int weight, int height, String power) {
		super(name, weight);
		this.height = height;
		this.power = power;
	}
	
	

}
