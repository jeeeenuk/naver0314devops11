package day0325;

//상속
class AA{
    AA(){
        System.out.println("AA 의 default 생성자");
    }
    AA(String msg){
        System.out.println(msg + " 를 받는 생성자(AA)");
    }
}

class BB extends AA{
    BB(){
        super(); // 생략되어 있음. 부모의 default 생성자를 호출
        System.out.println("BB 의 default 생정자");
    }
    BB(String msg){
        super(msg); // 생략 되지 않는다. default 인 경우만 생략 가능
        System.out.println(msg + " 를 받는 생성자(BB)");
    }
}

public class Ex04Inheri {
    public static void main(String[] args) {
        BB b1 = new BB();
        BB b2 = new BB("Hello");
    }
}
