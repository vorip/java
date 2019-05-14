package 배열;

import java.util.Scanner;

public class 인기투표배열문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vote =0,cnt;
		System.out.println("인기투표를 시작합니다.");
		System.out.print("인기투표를 할 가수의 수를 입력해주세요 : ");
		int p = scan.nextInt();
		System.out.print("진행할 횟수를 정해주세요 : ");
		cnt = scan.nextInt();
		String[] singer = new String[p];
		int[] re = new int[p];
		for(int i=0;i<p;i++) {
			System.out.printf("가수 이름 입력 : ");
			singer[i]= scan.next();
		}
		System.out.println("인기투표를 시작합니다.");
		while(true) {
			System.out.println("----------------------------");
			for(int i=0;i<p;i++) {
				System.out.printf("%d) %s  ",i+1,singer[i]);
			}
			System.out.print("\n투표 번호 : ");
			vote = scan.nextInt();
			if(p>=vote){	
				re[vote-1]+=1;				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
			cnt--;
			if(cnt==0) {
				System.out.println("투표가 종료되었습니다.\n결과를 출력합니다.");
				for(int i=0;i<p;i++) {
					System.out.printf("%s : %d표\n",singer[i],re[i]);					
				}
				break;
			}
		}
		scan.close();
	}
		
}


