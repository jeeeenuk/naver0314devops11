package day0320;

public class Ex06Array {
	public static void main(String[] args) {
		//배열을 선언하면서 초기값을 지정하는 경우
		int []arr1= {4,5,6,8,10,30};
		System.out.println("** case #1 **");
		for(int i=0;i<arr1.length;i++) System.out.printf("%d : %2d\n",i,arr1[i]);
		System.out.println("** case #2 **");
		for(int a:arr1) System.out.printf("%4d", a);
		System.out.println();
		
		int []arr2;
		arr2=new int[] {10,20,30,40};
		System.out.printf("arr2의 갯수 : %d", arr2.length);
		System.out.println();
		for(int n:arr2) System.out.printf("%4d", n);
		System.out.println();
		
		//문자열 배열
		String []str1= {"김영자","이미자","강호동","이재성"};
		String []str2;
		str2=new String[] {"apple","orange","strawberry","melon"};
		
		//출력
		for(int i=0;i<str1.length;i++) System.out.printf("%d : %s\n",i,str1[i]);
		System.out.println();
		for(String p:str2) System.out.printf("%s ", p);
	}
}
