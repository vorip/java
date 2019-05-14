package java17;

public class 초등학생 extends 학생{
	int math;
	
	public void exam() {
		System.out.println("시험보다");
	}
	@Override
	public void goSchool() {
		System.out.println("8시에 등교하다.");
	}
	@Override
	public String toString() {
		return "초등학생 [math=" + math + ", uniform=" + uniform + "]";
	}

}
