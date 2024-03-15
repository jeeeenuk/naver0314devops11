package day0315;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 선언
		Scanner sc = new Scanner(System.in); // 키보드로부터 입력을 받는 인스턴스 변수
		String msg = "";
		
		System.out.println("Input your message.");
		msg = sc.nextLine(); // 한줄을 통째로 읽는다(문자열)
		System.out.println("입력한 문자열은 \"" + msg + "\" 입니다."); // "출력 : \"
		System.out.println("입력한 문자열은 '" + msg + "' 입니다.");
		
		int age;
		System.out.println("How old are you ?");
		//age = sc.nextInt();
		age = Integer.parseInt(sc.nextLine()); // 숫자를 문자열로 받은 후에 정수형으로 변환
		System.out.println("My age is " + age);
	}

}
