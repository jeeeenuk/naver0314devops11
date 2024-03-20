package day0320;

import java.util.Random;

public class Ex02RandomClass {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r);//java.uti.Random@35bbe5e8
		
		System.out.println("** Random Class를 이용한 난수 구하기");
		System.out.println("1. 0 ~ 9 난수 구하기");
		for(int i=1; i<=5; i++) {
			int n=r.nextInt(10);//int 로 형변환을 해줘야 함
			System.out.printf("%3d", n);
		}
		System.out.println();
		System.out.println("2. 1 ~ 10 난수 구하기");
		for(int i=1; i<=5; i++) {
			int n=r.nextInt(10);
			System.out.printf("%3d", n+1);
		}
		System.out.println();
		System.out.println("3. 1 ~ 100 난수 구하기");
		for(int i=1; i<=5; i++) {
			int n=r.nextInt(10);
			System.out.printf("%3d", (n*10)+1);
		}
		System.out.println();
		System.out.println("4. \"A ~ Z\" (65-90) 난수 구하기");
		for(int i=1; i<=5; i++) {
			int n=r.nextInt(26)+65;
			System.out.printf("%3c", (char)n);
		}
		System.out.println();
		System.out.println("5. \"a ~ z\" (97-122) 난수 구하기");
		for(int i=1; i<=5; i++) {
			int n=r.nextInt(26)+97;
			System.out.printf("%3c", (char)n);
		}
		System.out.println();
	}
}
