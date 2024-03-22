package day0322;

class Stu{
    String name="정진욱";
    String blood="A";
    int age=6;
}
public class Ex06CallByReference {
    public static void changeStu(Stu a) {
        //주소를 통해서 main 의 s 변수의 값을 직접 변경
        a.age = 28;
        a.blood = "B";
    }
    public static void main(String[] args) {
        Stu s=new Stu();
        System.out.printf("%d %s %s\n", s.age, s.blood, s.name);
        changeStu(s); //Call By Reference : 주소가 전달
        System.out.printf("%d %s %s\n", s.age, s.blood, s.name);
    }
}
