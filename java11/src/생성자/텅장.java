package 생성자;

import java.util.Scanner;

public class 텅장 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tong[] t1 = new Tong[3];
		int money=0,totalM=0;
		String product="",name="";
		for(int i=0;i<t1.length;i++) {
			System.out.print("상품명 입력 : ");
			product = scan.next();
			System.out.print("예금주 명 : ");
			name = scan.next();
			System.out.print("예금액 : ");
			money = scan.nextInt();
			t1[i] = new Tong(product,name,money);
			totalM+=t1[i].money;
		}
		
		System.out.println("---------------------------------------");
		System.out.printf("%s 통장에는 %d만원이 들어있어요.\n",t1[1].product,t1[1].money);
		System.out.printf("%s의 통장에는 %d만원이 들어있어요.\n",t1[2].name,t1[2].money);
		System.out.printf("우리 집 전체 예금액은 %d만원 이에요.\n",totalM);		
		System.out.println("---------------------------------------");
		scan.close();
	}

}
