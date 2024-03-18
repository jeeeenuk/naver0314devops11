package day0315;

import java.util.Scanner;

public class EX13Untitled {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String msg;
		
		while (true) {
			System.out.println("숫자입력(0은 종료) : ");
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("종료합니다.");
				break;
			}
			msg = num%2==0?"짝수":"홀수";
			System.out.println(msg);
		}
		sc.close();
	}
}
