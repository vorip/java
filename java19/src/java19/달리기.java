package java19;

import java.util.ArrayList;

public class 달리기 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1)+"등 : "+list.get(i));
		}
		
	}

}
