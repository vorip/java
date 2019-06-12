package money;

public class BankDTO {
	private String id;
	private String name;
	private int age;
	private String tel;
	
	@Override
	public String toString() {
		return "ID : " + id + " 이름 : " + name + " 나이 : " + age + " Tel : " + tel + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
