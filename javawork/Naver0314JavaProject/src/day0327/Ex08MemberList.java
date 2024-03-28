package day0327;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex08MemberList {
    List<MemberDto> list = new ArrayList<MemberDto>();
    Scanner sc = new Scanner(System.in);
    static final String PATH = "/Users/jeenukjung/Desktop/naver0314/member.txt";
    public Ex08MemberList(){
        memberReadFile();
    }
    public void memberReadFile(){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(PATH);
            br = new BufferedReader(fr);
            while (true){
                String line = br.readLine();
                if (line==null) break;
                String []a = line.split(",");
                MemberDto memberDto = new MemberDto();
                memberDto.setName(a[0]);
                memberDto.setHp(a[1]);
                memberDto.setAddr(a[2]);
                memberDto.setBlood(a[3]);
                list.add(memberDto); // list 에 추가
            }
            System.out.printf("** 총 %d명의 정보를 읽어 왔습니다. **\n", list.size());
        } catch (IOException e) {
            System.out.println("읽어올 멤버 정보가 없습니다.");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException|NumberFormatException e) {
            }
        }
    }
    public void memberFileSave(){
        FileWriter fw = null;
        try {
            fw = new FileWriter(PATH);
            for(MemberDto dto:list){
                String s = dto.getName()+","+dto.getHp()+","+dto.getAddr()+","+dto.getBlood()+"\n";
                fw.write(s);
            }
            System.out.printf("총 %d개의 정보를 파일에 저장하였습니다.\n", list.size());
        } catch (IOException e) {
        } finally {
            try {
                fw.close();
            } catch (IOException | NumberFormatException ignored) {
            }
        }
    }
    public int getMenu(){
        int menu = 0;
        System.out.println("1. 멤버 추가");
        System.out.println("2. 멤버 삭제");
        System.out.println("3. 멤버 출력");
        System.out.println("4. 이름 검색");
        System.out.println("5. 번호 검색");
        System.out.println("6. 저장 후 종료");
        System.out.println("--------------");
        try {
            menu = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("번호를 숫자로 입력하시오");
        }
        return menu;
    }
    public void addMember(){
        System.out.print("이름을 입력하시오 : ");
        String name = sc.nextLine();
        System.out.print("번호를 입력하시오 : ");
        String hp = sc.nextLine();
        System.out.print("주소를 입력하시오 : ");
        String addr = sc.nextLine();
        System.out.print("혈액형을 입력하시오 : ");
        String blood = sc.nextLine();

        MemberDto memberDto = new MemberDto(name, hp, addr, blood);
        list.add(memberDto);
        System.out.printf("%d 번째 멤버 정보를 추가하였습니다 !", list.size());
    }
    public void deleteMember(){
        /*
        삭제할 이름을 입력후 해당 이름에 해당하는 멤버정보를 삭제한다.
        없을경우 "--- 님은 명단에 없습니다."
        있을경우 "--- 님의 정보를 삭제하였습니다."
         */
//        System.out.print("삭제할 이름을 이름을 입력하시오 : ");
//        String name = sc.nextLine();
//        for (int i = 0; i < list.size(); i++) {
//            MemberDto memberDto = list.get(i);
//            if (memberDto.getName().equals(name)) {
//                list.remove(i);
//                System.out.println("%d 님의 정보를 삭제하였습니다.");
//            }
//            else System.out.printf("%s 님은 명단에 없습니다.",name);
//        }
        boolean f = false;
        System.out.println("삭제할 멤버명을 입력하세요");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            MemberDto memberDto = list.get(i);
            if (memberDto.getName().equals(name)){
                f = true;
                list.remove(i);
                break;
            }
        }
        if(f) System.out.printf("%s님의 정보를 삭제하였습니다.", name);
        else System.out.printf("%s님은 명단에 없습니다.", name);
    }
    public void writeMember(){
        System.out.println("\t ** 멤버 명단 출력 ** \t");
        System.out.println("-".repeat(40));
        System.out.println("번호\t이름\t핸드폰\t주소\t혈액형");
        System.out.println("-".repeat(40));

        for (int i = 0; i < list.size(); i++) {
            MemberDto memberDto = list.get(i);
            System.out.printf("%d\t%s\t%s\t%s\t%s\n",i+1, memberDto.getName(),memberDto.getHp(),
                    memberDto.getAddr(),memberDto.getBlood().toUpperCase());
        }
        System.out.println("-".repeat(40));
    }
    public void searchName(){
        /*
            검색할 이름 입력, 성만 입력해도 해당 성을 가진 사람 출력(startsWith)
            한명도 없을 경우 "--- 님은 명단에 없습니다."

            이름 : ---
            핸드폰 : ---
            주소 : ---
            혈액형 : ---
            ----------------
            이름 : ---
            핸드폰 : ---
            주소 :---
            혈액형 : ---
            ----------------
         */
        boolean f = false;
        System.out.print("검색할 이름을 입력하시오 : ");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            MemberDto memberDto = list.get(i);
            if (memberDto.getName().startsWith(name)){
                f = true;
                System.out.printf("이름 : %s\n", memberDto.getName());
                System.out.printf("핸드폰 : %s\n", memberDto.getHp());
                System.out.printf("주소 : %s\n", memberDto.getAddr());
                System.out.printf("혈액형 : %s형\n", memberDto.getBlood().toUpperCase());
                System.out.println("-".repeat(20));
            }
        }
        if (!f) System.out.printf("%s님은 명단에 없습니다.", name);
    }
    public void searchPhone(){
        /*
            검색할 핸드폰 끝 4자리 입력하면 그 번호를 사진 사람 출력 (endsWith)
            한명도 없을 경우 "==== 번호를 가진 멤버는 없습니다."
         */
        boolean f = false;
        System.out.print("검색할 번호를 입력하시오 : ");
        String num = sc.nextLine();
        for (MemberDto memberDto:list){
            if (memberDto.getHp().endsWith(num)){
                f = true;
                System.out.printf("이름 : %s\n", memberDto.getName());
                System.out.printf("핸드폰 : %s\n", memberDto.getHp());
                System.out.printf("주소 : %s\n", memberDto.getAddr());
                System.out.printf("혈액형 : %s형\n", memberDto.getBlood().toUpperCase());
                System.out.println("-".repeat(20));
            }
        }
        if (!f) System.out.printf("%s 번호를 가진 멤버는 없습니다.", num);
    }
    public static void main(String[] args) {
        Ex08MemberList ex = new Ex08MemberList(); //이것을 넣어주는 이유 ?
        while (true){
            int menu = ex.getMenu();
            switch (menu){
                case 1: ex.addMember(); break;
                case 2: ex.deleteMember(); break;
                case 3: ex.writeMember(); break;
                case 4: ex.searchName(); break;
                case 5: ex.searchPhone(); break;
                case 6: ex.memberFileSave();
                    System.out.println("** 멤버 정보를 저장후 종료합니다. **");
                    System.exit(0); // 완전히 종료 !
                default:
                    System.out.println("잘못된 번호입니다.");
            }
            System.out.println();
        }
    }
}
