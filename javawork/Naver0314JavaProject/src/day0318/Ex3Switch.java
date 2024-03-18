package day0318;

import java.util.Scanner;

public class Ex3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("숫자 1-3 을 입력하시오");
		num = sc.nextInt();
		System.out.println(num + " 을 눌렀습니다");
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Other Number");
		}
		sc.close();
	}

}
