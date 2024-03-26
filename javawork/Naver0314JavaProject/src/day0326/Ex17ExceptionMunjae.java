package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
        score.txt 를 읽어서 총갯수와 총점, 평균을 구하시오.
        단, 점수에 문자가 있는 경우 갯수에서 제외하고 총점에서도 제외하고 결과 출력이 되도록 하기

        예)
        갯수 : 13개
        총점 : 993
        평균 : 78.24
 */
public class Ex17ExceptionMunjae {
    static final String SCORE = "/Users/jeenukjung/Desktop/naver0314/workall/javawork/Naver0314JavaProject/src/day0326/score.txt";
    public static void readScore(){
        BufferedReader br = null;
        FileReader fr = null;
        int count = 0, sum = 0;

        try {
            fr = new FileReader(SCORE);
            System.out.println("** SCORE 파일 불러오는 중 ... **");
            br = new BufferedReader(fr);
            while (true) {
                String line = br.readLine(); //파일의 내용을 한줄씩 읽어온다..
                if (line == null) break; //만약 더이상 데이터가 없을 경우 null 값이 반환된다.
//                sum += Integer.parseInt(line);
//                count++;
                try {
                    sum += Integer.parseInt(line);
                    count++;
                } catch (NumberFormatException e) {
                }
                //System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("** 파일을 찾을 수 없습니다. **");
        } catch (IOException e) {
        } finally {
            System.out.printf("갯수 : %d\n", count);
            System.out.printf("총점 : %d\n", sum);
            System.out.printf("평균 : %f\n", (double) sum / count);
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        readScore();
    }
}
