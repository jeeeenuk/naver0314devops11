package day0321;

public class Ex02ArraySort {
	public static void main(String[] args) {
//		int a=10, b=20, temp;
//		System.out.printf("a= %d, b= %d\n",a,b);
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.printf("a= %d, b= %d\n",a,b);
		
		int []arr= {5,8,2,1,10};
		//selection sort
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//if(arr[i<arr[j]]) // 내림차순 정렬
				if(arr[i]>arr[j]) { // 오름차순 정렬
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a:arr) System.out.print(a+"\t");
	}
}
