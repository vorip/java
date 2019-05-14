package 생성자;

import java.util.Scanner;

public class 회원관리 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id,pw,grade;
		int mile,tMile=0;
		회원[] m1 = new 회원[3];
		
		for(int i=0;i<m1.length;i++) {
			System.out.print("아이디 : ");
			id = scan.next();
			System.out.print("패스워드 : ");
			pw = scan.next();
			System.out.print("등급 : ");
			grade = scan.next();
			System.out.print("마일리지 : ");
			mile = scan.nextInt();
			m1[i] = new 회원(id,pw,grade,mile);
			tMile += m1[i].mile;
		}
		System.out.printf("%s의 비밀번호는 %s입니다.\n",m1[0].id,m1[0].pw);
		System.out.printf("%s는 %s이고 마일리지는 %d입니다.\n",m1[1].id,m1[1].grade,m1[1].mile);
		System.out.printf("총 마일리지는 %d입니다.\n",tMile);
		System.out.printf("평균 마일리지는 %d입니다.\n",tMile/m1.length);
		scan.close();
		
		
	}

}
