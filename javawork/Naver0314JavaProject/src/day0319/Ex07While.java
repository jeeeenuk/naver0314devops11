package day0319;

import java.util.Scanner;

public class Ex07While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * while 문을 이용하여 score 점수를 입력 받은 후
		 * 0을 입력하면 while 문을 빠져 나가서 총 갯수와 합계를 구하시오.
		 * (단, 1~100 이 아닌값은 갯수와 합계에서 제외)
		 */
		Scanner sc = new Scanner(System.in);
		int score, count=0, sum=0;
		while(true) {
			System.out.print("점수 입력(종료:0) :");
			score = sc.nextInt();
			if(score==0)
				break;
			if(score>=1 && score<=100) {
				count++;
				sum += score;
			}
		}
		System.out.printf("입력한 점수 갯수 : %d\n", count);
		System.out.printf("총 합계 : %d", sum);
		sc.close();
	}

}
