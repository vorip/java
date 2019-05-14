package java16;

import java.util.ArrayList;

public class MemberDAO {
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		MemberDTO b1 = new MemberDTO("kim","1234","kim","010");
		MemberDTO b2 = new MemberDTO("park","1111","park","010");
		MemberDTO b3 = new MemberDTO("jung","2222","jung","010");
		MemberDTO b4 = new MemberDTO("oh","4444","oh","010");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		return list;
	}

}
