package crud;

import javax.swing.JOptionPane;

public class NoticeTest {

	public static void main(String[] args) {
		NoticeTable nt = new NoticeTable();
		
		String title = JOptionPane.showInputDialog("글제목");
		String contents = JOptionPane.showInputDialog("내용");
		String time = JOptionPane.showInputDialog("작성시간");
		
		try {
			nt.insert(title, contents, time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String hang1 = JOptionPane.showInputDialog("바꿀내용 : 제목,내용,시간");
		String value1 = JOptionPane.showInputDialog("바꿀 값");
		String value2 = JOptionPane.showInputDialog("바꿀 글 제목");
		
		try {
			nt.update(hang1, value1, value2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String value = JOptionPane.showInputDialog("삭제할 글 제목");
		
		try {
			nt.delete(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
