package day0318;

import java.util.Scanner;

public class Ex4SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String color;
		System.out.println("영문으로 색상 입력하기");
		color = sc.nextLine();
		//switch 에서 문자열도 가능(Jdk8부터)
		switch(color) {
		case "RED": //대문자 or 소문자 상관없이
		case "Red":
		case "red":
			System.out.println("빨강색");
			break;
		case "GREEN":
		case "green":
			System.out.println("초록색");
			break;
		case "PINK":
		case "pink":
			System.out.println("분홍색");
			break;
		default:
			System.out.println("그 이외의 색 !");
		sc.close();
		}
	}

}
