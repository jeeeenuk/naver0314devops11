package day0319;

import java.util.Scanner;

public class Ex11StringMunjae {
	public static void main(String[] args) {
		/*
		 * String 타입의 문자열(msg)를 입력받아
		 * 그 문자열 안에 대문자, 소문자, 숫자가 몇개가 포함되어 있는지 출력하시오.
		 * 예)
		 * Happy Day 123!!
		 * 대문자 : 2개
		 * 소문자 : 6개
		 * 숫 자 : 3개
		 * 
		 * String 의 charAt 와 length 를 사용하면 됨
		 */
		
		Scanner sc=new Scanner(System.in);
		String msg;
		int large=0, small=0, num=0;
		System.out.println("대문자, 소문자, 숫자를 포함하여 입력하시오");
		msg = sc.nextLine();
		
		for(int i=0;i<msg.length();i++) {
//			char ch = msg.charAt(i);		
			if (msg.charAt(i)>='A' && msg.charAt(i)<='Z') large++;
			else if (msg.charAt(i)>='a' && msg.charAt(i)<='z') small++;
			else if (msg.charAt(i)>='0' && msg.charAt(i)<='9') num++;
		}
		System.out.printf("대문자 : %d 소문자 : %d 숫자 : %d", large, small, num);
		sc.close();
	}
}
