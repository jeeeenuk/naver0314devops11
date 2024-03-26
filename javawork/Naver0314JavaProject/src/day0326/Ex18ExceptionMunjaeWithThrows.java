package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex18ExceptionMunjaeWithThrows {
    static final String SCORETHROWS="/Users/jeenukjung/Desktop/naver0314/workall/javawork/Naver0314JavaProject/src/day0326/score.txt";
    public static void readScore() throws IOException {
        FileReader fr = new FileReader(SCORETHROWS);
        System.out.println("** SCORE 파일 불러오는 중 **");
        BufferedReader br = new BufferedReader(fr);
        int count = 0, sum = 0;

        while (true){
            String line = br.readLine();
            if (line == null) break;
            try {
                sum += Integer.parseInt(line);
                count++;
            } catch (NumberFormatException e){
            }
        }
        System.out.printf("갯수 : %d\n", count);
        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평균 : %f\n", (double) sum / count);
        br.close(); fr.close(); // 꺼주는 것을 습관화 시킨다 ...
    }
    public static void main(String[] args) throws IOException {
        readScore();
    }
}
