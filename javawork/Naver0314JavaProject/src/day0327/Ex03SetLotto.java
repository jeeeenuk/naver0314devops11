package day0327;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex03SetLotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> setLotto = new TreeSet<>();
        while (true){
            System.out.println("구입할 로또 금액을 입력하세요. (종료 : 0)");
            int money = Integer.parseInt(sc.nextLine());
            if (money == 0){
                System.out.println("프로그램 종료");
                break;
            }
            if (money < 1000){
                System.out.println("\t 금액이 부족합니다.");
                break;
            }
            for (int i = 0; i < money/1000; i++) {
                //6개의 중복되지 않은 로또 숫자 구하기 (1~45)
                //기존 값 모두 삭제후 다시 구하기
                setLotto.clear();

                while (setLotto.size()!=6){
                    int n = (int)(Math.random()*45)+1;
                    setLotto.add(n);
                    //if (setLotto.size()==6) break;
                }
                //System.out.printf("%d번 로또 번호 : %s\n",i+1,setLotto); //출력1
                System.out.printf("%d번 로또 번호 : ",i+1); //출력2
                for(int lotto:setLotto){
                    System.out.printf("%3d", lotto);
                }
                System.out.println();
            }
        }
    }
}
