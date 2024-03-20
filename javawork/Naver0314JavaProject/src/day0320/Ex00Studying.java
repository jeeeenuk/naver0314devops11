package day0320;

import java.util.Scanner;

public class Ex00Studying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열은 같은 자료 형들끼리 모아두는 하나의 묶음
		 * 자바에서 하나의 배열은 하나의 객체로 인식
		 * 배열 선언 -> 배열 생성 -> 배열 초기화
		 */
		
		Scanner sc=new Scanner(System.in);
		int inwon;
		int [] kor,eng,tot,rank;
		String []name;
		
		System.out.print("인원수를 입력하시오 :");
		inwon=Integer.parseInt(sc.nextLine());
		
		//배열에 메모리 할당
		name=new String[inwon];
		kor=new int[inwon];
		eng=new int[inwon];
		tot=new int[inwon];
		rank=new int[inwon];
		
		for(int i=0;i<inwon;i++) {
			System.out.printf("%d 번째 데이터 입력",i+1);
			System.out.println("\t이름은?");
			name[i]=sc.nextLine();
			System.out.println("\t국어점수는?");
			kor[i]=Integer.parseInt(sc.nextLine());
			System.out.println("\t영어점수는?");
			eng[i]=Integer.parseInt(sc.nextLine());
			
			tot[i]=kor[i]+eng[i];
		}
		
		for(int i=0;i<inwon;i++) {
			rank[i]=1;
			for(int j=0;j<inwon;j++) {
				if(tot[i]<tot[j]) rank[i]++;
			}
		}
		System.out.println("번호\t이름\t국어\t영어\t총점\t등수");
		for(int i=0;i<inwon;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\n",i+1,name[i],kor[i],eng[i],tot[i],rank[i]);
		}
		sc.close();
	}

}
