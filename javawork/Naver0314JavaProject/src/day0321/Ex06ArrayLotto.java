package day0321;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06ArrayLotto {
    /*
    money 를 입력하면 해당 횟수만큼 로또 구하기
    로또 : 1~45 까지의 중복되지 않은 숫자

    로또 금액 입력 ? 800
        금액이 부족합니다.
    로또 금액 입력 ? 0
        종료합니다.(while 문 종료)
    로또 금액 입력 ? 3000
        1회 : 4 7 12 34 44 45
        2회 : 3 7 9 13 39 43
        3회 : ...
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lotto = new int[6];
        int money;

        while (true) {
            System.out.print("로또 금액을 입력하시오 (0:종료) : ");
            money = sc.nextInt();
            if (money == 0) break; //0 입력시 종료
            if (money < 1000) {
                System.out.println("부족한 금액입니다. 재입력하세요.");
                continue;
            }

            for (int k = 0; k < money / 1000; k++) {
                Exit:
                for (int i = 0; i < lotto.length; i++) {
                    // 랜덤번호 생성1
                    lotto[i] = (int) (Math.random() * 45) + 1;
                    for (int j = 0; j < i; j++) {
                        if (lotto[i] == lotto[j]) {
                            i--;
                            continue Exit;
                        }
                    }
                }

                for (int i = 0; i < lotto.length - 1; i++) {
                    for (int j = i + 1; j < lotto.length; j++) {
                        if (lotto[i] > lotto[j]) {
                            int temp = lotto[i];
                            lotto[i] = lotto[j];
                            lotto[j] = temp;
                        }
                    }
                }
                System.out.printf("%2d 회 : ", k + 1);
                System.out.println(Arrays.toString(lotto));
//                for (int j : lotto) {
//                    System.out.printf("%3d", j);
//                }
                //System.out.println();
            }
        }
    }
}
