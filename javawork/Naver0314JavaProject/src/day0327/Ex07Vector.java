package day0327;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
    1. 이름 추가
    2. 이름 삭제
    3. 이름 출력
    4. 이름 검색
    5. 종료
 */
public class Ex07Vector {
    Scanner sc = new Scanner(System.in);
    List<String> list = new Vector<String>();

    //메뉴 선택시 번호 반환
    public int getMenu(){
        int menu = 0;
        System.out.println("-".repeat(48));
        System.out.println("1.이름추가 | 2.이름삭제 | 3.이름출력 | 4.이름검색 | 5.종료");
        System.out.println("-".repeat(48));
        menu = Integer.parseInt(sc.nextLine());
        return menu;
    }
    public void addPerson(){
        System.out.print("추가할 이름 입력 : ");
        String name = sc.nextLine();
        list.add(name);
        System.out.printf("%d 번째 멤버를 추가했어요 !\n", list.size());
    }
    public void deletePerson(){
        System.out.print("삭제할 이름 입력 : ");
        String name = sc.nextLine();
        boolean f = list.remove(name);
        if (!f) System.out.printf("%s 님은 명단에 없습니다.\n", name);
        else System.out.printf("%s 님을 명단에서 삭제했습니다.\n", name);
    }
    public void listPeron(){
        System.out.println("** 멤버 현황 **");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n", i+1, list.get(i));
        }
    }
    public void searchPerson(){

    }
    public static void main(String[] args) {
        Ex07Vector ex = new Ex07Vector();
        while(true){
            int menu = ex.getMenu();
            if (menu == 5){
                System.out.println("** 종료합니다 **");
                break;
            }
            switch (menu){
                case 1: ex.addPerson(); break;
                case 2: ex.deletePerson(); break;
                case 3: ex.listPeron(); break;
                case 4: ex.searchPerson(); break;
                default: System.out.println("잘못된 숫자입니다."); break;
            }
        }
    }
}
