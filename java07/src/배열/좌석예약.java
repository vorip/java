package 배열;

import java.util.Scanner;

public class 좌석예약 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; 
		int ii=0,cnt,price=0;
		while(true) {
			cnt=0;
			
			
			System.out.println("--------------------------------");
			for(int i=0;i<seat.length;i++) {
				System.out.printf(" %2d",i+1);
			}
			System.out.println("\n--------------------------------");
			for(int i=0;i<seat.length;i++) {
				System.out.printf(" %2d",seat[i]);			
			}
			System.out.printf("\n금액 : %d\n",price);
			for(int i=0;i<seat.length;i++) {
				if(seat[i]==1) {
					cnt++;
				}
			}
			if(cnt==seat.length) {
				System.out.println("좌석이 모두 예매되었습니다.");
				System.out.printf("남은 좌석의 수 : %d\n",seat.length-cnt);
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.printf("남은 좌석의 수 : %d\n",seat.length-cnt);
			System.out.print("예약을 원하시는 좌석 번호를 입력해주세요(종료는 -1) : ");
			ii = scan.nextInt();
			if(1<=ii&&ii<=10) {
				if(seat[ii-1]!=1) {
					System.out.println("예약되었습니다.");
					price += 10000;
					seat[ii-1]=1;
				}else {
					System.out.println("이미 예약된 좌석입니다.");
				}
			}else if(ii == -1){
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			else {
				System.out.println("유효하지 않은 좌석입니다.");
			}
			
		}
		scan.close();
	}

}
