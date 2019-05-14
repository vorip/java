package java20;

import java.sql.Date;
import java.util.Calendar;

public class Calender클래스연습{

	public static void main(String[] args) {
		//Calendar를 Date로 변환
		Calendar cal = Calendar.getInstance();//현재날짜와 시간으로 설정됨
		Date d = new Date(cal.getTimeInMillis());
		
		//Date를 Calendar로 변환
//		Date d = new Date();
//		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		 // 기본적으로 현재날짜와 시간으로 설정된다.
        Calendar today = Calendar.getInstance();
        System.out.println("올해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월 : " + (today.get(Calendar.MONTH)+1));
        System.out.println("오늘이 올 해의 몇번째 주인지 출력 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("오늘이 이번달의 몇번째 주인지 출력 : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("---------------------------------------------------------------");
        // DATE와 DAY_OF_MONTH는 같다.
        System.out.println("오늘의 날짜(일)를 DATE()로 출력 : " + today.get(Calendar.DATE));
        System.out.println("오늘의 날짜(일)를 DAY_OF_MONTH()로 출력 : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("올해의 시작 후 몇 일이 지났는지 출력 : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("---------------------------------------------------------------");
        // 1:일요일, 2:월요일, ... 7:토요일
        System.out.println("요일을 1~7로 출력 (일요일부터 시작): " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("오늘이 이번달 중  날짜 기준으로 몇번째 주인지 출력(1~7 : 1 8~14 : 2 ...)\n >> " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
        System.out.println("현재시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("현재시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999)로 출력: " + today.get(Calendar.MILLISECOND));
        System.out.println("---------------------------------------------------------------");
        System.out.println("영국을 기준으로 한 시차 출력 TimeZone(-12~+12): " +
        (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        // 이 달의 마지막 일을 찾는다.
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE) );


	}

}
