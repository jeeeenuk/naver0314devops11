package day0320;

import java.util.Scanner;

public class Ex08ArraySearchNum {
	public static void main(String[] args) {
		/*
		 * 숫자(num)을 입력하여 배열에 몇번째에 있는지 출력
		 * 없을경우 없다고 메세지 출력, 반복해서 검색(0 입력시 종료)
		 */
		int []data= {12,3,6,1,7,10,8,5,16,19};
		int searchIndex,num;
		Scanner sc=new Scanner(System.in);
		while(true) {
			searchIndex=-1;
			System.out.print("검색할 숫자를 입력하시오 (0 : 종료) : ");
			num = sc.nextInt();
			if(num==0) {
				System.out.println("검색을 종료합니다.");
				break;
			}
			for(int i=0;i<data.length;i++) {
				if(num==data[i]) {
					searchIndex=i;
					break;
				}
			}
			if(searchIndex==-1) System.out.printf("%d is out of data\n\n",num);
			else System.out.printf("숫자 %d은 %d번째에 있습니다\n\n",num, searchIndex+1);
		}
		sc.close();
	}
}
