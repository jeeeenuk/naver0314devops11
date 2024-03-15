package day0315;

public class Ex3Output {
	
	public static void main(String[] args) {
		int year = 2024;
		int month = 3;
		int day = 15;
		
		String msg = "Have a nice day !";
		char blood = 'B';
		double avg = 97.4567;
		
		System.out.println("** 출력 1 **");
		System.out.println("날짜 : " + year + "-" + month + "-" + day);
		System.out.print("Blood Type : " + blood + " Type");
		System.out.println("\tAverage : " + avg);
		System.out.println("========================");
		// printf 를 이용해서 출력
		// 변환기호를 이용해서 출력
		// 정수 : %d
		// 실수 : %f
		// 문자 : %c
		// 문자열 : %s
		System.out.printf("*%41s*\n\n" , msg); // 우측 기준으로 40칸의 뒤에 출력
		System.out.printf("*%-41s*\n\n" , msg); // 우측 기준으로 40칸의 뒤에 출력
		
		System.out.printf("Date : %d-%d-%d\n", year, month, day);
		System.out.printf("Date : %2d-%2d-%2d\n", year, month, day); 	//2칸중 비어있는 곳이 공백으로 남
		System.out.printf("Date : %02d-%02d-%02d\n", year, month, day); //2칸중 비어있는 곳이 0으로 채워 
		
		System.out.printf("My BloodType is [Type %c]\n", blood);
		System.out.printf("Average : %f\n", avg);	//%f : 소수점이하 6자리로 출력
		System.out.printf("Average : %.2f\n", avg);	//%.f : 소수점이하 2자리로 출력
		System.out.printf("Average : %10.2f\n", avg);	//%.f : 소수점 이하 10자리로 출력, 공백인 경우 0으로 출력
		System.out.printf("Average : %-10.2f\n", avg);
	}

}
