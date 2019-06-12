package money;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BankManager extends JFrame{
	BankDAO dao = new BankDAO();
	
	BankManager(){
		setSize(556,300);
		getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("고객관리프로그램");
		label1.setFont(new Font("굴림", Font.BOLD, 17));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(180, 10, 160, 31);
		getContentPane().add(label1);
		
		JButton signButton = new JButton("신규가입");
		signButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BankDTO dto = new BankDTO();
				dto.setId(JOptionPane.showInputDialog("아이디 입력"));
				dto.setName(JOptionPane.showInputDialog("이름 입력"));
				while(true) {
					if(dto.getAge()>0) {
						break;
					}else {
						try {
							dto.setAge(Integer.parseInt(JOptionPane.showInputDialog("나이 입력(0보다 큰 정수)")));
						}catch (Exception e1) {
						}
					}
				}
				dto.setTel(JOptionPane.showInputDialog("전화번호 입력"));
				System.out.println(dto);
				dao.insert(dto);
				JOptionPane.showMessageDialog(null, "회원 등록이 완료되었습니다.");
			}
		});
		signButton.setBounds(12, 81, 106, 39);
		getContentPane().add(signButton);
		
		JButton selectButton = new JButton("회원검색");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = JOptionPane.showInputDialog(null,"검색하실 회원의 ID(전체는 all)");
				if(id==null) {}else {
					if(id.equals("all")) {
						ArrayList<BankDTO> list = dao.selectAll();
						if(list!=null) {
							for(int i=0;i<list.size();i++) {
								System.out.println(list.get(i));
							}
						}
					}else {
						BankDTO dto = dao.select(id);
						if(dto==null) {
							JOptionPane.showMessageDialog(null, "존재하지 않는 ID입니다.");
						}else {
							JOptionPane.showMessageDialog(null, "ID : "+dto.getId()+" 이름 : "+dto.getName()+" 나이 : "+dto.getAge()+" Tel : "+dto.getTel());
						}
					}
				}
			}
		});
		selectButton.setBounds(147, 81, 106, 39);
		getContentPane().add(selectButton);
		
		JButton updateButton = new JButton("정보수정");
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("아이디 입력");
				if(id==null) {}else {
					if(dao.select(id)!=null) {
						String tel = JOptionPane.showInputDialog("수정하실 전화번호를 입력하세요");
						if(tel!=null) {
							dao.update(id, tel);
							JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
						}
					}
				}
			}
		});
		updateButton.setBounds(282, 81, 106, 39);
		getContentPane().add(updateButton);
		
		JButton deleteButton = new JButton("회원삭제");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id=JOptionPane.showInputDialog("아이디 입력");
				if(id!=null) {
					if(dao.select(id)!=null) {
						dao.delete(id);
						JOptionPane.showMessageDialog(null, "삭제 완료");
					}
				}
			}
		});
		deleteButton.setBounds(417, 81, 106, 39);
		getContentPane().add(deleteButton);
		
		JButton closeButton = new JButton("닫기");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		closeButton.setBounds(417, 167, 106, 39);
		getContentPane().add(closeButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		BankManager f1 = new BankManager();
	}
}
