package day0319;

public class Ex04MunjaeGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%37s\n\n","구구단");
		for (int i = 2; i < 10; i++) {
			System.out.printf("  %d단  \t",i);
		}
		System.out.println();
		System.out.println("=".repeat(63)); //.repeat str반복할때 사용
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%dx%d=%2d|\t",j,i,j*i);
			}
			System.out.println();
		}
	}
}
