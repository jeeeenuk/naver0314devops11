package day0318;

import java.util.Scanner;

public class Ex01Munjae {
	public static void main(String[] args) {
		/*
		 * 점수(score)를 입력 후 점수가
		 * 90 이상이면 A
		 * 80 이상이먄 B
		 * 70 이상이면 C
		 * 60 이상이면 D
		 * 나머지는 F 를 출력
		 */
		Scanner sc = new Scanner(System.in);
		int score;
		String msg;
		
		System.out.println("점수를 입력하시오");
		score = sc.nextInt();
		if (score>100||score<1) {
			System.out.println("잘못된 점수입니다.");
			sc.close();
			return; //main 메서드를 종요(곧 프로그램이 종료됨)
		}
		
		msg = score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
		
		System.out.printf("%d는 %s학점입니다.", score, msg);
		
		sc.close();
	}
}
