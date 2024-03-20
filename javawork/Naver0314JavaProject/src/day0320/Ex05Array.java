package day0320;

public class Ex05Array {
	public static void main(String[] args) {
		//배열을 선언하는 여러가지 방법
		int []arr1;
		//arr1 에 배열 갯수 할당
		arr1=new int[5]; //각 배열에 0의 초기값이 할당됨(객체인 경우 null 값으로 할당)
		
		System.out.printf("arr1의 갯수 : %d\n", arr1.length);
		System.out.println("** arr1 의 초기값 출력 **");
		for(int i=0;i<arr1.length;i++) System.out.printf("%d : [%2d]\n",i,arr1[i]);
		
		System.out.println("** 배열에 일부 값을 변경 후 출력 **");
		arr1[0]=5; arr1[1]=30;
		for(int i=0;i<arr1.length;i++) System.out.printf("%d : [%2d]\n",i,arr1[i]);
		
		System.out.println("** 다른 방법으로도 출력해보자(for 문) **");
		for(int a:arr1) System.out.printf("%3d",a); //값만 가지고 올 때 사용하기 용이
	}
}
