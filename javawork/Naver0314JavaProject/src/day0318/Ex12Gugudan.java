package day0318;

import java.util.Scanner;

public class Ex12Gugudan {
	public static void main(String[] args) {
		/*
		 * 구구단? 11
		 * 잘못된 숫자입니다. : if문
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 ?");
		int dan = sc.nextInt();
		if(dan>10) {
			System.out.println("잘못된 숫자입니다.");
		}
		System.out.printf("** %d단 **\n", dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n",dan, i, dan*i);
		}
		sc.close();
	}
}
