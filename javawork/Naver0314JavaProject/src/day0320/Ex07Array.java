package day0320;

public class Ex07Array {
	public static void main(String[] args) {
		int []data= {23,100,200,-13,67,-123,78,345,-3,110};
		int max, min;
		max=min=data[0];
		System.out.printf("Data length : %s\n",data.length);
		
		for(int i=1;i<data.length;i++) {
			if(max<data[i]) max=data[i];
			if(min>data[i]) min=data[i];
		}
		System.out.printf("Max : %d\n",max);
		System.out.printf("Min : %d\n",min);
		
		int pcnt=0, mcnt=0;
		//양수, 음수 갯수 출력
		for(int i=0;i<data.length;i++) {
			if(data[i]>0) pcnt++;
			else if(data[i]<0) mcnt++;
			else System.out.println("0");
		}
		System.out.printf("pcnt : %d\nmcnt : %d",pcnt,mcnt);
	}
}
