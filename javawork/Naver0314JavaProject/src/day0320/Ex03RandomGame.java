package day0320;

import java.util.Random;
import java.util.Scanner;

public class Ex03RandomGame {
	public static void main(String[] args) {
		/*
		 * 1. 1~100 사이의 난수를 발생한 후 숫자 알아맞추기
		 * 2. 숫자 입력시 앞에 횟수를 출력
		 * 3. 숫자 n 이 난수보다 크면 (n 보다 작습니다)
		 * 4. 숫자를 맞췄을 경우 (횟수, 정답 출력)
		 * 5. 계속 숫자 맞추기 게임을 하시겠습니까?(y/n)
		 */
		Scanner sc = new Scanner(System.in);
		Random r=new Random();
		int su, count, rnd;

		Exit:
			while(true) {
				count=0; //횟수 초기화
				rnd = r.nextInt(100)+1;//난수 발생
				System.out.println("== 숫자 맞추기 게임 ==");
				while(true) {
					System.out.print(++count + "회 :");
					su=Integer.parseInt(sc.nextLine());
					if(su>rnd) System.out.println("\t"+su+"보다 작습니다");
					else if(su<rnd) System.out.println("\t"+su+"보다 큽니다");
					else {
						System.out.println();
						System.out.printf("** 정답(%d)입니다 **", rnd);
						System.out.println("\n\n[계속 : y ][종료 : n ]을 눌러주세요");
						String ans=sc.nextLine();
						if(ans.equalsIgnoreCase("y")) {
							System.out.println("** 새로운 게임을 시작합니다 **");
							break;
						}
						else {
							break Exit; //밖 while 문으로 빠져 나간다.
						}
					}
				}
			}
		System.out.println("** 게임을 종료합니다 **");
		sc.close();
	}
}
