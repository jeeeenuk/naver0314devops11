package day0320;

public class Ex01MathRandom {
	public static void main(String[] args) {
		System.out.println("** Math.random() 을 이용한 난수 구하기 **");
		System.out.println("1. random() 값");
		for(int i=1;i<=5;i++) {
			double d=Math.random();//0.0 보다 크거나 같고 1.0보다는 작은 난수 발생
			System.out.println(d);
		}
		System.out.println();
		System.out.println("2. 0~9 발생");
		for(int i=1;i<=5;i++) {
			int n=(int)(Math.random()*10);
			System.out.printf("%3d", n);
		}
		System.out.println();
		System.out.println("3. 1~10 발생");
		for(int i=1;i<=5;i++) {
			int n=(int)(Math.random()*10)+1;
			System.out.printf("%3d", n);
		}
		System.out.println();
		System.out.println("4. 1~100 발생");
		for(int i=1;i<=5;i++) {
			int n=(int)(Math.random()*100)+1;
			System.out.printf("%3d", n);
		}
		System.out.println();
		System.out.println("5. \"A~Z\" 발생");
		for(int i=1;i<=5;i++) {
			int n=(int)(Math.random()*26)+65; //65~90만 (65+26-1 = 90) -> 초기값 + (마지막값-초기값+1) -1 = 마지막값
			System.out.printf("%3c", (char)n);
		}
		System.out.println();
		System.out.println("6. \"a~z\" 발생");
		for(int i=1;i<=5;i++) {
			int n=(int)(Math.random()*(122-97+1))+97;
			System.out.printf("%3c", (char)n);
		}
	}
}
