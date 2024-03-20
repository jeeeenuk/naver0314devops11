package day0320;

import java.util.Arrays;

public class Ex11ArrayRank {
	public static void main(String[] args) {
		/*
		 * 등수를 구하는데 동점일경우 동순위를 부여
		 * 번호 점수 등수 순으로 출력
		 */
		int []score= {100,90,80,90,70};
		int []rank=new int[5];
		
		for(int i=0;i<score.length;i++) {
			rank[i] =1;
			for(int j=0;j<score.length;j++) {
				if(score[i]<score[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println("번호\t점수\t등수");
		for(int i=0;i<score.length;i++) {
			System.out.printf("%d\t%d\t%d\t\n",i+1,score[i],rank[i]);
		}
		//System.out.println(Arrays.toString(rank));	
	}
}
