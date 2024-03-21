package day0315;

public class Ex1DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바에서의 데이터 타입에 대하여 알아보자
		/*
		 * 	2024. 03. 15 수업 둘째날
		 * 	자바에서의 주석처리 하는 방법
		 * 	자바이름 변경을 위해서는 .java -> Refactor -> Rename ...
		 */
		// 기본 자로형 공부
		// 구역 ({}) 안에서 선언하는 변수들은 자동초기화가 되지 않으므로 
		// 지역변수는 자동초기화가 되지 않기 때문에 초기값을 넣어주어야 한다.
		boolean flag = true;
		boolean flag2;
		flag2 = false;
		
		System.out.println(flag);
		System.out.println(flag2);
		System.out.println(!flag); //!(not) : 반대로 출력,true -> false / false -> true
		System.out.println(!flag2);
		
		// && : 둘 다 true 일 경우 true
		// || : 둘 중 하나만 true 라도 결과는 true
		System.out.println(flag && flag2); // false
		System.out.println(flag || flag2); // true
	}

}
