package day0321;

import java.util.Scanner;

public class Ex04ArrayAlphaCount {
    public static void main(String[] args) {
        /*
        영어문장을 입력하면 알파벳 기준으로 각각의 갯수를 출력하시오.
        Have a Nice Day!!!!!

        A:3 B:0
         */
        Scanner sc=new Scanner(System.in);
        String msg;
        int []alpha=new int[26];
        System.out.print("영문 문장을 입력하세요. : ");
        msg = sc.nextLine();

        for (int i = 0; i < msg.length(); i++) {
            char ch=msg.toUpperCase().charAt(i); //모두 대문자로 변경후 글자 얻기
            if(ch>='A' && ch<='Z')
                alpha[ch-'A']++;
        }

        for (int i = 0; i < alpha.length; i++) {
            System.out.printf("%c : %d\t",(char)('A'+i),alpha[i]);
            if ((i+1)%5==0) System.out.println();
        }
    }
}
