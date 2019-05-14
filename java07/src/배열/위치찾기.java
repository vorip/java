package 배열;

import java.util.Scanner;

public class 위치찾기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[4];
		System.out.println("정수 4개를 입력해주세요");
		for(int i=0;i<num.length;i++) {
			System.out.printf("정수 %d :",i+1);
			num[i] = scan.nextInt();
		}
			System.out.print("입력한 정수 중 찾으실 정수를 입력해주세요 :");
			int keyNum = scan.nextInt();
			int cnt = 0;
			for(int i=0;i<num.length;i++) {
				if(num[i]==keyNum) {
					System.out.printf("%d는 %d번째입니다."
							,keyNum,i+1);
					break;
				}
				cnt ++;
			
			}
			if(cnt == num.length) {
				System.out.println("찾으시는 숫자가 없습니다.");
			}
		
		scan.close();
	}

}
