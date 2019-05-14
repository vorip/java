package 스태틱;

public class Person {
	int heigth;
	int weight;
	String secret;
	String address;

	public Person(int heigth, int weight, String secret) {
		this.heigth = heigth;
		this.weight = weight;
		this.secret = secret;
	}
	public Person(int heigth, int weight, String secret, String address) {
		this.heigth = heigth;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
	}
	public int getWeight() {
		return weight;
	}
	public String getSecret() {
		return secret;
	}
	public float getOWeight(int height) {
		return (height-100)*0.9f;
	}
	

}
