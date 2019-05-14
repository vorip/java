package control;

public class Day3 {

	public static void main(String[] args) {
//		오늘 아침에 대한 정보 출력(변수에 저장해서 출력)
//		------------------
//		오늘 아침을 먹고 왔나요? true
//		오늘 타고 온 버스의 번호나 지하철 노선은? 2호선
//		오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는? 
//		오늘부터 프로젝트를 함께 할 우리 조원의 이름은? 홍길동
		boolean b = true;
		int line = 7;
		float temp = 11.5f;
		String name = "홍길동";
		
		System.out.printf("----------------------------------------\n");
		System.out.printf("오늘 아침을 먹고 왔나요? %b\n",b);
		System.out.printf("오늘 타고 온 지하철 노선은? %d호선\n",line);
		System.out.printf("오늘은 어제보다 5.5도 낮아요. 오늘의 온도는? %.1f도\n",temp);
		System.out.printf("오늘부터 프로젝트를 함께 할 우리 조원의 이름은? %s\n",name);
		
		
				
		
	}		

}
