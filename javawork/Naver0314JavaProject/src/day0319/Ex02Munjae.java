package day0319;

public class Ex02Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2. 	1!=1
		 * 		2!=2
		 * 		3!=6
		 * 		4!=24
		 * 		... 10!까지
		 */
		int factorial=1;
		for(int i=1;i<=10;i++) {
			factorial*=i;
			System.out.printf("%d! = %d\n",i,factorial);
		}
	}
}
