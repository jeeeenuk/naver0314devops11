package day0318;

import java.util.Scanner;

public class Ex5Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year, month, days;
		boolean flag;
		System.out.println("년도를 입력하세요.");
		year = sc.nextInt();
		
		if(year%4==0 && year%100!=0 || year%400==0) {//정확한 윤년 공식
			flag = true;
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			flag = false;
			System.out.println(year+"년은 평년입니다.");
		}
		
		System.out.println("월을 입력하세요");
		month = sc.nextInt();
		
		if(month>12||month<1) {
			System.out.println("잘못 입력 하였습니다.");
			sc.close();
			return; //메인 메서드 종료
		}
		
		//1. Switch 문으로 해보기
//		switch(month) {
//		case 2:
//			//days=flag==true?29:28;
//			days=flag?29:28;
//			break;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			days = 30;
//			break;
//		default:
//			days=31;
//		}
//		System.out.printf("%d년 %d월 %d일까지 있습니다.", year, month, days);
		
		//2. If 문으로 해보기
		if(month==2) {
			days=flag?29:28;
		}
		else if(month==4||month==6||month==9||month==11) {
			days=30;
		}
		else {
			days=31;
		}
		System.out.printf("%d년 %d월 %d일까지 있습니다.", year, month, days);
		sc.close();
	}

}
