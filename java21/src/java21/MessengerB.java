package java21;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerB extends JFrame{
	
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	MessengerB() throws Exception{
		socket = new DatagramSocket(6000);
		list = new JTextArea(6,20);
		list.setFont(new Font("Monospaced", Font.BOLD, 25));
		list.setBackground(new Color(0, 255, 255));
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = input.getText();
//				System.out.println("내가 입력한 값"+data);
				list.append("내가 입력>>"+str+"\n");
				input.setText("");
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length,ip,5000);
					socket.send(packet);
					socket.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		input.setFont(new Font("굴림", Font.PLAIN, 20));
		input.setBackground(new Color(255, 255, 224));
		setTitle("메신저B 채팅화면");
		getContentPane().add(list,BorderLayout.CENTER);
		getContentPane().add(input,BorderLayout.SOUTH);
		pack();
		list.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	void process() throws Exception {
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			list.append("네가 입력 >>"+new String(data)+"\n");
		}
	}

	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB();
		name.process();
	}

}
