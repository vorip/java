package JDBC;

import java.util.Scanner;

public class DB입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원 가입 정보 입력");
		System.out.print("아이디 : ");
		String id = scan.next();
		System.out.print("패스워드 : ");
		String pw = scan.next();
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("연락처 : ");
		String tel = scan.next();
		
		MemberDAO db = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		
		try {
			db.insert(dto);
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		scan.close();
		
		
		
	}

}
