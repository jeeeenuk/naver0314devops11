package day0326;

import java.util.Date;

public class Ex14Exception {
    public static void go1() throws NullPointerException{
        //Date date = null;
        Date date = new Date();
        System.out.println(date.getYear() + 1900);

        String a = "12a";
        int n = Integer.parseInt(a);
        System.out.println(n+10);
    }
    public static void main(String[] args) {
        try {
            go1();
        }catch (NullPointerException e){
            System.out.println("Date 클래스 생성을 안하고 메서드 호출 : " + e.getMessage());
        }catch (NumberFormatException e1){
            System.out.println("문자가 있어서 숫자 변환시 오류 발생 : " + e1.getMessage());
        }finally {
            System.out.println("이 영역은 무조건 실행");
        }
        System.out.println("** 정상 종료 **");
    }
}
