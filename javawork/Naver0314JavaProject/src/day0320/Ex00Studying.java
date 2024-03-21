package day0320;

import java.util.Scanner;

public class Ex00Studying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열은 같은 자료 형들끼리 모아두는 하나의 묶음
		 * 자바에서 하나의 배열은 하나의 객체로 인식
		 * 배열 선언 -> 배열 생성 -> 배열 초기화
		 */
		String str1 = "apple";
		String str2 = "apple";
		String str3 = "apple";
		
		String str4 = new String ("apple");
		String str5 = new String ("apple");
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		
//		String str2 = new String("apple");
//		
//		System.out.println(System.identityHashCode(str1));
//		System.out.println(System.identityHashCode(str2));
//		
//		str2 = "orange";
//		System.out.println(System.identityHashCode(str2));
		

	}

}
