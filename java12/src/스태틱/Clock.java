package 스태틱;

public class Clock {
	int price;
	String name;
	int nowTime;
	String company;
	public Clock(int price, String name, int nowTime, String company) {
		this.price = price;
		this.name = name;
		this.nowTime = nowTime;
		this.company = company;
	}
	public Clock(int price, int nowTime, String company) {
		this.price = price;
		this.nowTime = nowTime;
		this.company = company;
	}
	public Clock(int price, String company) {
		this.price = price;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Clock [price=" + price + ", name=" + name + ", nowTime=" + nowTime + ", company=" + company + "]";
	}
	public int getPrice() {
		return price;
	}
	public String getCompany() {
		return company;
	}
	
	

}
