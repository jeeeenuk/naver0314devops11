package day0315;

import java.util.Scanner;

public class Ex8Munjae {
	public static void main(String[] args) {
		/*
		 * 이름(name), 핸드폰(hp), 태어난 년도(birthYear) 입력 받은 후 
		 * 이름, 핸드폰, 태어난년도, 나이(2024-태어나년도)를 출력하는 프로그램 작성하시오
		 */
		Scanner sc = new Scanner(System.in);
		
		int birthYear, age;
		String hp, name;
		
		System.out.println("What's your name ?");
		name = sc.nextLine();
		
		System.out.println("What's your phone number ?");
		hp = sc.nextLine();
		
		System.out.println("what's your birth year ?");
		birthYear = Integer.parseInt(sc.nextLine());
		
		age = 2024-birthYear;
		
		System.out.printf("이름 : %s\n핸드폰 : %s\n출생년도 : %d\n나이 : %d", name, hp, birthYear, age);
	}
}
