package day0322;

class Apple{
    String msg = "Happy Day !"; //인스턴스 멤버 변수
    static String message = "오늘은 금요일"; //static 멤버 변수(클래스 멤버 변수)
}
class Banana{
    static int kor=100;
    static int eng=80;
    String name="마이클";
}
public class Ex01Object {
    //멤버 변수들
    String name = "홍길동";
    final static int Max=100; //static 변수, final : 상수 지정, 값변경이 안됨
    public static void main(String[] args) {
        /*
            static 멤버 메서드는 static 멤버 변수나 멤버 메서드만 접근이 가능
            일반 인스턴스 메서드나 변수를 접근하기 위해서는 new 로 생성 후
            그 변수를 이용해서 호출해야 한다.
         */
        //System.out.println(name); //오류 발생
        System.out.println(Ex01Object.Max); //static 변수는 클래스명, 변수명
        System.out.println(Max); // 같은 클래스일 경우 앞에 클래스명은 생략이 가능

        //name 을 출력하려면 new 로 생성한 인스턴스 변수가 필요하다
        Ex01Object ex = new Ex01Object();
        //ex 가 인스턴스 변수이다. 이 변수를 이용해야만 name 의 접근이 가능하다.
        System.out.println(ex.name);

        Apple ap = new Apple();
        System.out.println(ap.msg);
        System.out.println(Apple.message);

        Banana ba = new Banana();
        System.out.println(ba.name);
        System.out.println(Banana.kor);
        System.out.println(Banana.eng);
        System.out.println(Banana.kor+Banana.eng);
    }
}
