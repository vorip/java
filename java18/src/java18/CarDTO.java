package java18;

public class CarDTO {
	private String id;
	private String name;
	private String content;
	private String price;
	
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " id = " + id + "\n 차 이름 = " + name + "\n 정보 = " + content + "\n 가격 = " + price;
	}

}
