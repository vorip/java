package java16;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//ArrayList는 순서가 중요.
		ArrayList list = new ArrayList();
		
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		int size = list.size();
		System.out.println("리스트의 개수는 " + size);
		list.remove(1);
		System.out.println(list);
		list.add(1,"뉴인물");
		System.out.println(list);
		list.set(1, "고인물");
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"등 : "+list.get(i));
		}
		
//		System.out.println(list);//toString 재정의
//		list.remove(1);
//		System.out.println(list);
//		list.remove("박스키");
//		System.out.println(list);
		
		
		
		
		
	}

}
