package 반복문;

public class ForTest1 {
	int test;//전역변수(global)
	
	public static void main(String[] args) {
		int sum = 0;//지역변수(local)
		int start;
		for(start = 1; start <= 10; start++) {
			sum += start;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

}
