package java17;

public class 중학생 extends 학생{
	int english;
	
	public void freeTalking() {
		System.out.println("프리토킹을하다");
	}
	@Override
	public void goSchool() {
		System.out.println("7시30분에 등교하다.");
	}
	@Override
	public String toString() {
		return "중학생 [english=" + english + ", uniform=" + uniform + "]";
	}

}
