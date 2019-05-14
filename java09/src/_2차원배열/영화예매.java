package _2차원배열;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] seat = new int[3][10];
		int index,hang,yeol,price=0,cnt=0;
		
		while(true) {
			System.out.println("---------------------------------"
					+ "--------------------");
			for(int i=0;i<seat[0].length;i++) {
				System.out.printf("%2d   ",i+1);
			}
			System.out.println("\n---------------------------------"
					+ "--------------------");
			for(int i=0;i<seat.length;i++) {
				for(int j=0;j<seat[i].length;j++) {
					System.out.printf("%2d   ",seat[i][j]);
				}
				System.out.printf("| %d\n",i+1);
			}
			System.out.println("---------------------------------"
					+ "--------------------");
			System.out.print("예매 : 1, 종료 : 0 >>");
			index = scan.nextInt();
			if(index == 1) {
				System.out.print("예매할 좌석 행 번호 : ");
				hang = scan.nextInt();
				if(0<hang&&hang<=seat.length) {
					hang--;
					System.out.print("예매할 좌석 열 변호 : ");
					yeol = scan.nextInt();
					if(0<yeol&&yeol<=seat[hang].length&&seat[hang][yeol-1]==0) {
						System.out.println("예매 완료");
						yeol--;
						seat[hang][yeol]++;
						price+=10000;
						cnt++;
					}else {
						System.out.println("유효하지 않은 열이거나 이미 예매된 좌석입니다.");
					}
				}else {
					System.out.println("유효한 행 번호를 입력해주세요");
				}
			}else if(index == 0) {
				System.out.println("예매를 종료합니다.");
				System.out.printf("%d자리 예매, 결제하실 금액은 %d원입니다.",cnt,price);
				break;
			}else {
				System.out.println("1번과 0번중 하나를 입력해주세요");
			}
			
		}
		scan.close();
		
	}

}
