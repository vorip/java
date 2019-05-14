package java17;

public class 고등학생 extends 학생{
	int social;
	
	public void sleep() {
		System.out.println("수업시간에 졸다.");
	}
	@Override
	public void goSchool() {
		System.out.println("7시에 등교하다.");
	}
	@Override
	public String toString() {
		return "고등학생 [social=" + social + ", uniform=" + uniform + "]";
	}

}
