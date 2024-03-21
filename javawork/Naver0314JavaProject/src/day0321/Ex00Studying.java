package day0321;

import java.util.Scanner;

public class Ex00Studying {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []lotto=new int[6];
		int money;

		while (true){
			System.out.println("로또 구입 금액은?");
			money=sc.nextInt();
			if(money<1000){
				System.out.println("부족한 금액입니다");
				continue;
			}

			for (int i = 0; i < lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {
					if (lotto[i]==lotto[j]){
						i--;
						break;
					}
				}
			}
		}
	}
}
