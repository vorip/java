package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int sumTime;
	static int cnt;
	
	public Day() {
	
	}


	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		sumTime += time;
		cnt++;
	}
	public static int getTotal() {
		return sumTime;//스태틱 메소드 내에 사용되는 멤버변수는 반드시 static변수여야함
		//객체생성과 상관없이 접근가능한 변수이기 때문에 static메소드로 만들어야 함
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
