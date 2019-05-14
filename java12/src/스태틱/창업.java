package 스태틱;

public class 창업 {

	public static void main(String[] args) {
		Company em1 = new Company("김아무개",'F',20);
		Company em2 = new Company("박아무개",'M',21);
		Company em3 = new Company("정아무개",'M',23);
		
		System.out.println("전체 직원의 수는 "+Company.cnt+"명 입니다.");
		System.out.println("직원들의 평균 나이는 "+Company.sumAge/Company.cnt+"살 입니다.");
		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
	}

}
