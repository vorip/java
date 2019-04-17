package data;

public class DataTest {

	public static void main(String[] args) {
		// : comment, 주석, 설명
		// 컨트롤+/(한줄주석)
		// sysout, syso + (컨트롤+스페이스바)
		System.out.println("나의 데이터 프린트.");
		// 컨트롤 + s(저장)
		// 컨트롤 + f11(실행)
		
		//정수(integer, int)
		int spaceY = 300; //-21억~21억
		// 정수 : byte(1바이트, 8비트: -128~127)
		// short(2바이트) 
		// int(4바이트)
		// long(8바이트)
		int startX = 0;
		int startY = 0;
		System.out.println("그래픽의 시작점은 x축은 "
				+ startX + " Y축은 " + startY);
		
		int result = startX + startY;
		String result2 = "그래픽의 시작점 Y축은 " + startY;
		
		System.out.println(result2);
		
		System.out.println();
		
		float x = 5.5f;
		double y = 5.5;
		
		char gender = '남';
		boolean breakTime = true; //false(거짓)
		
		
		
	}

}
