package 배열;

public class 배열연습3 {
	public static void main(String[] args) {
		int[] num = {444, 666, 777};
		//int num1[] = {11,22,33}; 가능
		//배열의 첫번째 값에 세번째 값을 넣어보세요.
		//첫번째 값을 확인, 세번째 값을 확인
		int num1 = num[0];
		num[0] = num[2];
		num[2] = num1;
		System.out.println(num[0] + ", " + num[2]);

	}
}
