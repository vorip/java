package 스태틱;

public class 하루일과 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"강남");
		Day day2 = new Day("여행",15,"강원도");
		Day day3 = new Day("운동",11,"피트니스");
		
		System.out.printf("전체 하는 일의 시간은 : %d시간\n",Day.sumTime);
		System.out.printf("하는 일의 평균 시간 : %d시간\n",Day.sumTime/Day.cnt);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		System.out.println("며칠 간 했는지? : "+Day.cnt+"일");
		
	}

}
