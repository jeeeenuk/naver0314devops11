package day0322;

import java.util.Scanner;
//Call By Reference ...
public class Ex07ClassSawonArray {
    // 입력받는 메서드
    static public void inputSawonArray(Sawon []sa){
        Scanner sc = new Scanner(System.in);
        System.out.printf("총 %4d 명의 사원 정보를 입력하시오.\n",sa.length);

        for (int i = 0; i < sa.length; i++) {
            System.out.print("사원명은? : ");
            String name=sc.nextLine();
            System.out.print("기본금은 ? : ");
            int gibon=Integer.parseInt(sc.nextLine());
            System.out.print("수당은 ? : ");
            int sudang=Integer.parseInt(sc.nextLine());

            sa[i] = new Sawon(); //초기값이 null 이므로 new 로 생성을 해야 메서드 호출이 가능하다
            sa[i].setSawon(name, gibon, sudang); //생성을 안하고 호출시 널포인트오류 발생
            System.out.println();
        }
    }
    // 출력하는 메서드
    static public void outputSawonArray(Sawon []sa){
        System.out.println("\t\t[사원 급여 현황]\n");
        System.out.println("번호\t사원명\t기본급\t수당\t\t실수령액");
        System.out.println("-".repeat(35));

        for (int i = 0; i < sa.length; i++) {
            System.out.printf("%s\t%s\t%d\t%d\t%d\n",i+1,sa[i].getName(),sa[i].getGibon(),sa[i].getSudang(),sa[i].getNetPay());
        }
    }
    public static void main(String[] args) {
        Sawon []sawon=null; //Reference 변수
        int inwon;
        Scanner sc = new Scanner(System.in);
        System.out.print("직원 인원수는? : ");
        inwon = Integer.parseInt(sc.nextLine());
        sawon = new Sawon[inwon]; //인원 수 만큼 메모리 할당, 초기값은 null
        //Sawon []sawon = new Sawon[inwon];

        inputSawonArray(sawon);
        outputSawonArray(sawon);
    }
}
