package day0319;

public class Ex01Munjae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 1~100 사이의 소수를 모두 출력하고 몇개인지 갯수를 구하라 (다중 for문)
		 */
		int count=0;
		Loop:
			for(int i=2; i<=1000; i++) {
				for (int j=2; j<i; j++) { //자기자신을 뺀 숫자까지(자기자신을 나누면 나머지가 무조건 0이 나오기 때문에)
					if(i%j==0)//j라는 약수가 있기 때문에 
						continue Loop; //i++로 이동
				}
				count++;
				System.out.printf("%4d", i);
				if(count%5==0) //5개씩 출력시키기 위함
					System.out.println();
			}
		System.out.printf("\n소수의 개수 : %d", count);
	}
}
