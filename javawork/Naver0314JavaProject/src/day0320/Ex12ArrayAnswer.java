package day0320;

import java.util.Scanner;

public class Ex12ArrayAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
