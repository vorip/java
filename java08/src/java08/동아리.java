package java08;

import java.util.Scanner;

public class 동아리 {

	public static void main(String[] args) {
		//변수 선언부분
		Scanner scan = new Scanner(System.in);
		String[] name = {"김씨","박씨","송씨","정씨","장씨"};
		int[] grade = {1,2,3,1,1};
		char[] grades = {'A','B','C','A','B'};
		char[] grades1 = {'A','B','C','D','F'};
		int cnt = 0;//숫자를 세기 위한 count변수선언
		int[] cntt = new int[5];
		
		//명단 프린트
		System.out.printf("총인원 : %d명\n",name.length);
		System.out.println("------------------명단------------------");
		for(int i=0;i<name.length;i++) {
			System.out.printf("\t이름 : %s    ",name[i]);
			System.out.printf(" %d학년     ",grade[i]);
			System.out.printf("%c학점\n",grades[i]);
		}
		System.out.println("---------------------------------------");

		//학년별 인원수, 학점 별 인원수
		System.out.println("학년별 인원수");
		for(int j=0;j<3;j++) {
			System.out.printf("%d학년 : ",j+1);
			for(int i=0;i<name.length;i++) {
				if(grade[i]==j+1) {
					cnt++;
				}
			}
			System.out.printf("%d명\n",cnt);
			cnt=0;			
		}
		for(int i=0;i<grades.length;i++) {
			switch(grades[i]) {
			case 'A' : cntt[0]++;break;
			case 'B' : cntt[1]++;break;
			case 'C' : cntt[2]++;break;
			case 'D' : cntt[3]++;break;
			case 'F' : cntt[4]++;break;
			default:
			}
		}
		System.out.println("\n학점별 인원수");
		for(int i=0;i<cntt.length;i++) {
			System.out.printf("%c학점 : %d명\n",grades1[i],cntt[i]);
		}
		//이름으로 위치,학년,학점찾기
		cnt=0;
		System.out.print("인덱스를 찾고 싶은 이름 :");
		String nameS = scan.next();
		for(int i=0;i<name.length;i++) {
			if(nameS.equals(name[i])) {
				System.out.printf("%s의 인덱스번호는 : %d\n"
						+ "%d학년이고 %c학점입니다."
						,nameS,i,grade[i],grades[i]);
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.printf("%s는 명단에 없습니다.",nameS);
		}
//		switch(nameS) {
//		case "김씨":System.out.printf("%s의 인덱스번호는 : %d\n",nameS,0);break;
//		case "박씨":System.out.printf("%s의 인덱스번호는 : %d\n",nameS,0);break;
//		case "송씨":System.out.printf("%s의 인덱스번호는 : %d\n",nameS,0);break;
//		case "정씨":System.out.printf("%s의 인덱스번호는 : %d\n",nameS,0);break;
//		case "장씨":System.out.printf("%s의 인덱스번호는 : %d\n",nameS,0);break;
//		}
		scan.close();
	}

}
