package control;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("저기요!!");
		System.out.println("--------------------------");
		while(true) {
			System.out.println("메뉴를 고르세요 :");
			System.out.println("--------------------------");
			System.out.println("1) 짜장면  2) 짬뽕  3) 우동  4) 종료");
			System.out.print("당신의 선택은? ");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				System.out.println("짜장면을 선택했습니다.");
			}else if(choice == 2) {
				System.out.println("짬뽕을 선택했습니다.");			
			}else if(choice == 3) {
				System.out.println("우동을 선택했습니다.");
			}else if(choice == 4){
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		scan.close();
	
	}

}
