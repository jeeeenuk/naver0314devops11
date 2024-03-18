package day0318;

import java.util.Scanner;

public class Ex6ScoreSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// eclipse 단축키 자동 들여쓰기 (command + i )
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;

		System.out.println("점수를 입력하시오");
		score = sc.nextInt();
		if (score>100||score<1) {
			System.out.println("잘못된 점수입니다.");
			sc.close();
			return; //main 메서드를 종요(곧 프로그램이 종료됨)
		}
//		switch(score/10) {
//		case 10: case 9:
//			grade = 'A'; break;
//		case 8:
//			grade = 'B'; break;
//		case 7:
//			grade = 'C'; break;
//		case 6:
//			grade = 'D'; break;
//		default:
//			grade = 'F';
//		}
		
		if(score>=90)
			grade='A';
		else if(score>=80)
			grade='B';
		else if(score>=70)
			grade='C';
		else if(score>=60)
			grade='D';
		else
			grade='F';
		System.out.printf("%d점은 %c학점 입니다.", score, grade);
		sc.close();
	}

}
