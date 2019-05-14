package java16;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		
		list.remove(1);
		
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d등 : %s\n",i+1,list.get(i));
		}
		
	}

}
