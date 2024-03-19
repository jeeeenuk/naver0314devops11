package day0319;

import java.util.StringTokenizer;

public class Ex08String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("** String 객체의 Method 공부하기 **");
		String str1="Have a Nice Day";
		String str2="apple";
		String str3="Apple";
		
		//charAt, indexOf, lastIndexOf, length, concat, toLowerCase, toUpperCase
		System.out.println(str1.charAt(7));//7번 인덱스의 문자 : N
		System.out.println(str1.charAt(0));//0번 인덱스의 문자 : H
		
		System.out.println(str1.indexOf('a'));//첫번째 'a'의 위치 : 1
		System.out.println(str1.indexOf('X'));//첫번째 'X'의 위치 : -1 (없을 경우 -1)
		
		System.out.println(str1.lastIndexOf('a'));//마지막 'a'의 위치 : 13
		
		System.out.println(str1.length());//str1 의 총 길이 : 15
		
		System.out.println(str2.concat("***"));//str2 문자에 *** 추가해서 반환
		System.out.println(str2 + "***");//위와 동일
		
		System.out.println(str1.toLowerCase());//모두 소문자로 변환해서 반환
		System.out.println(str1.toUpperCase());//모두 대문자로 변환해서 반환
		
		//문자열 비교시(값으로 비교시 equal 사용, 동등연산자 사용시 주소를 비교하기 때문에 정확한 값이 나오지 않음)
		System.out.println(str2==str3);//false 가 나오기는 함 (==, 동등연산자는 기본값비교시에만 사용)
		System.out.println("apple".equals(str2));//true
		System.out.println("apple.".equals(str3));//false (대소문자가 다르기 때문에 false 의 값이 반환)
		System.out.println(str2.equals(str3));//false (대소문자가 다르기 때문에 false 의 값이 반환)
		System.out.println(str2.equalsIgnoreCase(str3));//true (대소문자 상관없이 비교)
		
		//문자열 추출 (substring)
		System.out.println(str1.substring(7));//7번 인덱스부터 끝까지 추출 : Nice Day
		System.out.println(str1.substring(7,10));//7번부터 9까지 추출 : Nic
		
		//문자열 비교 (startsWith, endsWith)
		System.out.println(str1.startsWith("Have"));//str1 이 Have 로 시작하면 true : true
		System.out.println(str1.startsWith("Nice"));//str1 이 Nice 로 시작하면 true : false
		
		System.out.println(str1.endsWith("Day"));//str1 이 Day 로 끝날경우 true : true
		System.out.println(str1.endsWith("day"));//str1 이 day 로 끝날경우 true : false
		System.out.println(str1.toLowerCase().endsWith("day"));//str1을 소문자로 변환후 day 로 끝나는지 비교 : true
		
		//compareTo 로 비교시
		System.out.println("apple".compareTo("append"));//'1','e' : 7(양수: 첫문자열이 더 큼), 첫문자열이 작을경우 음수
		System.out.println("apple".compareTo("banana"));//'a','b' 비교 : -1
		System.out.println("apple".compareTo("apple"));//완전히 같을 경우 : 0
		
		//반복 (repeat)
		System.out.println(str2.repeat(3));//appleappleapple
		System.out.println("*".repeat(10));//**********
		
		//일부변경 (replace)
		System.out.println(str1.replace('a', '*'));//H*ve * Nice D*y
		System.out.println(str1.replace("Nice", "Good"));//Have a Good Day
		
		//문자열 분리(결과값이 배열타입)
		String colors="red,blue,green,yellow,pink";
		//, 로 분리를 하고 싶은 경우
		String []a1=colors.split(",");
		System.out.println("분리된 배열의 갯수 : " + a1.length);
		System.out.printf("%s,%s",a1[0],a1[4]);
		
		//분리하는 또다른 방법
		StringTokenizer st = new StringTokenizer(colors,",");
		System.out.printf("\n분리할 토큰수 : %s\n", st.countTokens());
		//분리된 토큰값 출력
		while(st.hasMoreTokens()) {//더이상 토큰이 없을 경우 false 가 되면서 while 문을 빠져 나간다
			System.out.printf("%s\n",st.nextToken());
		}
		
		String msg="   Hello   ";
		System.out.println(msg.length());//11글자
		System.out.println(msg.trim().length());//양쪽 공백 제거 후 5글자 (가운데 공백은 데이터로 저장됨)
		
		//어떤 타입이던간에 String 으로 변환할 때 사용 (valueOf)
		System.out.println(String.valueOf(3));//정수 3이 문자열 "3"으로 반환
		System.out.println(3+"");//이 방법도 존재
	}

}
