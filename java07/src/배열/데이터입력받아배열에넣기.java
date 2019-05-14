package 배열;

import java.util.Scanner;

public class 데이터입력받아배열에넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 3개를 넣으세요.");
		int[] num = new int[3];
		for(int i=0; i<3; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.println(num[i]);
		}
		sc.close();
	
	
	}
}
