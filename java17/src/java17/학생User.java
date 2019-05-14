package java17;

public class 학생User {

	public static void main(String[] args) {
		초등학생 ele = new 초등학생();
		중학생 midle = new 중학생();
		고등학생 high = new 고등학생();
		
		ele.uniform="아이비클럽";//학생
		midle.uniform = "스쿨룩스";//학생
		high.uniform = "엘리트";//학생
		
		ele.math = 80;//초등학생
		midle.english = 60;//중학생
		high.social = 30;//고등학생
		
		ele.goSchool();//학생
		midle.goSchool();//학생
		high.goSchool();//학생
		
		ele.exam();//초드학생
		midle.freeTalking();//중학생
		high.sleep();//고등학생
		 
		System.out.println(ele);
		System.out.println(midle);
		System.out.println(high);
		
		
		
	}

}
