package day0321;

import java.util.Arrays;
import java.util.Scanner;

public class Book199_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []student = new int[0];
        int sum=0;
        Exit:
        while (true){
            System.out.println("-".repeat(47));
            System.out.println("1.학생수 | 2.점수입력 | 3. 점수리스트 | 4.분석 | 5.종료");
            System.out.println("-".repeat(47));
            int choose = Integer.parseInt(sc.nextLine()); //몇번을 선택했는지

            switch (choose){
                case 1:{
                    System.out.printf("선택> %d\n", choose);
                    System.out.print("학생수> ");
                    student = new int[Integer.parseInt(sc.nextLine())];
                    System.out.println(Arrays.toString(student));
                    break;
                }
                case 2:{
                    System.out.printf("선택> %d\n", choose);
                    for (int i = 0; i < student.length; i++) {
                        System.out.printf("scores[%d]> ",i);
                        student[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                }
                case 3:{
                    System.out.printf("선택> %d\n", choose);
                    for (int i = 0; i < student.length; i++) {
                        System.out.printf("scores[%d]: %d\n",i,student[i]);
                    }
                    break;
                }
                case 4:{
                    System.out.printf("선택> %d\n", choose);
                    int max = Arrays.stream(student).max().getAsInt();
                    for (int j : student) {
                        sum += j;
                    }
                    System.out.printf("최고 점수 : %d\n",max);
                    System.out.printf("평균 점수 : %.1f\n",(double)sum/ student.length);
                    break;
                }
                case 5:{
                    System.out.println("프로그램 종료");
                    break Exit;
                }
            }
        }
    }
}
