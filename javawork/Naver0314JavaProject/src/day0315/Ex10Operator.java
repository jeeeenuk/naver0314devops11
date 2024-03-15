package day0315;

public class Ex10Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		// 전치일경우는 1순위, 후치일경우는 끝순위
		// 반드시 초기값 세팅이 되어있어야 한다
		
		int m=5, n=5;
		int a=10, b=10;
		// 단, 단항일 경우는 상관없음
		m++; ++n;
		System.out.println("m : "+m); //6
		System.out.println("n : "+n); //6
		
		a+=m++; //a=a+m , m=m+1 -> 후치는 제일 마지막에 증가한다
		System.out.println("a : "+a); //16
		System.out.println("m : "+m); //7
		
		b+=++n; //n=n+1, b=b+n  -> 먼저 증가 후 b에 더해짐
		System.out.println("b : "+b); //17
		System.out.println("n : "+n); //7
		
		m=5;
		System.out.println(m++); //먼저 출력 후 (5) 메모리에 증가 (6)
		
		n=5;
		System.out.println(++n); //먼저 증가 후 출력 (6)
		
		System.out.println("m : "+m+",n : " +n); //메모리에 증가된 m, 증가 먼저 되어서 출력된 n (6,6)
	}

}
