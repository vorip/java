package 일기장;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {
	public static void main(String[] args) throws Exception {
		//파일에 저장
		//객체 생성
		
		String name = JOptionPane.showInputDialog("이름");
		String tel = JOptionPane.showInputDialog("전화번호");
		String addr = JOptionPane.showInputDialog("주소");
		FileWriter w = new FileWriter(name+".txt");
		//메소드 호출
		w.write(name+"\n");
		w.write(tel+"\n");
		w.write(addr+"\n");
		w.close();
	}

}
