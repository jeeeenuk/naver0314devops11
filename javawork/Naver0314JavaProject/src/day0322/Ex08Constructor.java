package day0322;
/*
        생성자(Constructor) 의 특징
        1. 클래스 명과 동일한 메서드 명으로 만들어야 한다. (반드시)
        2. return type 이 없다.
        3. Overloading 이 가능하다. (여러개 생성 가능)
        4. 생성할 때 단 한번 호출된다.
        5. 멤버변수의 초기화를 담당한다.
        6. 접근지정자
 */

class Kiwi{
    String name, addr;
    Kiwi(){
        System.out.println("디폴트 생성자");
        name = "정진욱";
        addr = "분당";
    }
    public void show(){
        System.out.printf("%s 님은 %s에 살고 있어요.\n",name, addr);
    }
    Kiwi(String name){
        this.name=name;
        //addr="서울";
    }
    Kiwi(String name, String addr){
        this.name=name;
        this.addr=addr;
    }
}
public class Ex08Constructor {
    public static void main(String[] args) {
        Kiwi k1 = new Kiwi();
        k1.show();
        Kiwi k2 = new Kiwi("강호동");
        k2.show();
        Kiwi k3 = new Kiwi("영숙이", "부산");
        k3.show();

    }
}
