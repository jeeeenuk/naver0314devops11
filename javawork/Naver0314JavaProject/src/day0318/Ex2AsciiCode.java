package day0318;

public class Ex2AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char는 내부적으로 int 타입으로 인식
		char a = 'A';
		char b = 65; //AsciiCode 65 = 'A'
		System.out.println(a+","+b);
		System.out.printf("a = %d, %c\n", (int)a,a);
		System.out.println(a+3); //68, char + int = int
		System.out.println((char)(a+3)); //68 -> D
		
		char c = '7';
		System.out.println(c);//char 7
		System.out.println(c+2); //57, '7' + 2 -> 55 + 2
		//숫자 7로 변경 후 계산하고자 하는 경우
		int n1 = c-'0'; //55-48 = 7
		System.out.println(n1);//int 7
		System.out.println(n1+2);//7+2 = 9
	}

}
