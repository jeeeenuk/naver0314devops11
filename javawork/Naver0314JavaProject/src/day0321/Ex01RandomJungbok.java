package day0321;

public class Ex01RandomJungbok {
	public static void main(String[] args) {
		/*
		 * 1~30 까지의 난수 10개를 발생, 중복처리하기
		 */
		int []rand=new int[10];
		Exit:
		for (int i = 0; i < rand.length; i++) {
			int n=(int)(Math.random()*30)+1;
			rand[i]=n;
			
			//중복처리
			for(int j = 0; j < i; j++) {
				if(rand[i]==rand[j]) {
					i--;
					continue Exit;
				}
			}
		}
		// 순차적 정렬(오름차순)
		for(int i=0;i<rand.length-1;i++) {
			for(int j=i+1;j<rand.length;j++) {
				if(rand[i]>rand[j]) {
					int temp=rand[i];
					rand[i]=rand[j];
					rand[j]=temp;
				}
			}
		}
		
		System.out.println("1~30 사이의 중복되지 않은 난수 구하기");
		for(int i = 0; i < rand.length; i++) {
			System.out.printf("%4d",rand[i]);
		}
	}
}
