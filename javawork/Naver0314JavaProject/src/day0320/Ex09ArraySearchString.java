package day0320;

import java.util.Scanner;

public class Ex09ArraySearchString {
	public static void main(String[] args) {
		/*
		 * 검색할 이름(searchName) 을 입력하면 몇번째에 있는지 출력
		 * 없을 경우 없다고 출력
		 * (반복해서 검색을 하다가 'q' 나 'Q' 를 입력시 종료
		 */
		String []members = {"강호동","한가인","유재석","이승민","강하나",
				"손미나","이영자","박남정","한지혜","손흥민"};
		String searchName;
		int searchIndex;
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			searchIndex=-1;
			System.out.print("검색할 이름을 입력하시오. (q : 종료) : ");
			searchName = sc.nextLine();
			
			if(searchName.equalsIgnoreCase("q")) {
				System.out.println("검색을 종료합니다");
				break;
			}
			for(int i=0;i<members.length;i++) {
				if(searchName.equals(members[i])) {
					searchIndex=i;
					break;
				}
			}
			if(searchIndex==-1) System.out.printf("%s 는(은) 없는 이름입니다.\n\n",searchName);
			else System.out.printf("입력한 %s는 %d번째에 있습니다\n\n",searchName,searchIndex+1);
		}
		sc.close();
	}
}
