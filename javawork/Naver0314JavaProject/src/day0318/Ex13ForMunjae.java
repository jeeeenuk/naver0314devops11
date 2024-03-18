package day0318;

import java.util.Scanner;

public class Ex13ForMunjae {
	public static void main(String[] args) {
		System.out.println("지수승 구하기");
		System.out.println("3의 3승은 " + Math.pow(3, 3)); //기본형은 double
		System.out.println("2의 4승은 " + (int)Math.pow(2, 4));
		
		Scanner sc = new Scanner(System.in);
		int x, y, sum=1;
		System.out.println("두수 x,y값 입력하기");
		x = sc.nextInt();
		y = sc.nextInt();
		
		for(int i=1; i<=y; i++) {
			sum*=x;
		}
		System.out.printf("%d의 %d승은 %d 입니다.", x, y, sum);
		sc.close();
	}
}
