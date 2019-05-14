package java19;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");
		list.add(100);
//		int<----->Integer 자동변환
		//int > Integer > Object
//			boxing	 upcasting
		//int > Integer (auto-boxing)
		//int < Integer (auto-unboxing)
//		Integer i = new Integer(50);객체생성도 가능
//		int num = (int)list.get(1);//downcasting+unboxing
		int num = (Integer)list.get(1);//downcasting
		list.add(11.22);
		list.add(true);
		MemberDTO dto = new MemberDTO("1","2","3","4");
		list.add(dto);
		list.remove(3);
		System.out.println(list);
		
		
	}

}
