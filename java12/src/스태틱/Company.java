package 스태틱;

public class Company {
	String name;
	char gender;
	int age;
	static int cnt;
	static int sumAge;
	
	public Company() {
		cnt++;
	}
	public Company(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		cnt++;
		sumAge += age;
	}
	
	@Override
	public String toString() {
		return "Company [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	static void work() {
		System.out.println("일을 한다.");
	}
	void friendly() {
		System.out.println("친화력이 있다.");
	}
	
}
