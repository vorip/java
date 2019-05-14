package 배열;

import java.util.Scanner;

public class 성적입력후평균구하기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0;
		System.out.println("성적을 입력해주세요");
		for(int i = 0;i<scores.length;i++) {
			System.out.printf("%d번 학생 : ",i+1);
			scores[i] = scan.nextInt();
			sum += scores[i];
		}
		System.out.printf("평균 성적은 %d입니다."
				,sum/scores.length);
		scan.close();
		
	}

}
