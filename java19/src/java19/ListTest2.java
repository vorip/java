package java19;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 스트링");
		list.add(100);
		//String(작,자식) > object(큰,부모)
		//자동형변환,업캐스팅
		System.out.println(list);
		String name = (String)list.get(0);
		//object(큰,부모) > String(작,자식)
		//down casting 
	}

}
