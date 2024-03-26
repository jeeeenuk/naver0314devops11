package day0326;

import java.util.Scanner;

public class Ex13Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("두 수를 입력하시오");
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.equals("x")||s2.equals("x")) break;

            // 숫자 형태의 문자열을 숫자로 변환
            // 변환시 문자가 섞여 있으면 NumberFormatException 이 발생 ..
            try {
                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);
                int sum = n1 + n2;
                System.out.printf("%d + %d = %d\n", n1, n2, sum);
            }catch (NumberFormatException e){
                System.out.println("문자가 입력되었습니다 : " + e.getMessage());
            }
        }
        System.out.println("** 정상 종료 **");
    }
}
