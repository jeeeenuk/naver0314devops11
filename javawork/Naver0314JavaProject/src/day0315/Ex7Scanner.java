package day0315;

import java.util.Scanner;

public class Ex7Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor, eng;
		String name;
		
		System.out.println("국어점수는 ?");
		kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어점수는 ?");
		eng = Integer.parseInt(sc.nextLine());
		System.out.println("이름은 ?");
		name = sc.nextLine(); // 점수 뒤의 엔터를 읽어온다. (엔터가 버퍼에 저장되어 있는 상태)
		
		System.out.println("Name : " + name);
		System.out.printf("국어 점수 : %d, 영어 점수 : %d \n", kor, eng);
		//결과가 double 이어야 할 경우 수식 중 한개라도 double 타입이 있어야 한다.
		System.out.printf("Total : %d, Average : %3.1f", kor+eng, (kor+eng)/2.0); 
		
	}

}
