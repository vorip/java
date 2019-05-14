package data;

public class me {

	public static void main(String[] args) {
		// 한 줄 삭제 : 컨트롤 + d
		// 실행 취소 : 컨트롤 + z
		String name = "최한영";// =은 대입연산자
		char gender = '남';
		int age = 24, weight = 80;
		float high = 175.0f, eye = 0.2f;
		
		System.out.println("내 이름은 " + name + "이고, 나이는 " 
		+ age+" 세 입니다.\n나의 키는 " + high +"cm 이고, 몸무게는 "+ weight + 
		"kg 입니다.\n시력은 "+ eye +" 이고, 성별은 " + gender + "입니다.");
		

	}

}
