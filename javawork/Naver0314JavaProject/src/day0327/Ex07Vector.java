package day0327;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
    1.이름추가 | 2.이름삭제 | 3.이름출력 | 4.이름검색 | 5.저장&종료

    종료시 파일에 저장
    처음 생성시 파일에서 읽어올 것
 */
public class Ex07Vector {
    static final String FILENAME = "/Users/jeenukjung/Desktop/naver0314/person.txt";
    Scanner sc = new Scanner(System.in);
    List<String> list = new Vector<String>();
    public Ex07Vector() throws IOException {
        personRead();
    }
    public void personRead() throws IOException {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            while (true){
                String name = br.readLine();
                if(name == null) break;
                list.add(name);
            }
            System.out.printf("총 %d명의 멤버를 파일에서 읽어 추가합니다.\n", list.size());
        } catch (FileNotFoundException e) {
            System.out.println("읽어올 명단이 없습니다.");
        } finally {
            if (br!=null) br.close();
            if (fr!=null) fr.close();
        }

    }
    public void personSave(){
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME);
            for(String s:list){
                fw.write(s+"\n");
            }
            System.out.printf("총 %d명의 명단을 파일에 저장합니다.\n", list.size());
        } catch (IOException e) {
        } finally {
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }
    //메뉴 선택시 번호 반환
    public int getMenu() {
        int menu = 0;
        System.out.println("-".repeat(48));
        System.out.println("1.이름추가 | 2.이름삭제 | 3.이름출력 | 4.이름검색 | 5.저장&종료");
        System.out.println("-".repeat(48));
        menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    public void addPerson() {
        System.out.print("추가할 이름 입력 : ");
        String name = sc.nextLine();
        list.add(name);
        System.out.printf("%d 번째 멤버를 추가했어요 !\n", list.size());
    }

    public void deletePerson() {
        System.out.print("삭제할 이름 입력 : ");
        String name = sc.nextLine();
        boolean f = list.remove(name);
        if (!f) System.out.printf("%s 님은 명단에 없습니다.\n", name);
        else System.out.printf("%s 님을 명단에서 삭제했습니다.\n", name);
    }

    public void listPeron() {
        System.out.println("** 멤버 현황 **");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n", i + 1, list.get(i));
        }
    }

    public void searchPerson() {
        System.out.print("이름 검색 : ");
        String name = sc.nextLine();

        // 방법 1
        if (list.contains(name)) {
            System.out.printf("%s님은 %d번 째에 있습니다.\n", name, list.indexOf(name)+1);
        } else System.out.printf("%s님은 명단에 없습니다.\n", name);
        //---------------------------------------------------------------------------
        // 방법 2
//        boolean f = false;
//        for (int i = 0; i < list.size(); i++) {
//            String listName = list.get(i);
//            if (listName.equals(name)){
//                f = true;
//                System.out.printf("%s님은 %d번 째에 있습니다.\n", name, i+1);
//            }
//        }
//        if (!f) System.out.printf("%s님은 명단에 없습니다.\n", name);
    }

    public static void main(String[] args) throws IOException {
        Ex07Vector ex = new Ex07Vector();
        while (true) {
            int menu = ex.getMenu();
            if (menu == 5) {
                ex.personSave();
                System.out.println("** 명단을 파일에 저장후 종료합니다 **");
                break;
            }
            switch (menu) {
                case 1:
                    ex.addPerson();
                    break;
                case 2:
                    ex.deletePerson();
                    break;
                case 3:
                    ex.listPeron();
                    break;
                case 4:
                    ex.searchPerson();
                    break;
                default:
                    System.out.println("잘못된 숫자입니다.");
                    break;
            }
        }
    }
}
