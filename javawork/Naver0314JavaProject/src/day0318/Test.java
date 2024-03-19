package day0318;

public class Test {
	public static void main(String[] args) {
		int Val = 10;
		if (Val<20) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		} //True
		
		System.out.println(Val<20?"True":"False"); //True
		System.out.println(Val>20?"True":"False"); //False
	}
}
