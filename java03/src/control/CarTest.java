package control;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int speed,security,fuel;

		System.out.println("각 점수는 만점 : 100점");
		System.out.println("평점 : 속도 50%, 안정성 : 30%, 연비 : 20%");
		System.out.println("평점 80점 이상 - 우수, 70이상 - 보통, 나머지 - 불량");
		System.out.println("모든 점수가 80점 이상인 경우 베스트");

		

		System.out.print("차의 속도점수를 입력해주세요");
		speed = scan.nextInt();
		System.out.print("차의 속도점수를 입력해주세요");
		security = scan.nextInt();
		System.out.print("차의 속도점수를 입력해주세요");
		fuel = scan.nextInt();

		float car1 = (float)(speed*0.5 + security*0.3 + fuel*0.2);

		if(speed<=100 && speed>0&&security<=100 && security>0 && fuel<=100 && fuel>0) {

			if (speed>=80&& security>=80 && fuel>=80) {

				System.out.println("베스트입니다!");

			}else if(car1>=80) {

				System.out.println("우수입니다.!");

			}else if(car1>=70) {

				System.out.println("보통입니다.!");

			}else {

				System.out.println("불량입니다.");

			}

		}else{

			System.out.println("유효한 평점을 입력해주세요(0~100)");

}

		scan.close();
		
	}

}
