package day0318;

import java.util.Scanner;

public class Ex8Munjae {
	public static void main(String[] args) {
		/*
		 * 상품명(sang)과 수량(su), 단가(dan) 입력받은 후
		 * 총금액(total) 을 구하고 만약 수량이 5개 이상이면
		 * "10프로"할인입니다"와 함께할인된 금액(dctotal)을 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		String sang;
		int su, dan, total;
		double dctotal;
		
		System.out.println("상품명은 ?");
		sang = sc.nextLine();
		System.out.println("수량은 ?");
		su = sc.nextInt();
		System.out.println("단가는 ?");
		dan = sc.nextInt();
		total = su * dan;
		
		System.out.printf("%s %d개의 총금액 : %d", sang, su, total);
		
		if(su>=5) {
			dctotal = total * 0.9;
			System.out.println("\n10프로 할인입니다.");
			System.out.printf("10프로 할인된 금액 : %.0f",dctotal);
		}
		sc.close();
	}
}
