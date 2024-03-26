package day0326;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex15FileException {
    static final String FILENAME="/Users/jeenukjung/Desktop/naver0314/memo1.txt";
    static final String FILENAME2="/Users/jeenukjung/Desktop/naver0314/memo2.txt";
    public static void fileSave(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(FILENAME);
            fileWriter.write("Name : Jung-Jinwook\n");
            fileWriter.write("Age : 28\n");
            fileWriter.write(("Address : Seoul\n"));
            System.out.println("Check the File");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void fileSave2() throws IOException{
        Scanner sc = new Scanner(System.in);
        String name, hp, addr;
        while (true){
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(FILENAME2, true); // 추가모드로 생성
            System.out.print("이름을 입력하세요 (종료:X) : ");
            name = sc.nextLine();
            if (name.equalsIgnoreCase("x")){
                System.out.println("종료합니다.");
                System.exit(0);
            }
            System.out.print("핸드폰 : ");
            hp = sc.nextLine();
            System.out.printf("주소 : ");
            addr = sc.nextLine();

            System.out.println("입력한 정보를 파일에 저장합니다.");
            fileWriter.write("이름 : " + name +"\n");
            fileWriter.write("핸드폰 : " + hp +"\n");
            fileWriter.write("주소 : " + addr +"\n");
            fileWriter.write("=".repeat(15)+"\n");
            System.out.println();
            fileWriter.close();
        }
    }
    public static void main(String[] args) {
        try {
            fileSave2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
