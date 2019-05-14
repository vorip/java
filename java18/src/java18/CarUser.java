package java18;

import java.util.ArrayList;
import java.util.Scanner;

public class CarUser{
	public static void main(String[] args) {
		CarDAO dao = new CarDAO();
		CarDTO dto;
		ArrayList list;
		Scanner scan = new Scanner(System.in);
		String key,id,name,content,price,inputId;
		while(true) {
			System.out.println("------------------자동차 관리 시스템------------------");
			System.out.println("\n(i)등록 (d)판매 (u)가격수정 (s)차량조회 (a)전체조회 (q)종료");
			System.out.print("입력 > ");
			key = scan.next();
			
			switch(key) {
			case "I":
			case "i":
				dto = new CarDTO();
				System.out.print("차량 id : ");
				id = scan.next();
				System.out.print("차량 이름 : ");
				name = scan.next();
				System.out.print("차량 정보 : ");
				content = scan.next();
				System.out.print("차량 가격 : ");
				price = scan.next();
				
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				
				dao.insert(dto);
				System.out.println("\n차량 등록이 완료되었습니다.");
				break;
			case "D":
			case "d":
				System.out.println("----------------------------------------------");
				System.out.print("판매될 차량의 id를 입력해주세요 : ");
				inputId = scan.next();
				dao.delete(inputId);
				break;
			case "U" :
			case "u" :
				System.out.println("----------------------------------------------");
				System.out.print("가격을 수정하실 차량의 id를 입력해주세요 : ");
				id = scan.next();
				System.out.print("수정하실 가격을 입력해주세요 : ");
				price = scan.next();
				dao.update(id,price);
				break;
			case "S" :
			case "s" :
				System.out.println("----------------------------------------------");
				System.out.print("조회하실 차량의 id를 입력해주세요 : ");
				inputId=scan.next();
				dto = dao.select(inputId);
				if(dto!=null) {
					System.out.println(dto);
				}
				break;
			case "A" :
			case "a" :
				System.out.println("----------------------------------------------");
				System.out.println("전체 조회를 시작합니다.");
				list = dao.selectAll();
				for(int i=0;i<list.size();i++) {
					dto = (CarDTO)list.get(i);
					System.out.println(dto);
					System.out.println("----------------------------------------------");
				}
				break;
			}
			if(key.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
