package day0321;

import java.util.Scanner;

public class Ex09ArrayDoubleBingo {
    public static void main(String[] args) {
        /*
        1~3 사이의 난수를 발생한 후 가로, 세로, 대각선 방향으로
        같은 숫자가 나올경우 bingo 변수를 1증가하여 빙고갯수를 구하고
        같은 숫자가 없을 경우 꽝! 이라고 출력
         */
        int [][]arr=new int[3][3]; //3행3열
        int bingo;
        Scanner sc=new Scanner(System.in);
        while (true){
            bingo=0;
            //2차원 배열에 1~3 의 값을 임의로 발생
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j]=(int)(Math.random()*3)+1;
                }
            }
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    System.out.printf("%4d", anInt);
                }
                System.out.println();
            }
            //빙고갯수나 꽝 출력
            for (int i = 0; i < 3; i++) {
                if (arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2]) bingo++; //행방향
                if (arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i]) bingo++; //열방향
            }
            if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]) bingo++;
            if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0]) bingo++;

            if(bingo==0) System.out.println("\t꽝 !");
            else System.out.printf("\t%d개 빙고",bingo);

            String ans=sc.nextLine();
            if(ans.equalsIgnoreCase("X")){
                System.out.println("** 빙고게임을 종료합니다. **");
                break;
            }
        }
    }
}
