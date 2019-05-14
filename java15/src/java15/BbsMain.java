package java15;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	public BbsMain() {
		JFrame f = new JFrame("나의 게시판 만들기");
		FlowLayout flow = new FlowLayout();
		
		f.setSize(400,600);
		f.getContentPane().setLayout(flow);
		
		JLabel idTextL = new JLabel("아이디");
		idTextL.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(idTextL);
		
		JTextArea idText = new JTextArea();
		idText.setColumns(10);
		idText.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(idText);
		
		JLabel titleTextL = new JLabel("<<제 목>>");
		titleTextL.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(titleTextL);
		
		JTextArea titleText = new JTextArea();
		titleText.setFont(new Font("굴림", Font.BOLD, 30));
		titleText.setColumns(10);
		f.getContentPane().add(titleText);
		
		JLabel contentTextL = new JLabel("<<내 용>>");
		contentTextL.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(contentTextL);
		
		JTextArea contentText = new JTextArea();
		contentText.setFont(new Font("굴림", Font.BOLD, 30));
		contentText.setColumns(10);
		f.getContentPane().add(contentText);
		
		JLabel etcTextL = new JLabel("<<기 타>>");
		etcTextL.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(etcTextL);
		
		JTextArea etcText = new JTextArea();
		etcText.setFont(new Font("굴림", Font.BOLD, 30));
		etcText.setColumns(10);
		JButton btnNewButton = new JButton("검색하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputId = idText.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				idText.setText(id);
				titleText.setText(title);
				contentText.setText(content);
				etcText.setText(etc);
				
			}
		});
		
		f.getContentPane().add(etcText);
		
		JButton insertButton = new JButton("생성하기");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				String id = idText.getText();
				String title = titleText.getText();
				String content = contentText.getText();
				String etc = etcText.getText();
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				dao.insert(dto);
				 
			}
		});
		insertButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(insertButton);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("수정하기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				String id = idText.getText();
				String title = titleText.getText();
				String content = contentText.getText();
				String etc = etcText.getText();
				
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				
				dao.update(dto);
				
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("삭제하기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				String id = idText.getText();
				dao.delete(id);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(button_1);
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		BbsMain main = new BbsMain();
		
	}
	

}
