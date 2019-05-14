package window;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r1 = new Random();
		int com = r1.nextInt(3);
		System.out.print("가위, 바위, 보 중에 선택!");
		String p1 = scan.next();
		
		switch(p1) {
		case "바위":
		case "주먹":
		case "묵" :
			p1 = "바위";
			break;
		case "보" :
		case "빠" :
		case "보자기" :
			p1 = "보";
			break;
		case "찌" :
		case "가위":
		case "ㅉ" :
			p1 = "가위";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			p1 = "";
		}
		

		
		String comR = "";
		switch(com) {
		case 0 :
			comR = "바위";
			break;
		case 1 :
			comR = "보";
			break;
		default :
			comR = "가위";
			
			
		}
		if(p1=="") {
			
		}else {
			System.out.printf("컴퓨터는 %s를 냈습니다.\n",comR);			
		}
		
		if(p1.equals("바위")) {
			if(comR.equals("보")) {
				System.out.println("패배하셨습니다!");
			}else if(comR.equals("가위")) {
				System.out.println("승리하셨습니다!");
			}else {
				System.out.println("비겼습니다!");
			}
		}else if(p1.equals("가위")) {
			if(comR.equals("보")) {
				System.out.println("승리하셨습니다!");
			}else if(comR.equals("가위")) {
				System.out.println("비겼습니다!");
			}else {
				System.out.println("패배하셨습니다!");
			}
		}else if(p1.equals("보")){
			if(comR.equals("보")) {
				System.out.println("비겼습니다!");
			}else if(comR.equals("가위")) {
				System.out.println("패배하셨습니다!");
			}else {
				System.out.println("승리했습니다!");
			}
		}else {
			System.out.println("잘못 입력하셨기 때문에 게임이 무효가 됩니다.");
		}
	}

}
