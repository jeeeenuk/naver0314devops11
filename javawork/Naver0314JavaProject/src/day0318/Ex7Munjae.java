package day0318;

import java.util.Scanner;

public class Ex7Munjae {
	public static void main(String[] args) {
		/*
		 * 이름(name), 기본급(gibon), 가족수(familysu)를 키보드로 입력후
		 * 가족수가 3인 이상이면 기본급 + 가족수*5만원으로 실수령액(totpay)을 출력하고
		 * 가족수가 3인 미만이면 기본급 + 30000원으로 실수령액을 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		String name;
		int gibon, familysu, totpay;
		System.out.println("이름, 기본급, 가족수를 입력하시오.");
		name = sc.nextLine();
		gibon= sc.nextInt();
		familysu= sc.nextInt();
		
		if (familysu>=3) {
			totpay = gibon + (familysu * 50000);
		}
		else {
			totpay = gibon + 30000;
		}
		
		System.out.printf("Name : %s \nGibon : %d \nFamilysu : %d \nTotpay : %d", name, gibon, familysu, totpay );
		sc.close();
	}
}
