package day0326;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex16FileReaderMemo {
    static final String FILENAME2="/Users/jeenukjung/Desktop/naver0314/memo2.txt";
    public static void readMemo2() {
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(FILENAME2);
            System.out.println("** Loading Memo2 File **");
            br = new BufferedReader(fr);
            while (true){
                //파일의 내용을 한줄씩 읽어온다..
                String line = br.readLine();
                //만약 더이상 데이터가 없을 경우 null 값이 반환된다.
                if (line == null) break;;
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("** Memo2 File is NOT **");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
                //e.printStackTrace(); //위와 동일한 녀석임...
            }
        }
    }
    public static void main(String[] args) {
        readMemo2();
    }
}
