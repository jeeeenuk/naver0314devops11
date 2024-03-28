package day0327;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    1. 학생 정보 추가 : 이름, 나이 ,3 과목 점수 입력 (exception 포함)
    2. 학생 정보 삭제 : 이름으로 찾아서 삭제 (없을 경우 메세지 출력)
    3. 전체 출력 : 번호, 이름, Java,Spring,Html,총점,평균,등급 출력
    4. 평균으로 검색 : 평균값을 입력하면 그 평균값 이상의 학생들을 출력
    5. 이름으로 검색 : 입력한 이름을 포함하고 있으면 출력 (contains)
    6. 저장 후 종료
 */
public class Ex09VectorMunjae {
    List<StudentDto> list = new ArrayList<StudentDto>();
    static final String PATH = "/Users/jeenukjung/Desktop/naver0314/Student.txt";
    Scanner sc = new Scanner(System.in);
    public Ex09VectorMunjae() throws IOException {
        readFile();
    }
    public void readFile() throws IOException {
        FileReader fileReader = new FileReader(PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null){
            String []a = line.split(",");
            StudentDto studentDto = new StudentDto();
            studentDto.setName(a[0]);
            studentDto.setAge(Integer.parseInt(a[1]));
            studentDto.setJava(Integer.parseInt(a[2]));
            studentDto.setSpring(Integer.parseInt(a[3]));
            studentDto.setHtml(Integer.parseInt(a[4]));
            list.add(studentDto); // list 에 추가
        }
        System.out.printf("** 총 %d명의 정보를 읽어 왔습니다. **\n", list.size());
        bufferedReader.close();
        fileReader.close();
    }
    public void saveFile() throws IOException {
        FileWriter fileWriter = new FileWriter(PATH);
        for (StudentDto studentDto:list){
            String s = studentDto.getName()+","+ studentDto.getAge()+","+studentDto.getJava()+","
                    +studentDto.getSpring()+","+ studentDto.getHtml()+"\n";
            fileWriter.write(s);
        }
        System.out.printf("총 %d개의 정보를 파일에 저장하였습니다.\n", list.size());
        fileWriter.close();
    }
    public int makeMenu(){
        int menu = 0;
        System.out.println("-".repeat(14));
        System.out.println("1.학생 정보 추가");
        System.out.println("2.학생 정보 삭제");
        System.out.println("3. 전 체 출 력 ");
        System.out.println("4.평균 으로 검색");
        System.out.println("5.이름 으로 검색");
        System.out.println("6. 저장 후 종료");
        System.out.println("-".repeat(14));
        try {
            menu = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
        }
        return menu;
    }
    public void addStu(){
        System.out.print("이름을 입력하시오 : "); String name = sc.nextLine();
        System.out.print("나이를 입력하시오 : "); int age = Integer.parseInt(sc.nextLine());
        System.out.print("Java 점수를 입력하시오 : "); int java = Integer.parseInt(sc.nextLine());
        System.out.print("Spring 점수를 입력하시오 : "); int spring = Integer.parseInt(sc.nextLine());
        System.out.print("Html 점수를 입력하시오 : "); int html = Integer.parseInt(sc.nextLine());

        StudentDto studentDto = new StudentDto(name, age, java, spring, html);
        list.add(studentDto);
        System.out.println("학생 정보 추가 완료");
    }
    public void deleteStu(){
        System.out.print("삭제할 이름 입력 :");
        String name = sc.nextLine();
        boolean f = false;
        for (int i = 0; i < list.size(); i++) {
            StudentDto studentDto = list.get(i);
            if (studentDto.getName().equals(name)){
                f = true;
                list.remove(i);
                break;
            }
        }
        if(f) System.out.printf("%s님의 정보를 삭제하였습니다.", name);
        else System.out.printf("%s님은 명단에 없습니다.", name);
    }
    public void printStu(){
        System.out.println("** 전 체 출 력 **");
        System.out.println("  이름\t\t나이\t\tJava\t\tSpring\t\tHtml\t\t총점\t\t평균\t\t등급");
        System.out.println("-".repeat(76));

        for (int i = 0; i < list.size(); i++) {
            StudentDto studentDto = list.get(i);
            System.out.printf("%s\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%f\t\t%s\n",studentDto.getName(), studentDto.getAge(),
                    studentDto.getJava(), studentDto.getSpring(), studentDto.getHtml(), studentDto.getTotal(),
                    studentDto.getAvg(), studentDto.getGrade());
        }
    }
    public void searchAvg() {
        System.out.print("평균값을 입력하시오 : ");
        double num = Double.parseDouble(sc.nextLine());
        if (num > 100 || num < 0)
            throw new IllegalArgumentException();
        for (StudentDto studentDto:list){
            if (studentDto.getAvg() > num)
                System.out.println(studentDto.getName());
        }
    }
    public void searchName(){
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        for (StudentDto studentDto:list){
            if (studentDto.getName().contains(name)){
                System.out.println(studentDto.getName());
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Ex09VectorMunjae ex = new Ex09VectorMunjae();
        Scanner sc = new Scanner(System.in);
        while (true){
            int menu = ex.makeMenu();
            try {
                switch (menu) {
                    case 1:
                        ex.addStu();
                        break;
                    case 2:
                        ex.deleteStu();
                        break;
                    case 3:
                        ex.printStu();
                        break;
                    case 4:
                        ex.searchAvg();
                        break;
                    case 5:
                        ex.searchName();
                        break;
                    case 6:
                        ex.saveFile();
                        System.out.println("** 저장 후 종료 **");
                        System.exit(0);
                    default:
                        System.out.print("잘못 입력 하였습니다.");
                }
            } catch (IllegalArgumentException e){
                System.out.println("잘못 입력 하셨습니다.");
            }
            System.out.println();
        }
    }
}
