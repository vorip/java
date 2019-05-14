package java19;

import java.util.HashMap;

public class Notice {

	public static void main(String[] args) {
		HashMap name = new HashMap();
		NoticeDTO dto = new NoticeDTO("1", "2", "3", "1234");
		NoticeDTO dto2 = new NoticeDTO("4", "5", "6", "1234");
		NoticeDTO dto3 = new NoticeDTO("7", "8", "9", "1234");
		
		name.put(100, dto);
		name.put(200, dto2);
		name.put(300, dto3);
		
		for(int i=1;i<=name.size();i++) {
			System.out.println(name.get(i*100));
		}
		
	}

}
