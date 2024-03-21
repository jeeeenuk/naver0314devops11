package day0321;

public class Ex03ArrayStringSort {
	public static void main(String[] args) {
		String []arr= {"하석진","강호동","강호마","Candy","손석구"};
	    for(int i=0;i<arr.length-1;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i].compareTo(arr[j])>0) {
	    			String stemp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=stemp;
	    		}
	    	}
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.printf("%s\t",arr[i]);
	    }
	}
}
