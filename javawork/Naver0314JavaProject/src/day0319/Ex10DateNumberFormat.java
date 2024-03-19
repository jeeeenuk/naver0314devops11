package day0319;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10DateNumberFormat {
	public static void main(String[] args) {
		//현재날짜를 문자열로 출력하기
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html#constructor-summary
		Date date=new Date();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(sdf1.format(date)); //2024-03-19 16:33:42 화
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss EEEE");
		System.out.println(sdf2.format(date)); //2024-03-19 16:33:42 화
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(sdf3.format(date)); //2024년 03월 19일 16시 35분
		
		//숫자 format 양식 지정하기
		int money=5678900;
		double average=98.7256;
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance();//화폐단위와 3자리마다 ,가 추가되어 출력
		System.out.println(nf1.format(money));//₩5,678,900
		
		//따로 생성없이 바로 method 생성 가능
		System.out.println(NumberFormat.getInstance().format(money));//5,678,900
		System.out.println(NumberFormat.getCurrencyInstance().format(money));//₩5,678,900
		
		//평균값을 소숫점이하 1자리로 출력하기
		NumberFormat nf2=NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(1); //소숫점 이하 값 지정
		System.out.println(nf2.format(average));
	}
}
