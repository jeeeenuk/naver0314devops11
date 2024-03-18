package day0318;

public class Ex9For {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		for (int i = 1; i <= 10; i+=3) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		for (int i ='A'; i <= 'Z'; i++) {
			System.out.printf("%2c", (char)i);
		}
		System.out.println();
		for (int i =65; i <= 90; i++) {
			System.out.printf("%2c", (char)i);
		}
		System.out.println();
		for (int i ='a'; i <= 'z'; i++) {
			System.out.printf("%2c", (char)i);
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%2d", i);
			if(i==5)
				break;//현재 for문을 빠져나온다
		}
		System.out.println();
		
		for (int i = 0; i <= 10; i++) {
			if(i%2==0) //짝
				continue; //짝수는 무시하셈-
			System.out.printf("%2d", i);
		}
	}
}
