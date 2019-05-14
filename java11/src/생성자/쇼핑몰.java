package 생성자;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 쇼핑몰 {

	public static void main(String[] args) {
		Member[] members = new Member[3];
		Scanner scan = new Scanner(System.in);
		String name,addr,tel;
		String age1;
		int age;

		JOptionPane.showMessageDialog(null,"가입할 정보를 입력해주세요.");
		for(int i=0;i<members.length;i++) {
			name = JOptionPane.showInputDialog("이름");
			age1 = JOptionPane.showInputDialog("나이");
			age = Integer.parseInt(age1);
			tel = JOptionPane.showInputDialog("연락처");
			addr = JOptionPane.showInputDialog("주소");
			members[i] = new Member(name,age,tel,addr);
		}
		
		
		System.out.println("쇼핑몰 회원가입 명단입니다.");
		System.out.println("===================================");
		System.out.println("이름       나이\t연락처\t        주소");
		for(int i=0;i<members.length;i++) {
			System.out.printf("%s     %d      %s            %s",members[i].name,members[i].age
					,members[i].tel,members[i].addr);
			System.out.println();
		}
		scan.close();
		
	}

}
