package java19;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		milk.add(1);
		milk.add(2);
		milk.add(3);
		milk.add(4);
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove(3);
		System.out.println(milk);
		milk.addFirst("처음값");
		milk.addLast("나중값");
		System.out.println(milk);
		
		
	}

}
