package day0319;

import java.util.Calendar;
import java.util.Date;

public class Ex09DateCalender {
	public static void main(String[] args) {
		//공식문서에서 util.Date 검색
		//https://docs.oracle.com/en/java/javase/17/docs/api/
		//Date 클래스를 이용해서 년,월,일,시,분,초 얻기 (JDK1.1 이루 Deprecate 되고 Calendar 를 권장하나 여전히 많이 사용중)
		
		Date date=new Date();//Default 로 생성시 현재 날짜와 시간을 얻는다.
		int year=date.getYear()+1900;//년도는 1900이 빠진 값으로 반환
		int month=date.getMonth()+1;//0~11 이 반환, 고로 1을 더해줌
		int day=date.getDate();//
		int week=date.getDay();//요일(0:일, 1:월, 2:화 ... 6:토)
		int hour=date.getHours();
		int min=date.getMinutes();
		int sec=date.getSeconds();
		
		System.out.println("Date 를 이용하여 출력하기");
		System.out.printf("현재년도 : %s\n", year);
		System.out.printf("현재월 : %s\n", month);
		System.out.printf("현재일 : %s\n", day);
		System.out.printf("현재요일 : %s(%s)\n", week, 
				(week==0?"일":week==1?"월":week==2?"화":week==3?"수":week==4?"목":week==5?"금":"토"));
		System.out.printf("%d시 %d분 %d\n", hour, min, sec);
		System.out.println("=".repeat(30));
		
		System.out.println("Calendar 를 이용하여 출력하기");
		Calendar cal=Calendar.getInstance();//생성자가 public 이 아니기 때문에 new 로 생성 불가
		year=cal.get(Calendar.YEAR);//2024 반환
		month=cal.get(Calendar.MONTH)+1;//0~11 반환, 고로 1을 더해줌
		day=cal.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 입니다.\n", year,month,day);
	}
}
