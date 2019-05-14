package java20;

import java.text.MessageFormat;

public class MessageFormat연습 {

	public static void main(String[] args) {
		String msg = "학번:{0}, 학과: {1}, 성명: {2}";
        String[] str = {"00001", "컴퓨터공학", "김아무개"};
        String result = MessageFormat.format(msg, str);
        System.out.println(result);
	}

}
