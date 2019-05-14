package java19;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap memberList = new HashMap();
		member m1 = new member("kim",20,'남',"구로구","011");
		member m2 = new member("park",25,'여',"종로구","016");
		member m3 = new member("lee",156,'남',"강남구","010");
		
		
		memberList.put("m100",m1 );
		memberList.put("m100",m2 );
		memberList.put("m100",m3 );
		System.out.println(memberList);
		
	}

}
