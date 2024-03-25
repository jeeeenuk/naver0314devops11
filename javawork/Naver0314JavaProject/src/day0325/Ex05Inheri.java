package day0325;

// 같은 패키지 내에서는 부모가 가진 메서드 중 private 을 제외하고 모두 상속 받는다...
class Parent1{
    void method1(){
        System.out.println("default method by Parent");
    }
    protected void method2(){
        System.out.println("protected method by Parent");
    }
    private void method3(){
        System.out.println("private method by Parent");
    }
    public void method4(){
        System.out.println("public method by Parent");
    }
}

// 서브 클래스 구현
class Sub1 extends Parent1{
    public  void show(){
        /*
            현재 class 에 같은 이름의 method 가 존재할 경우
            부모 method 호출시 super 로 호출 한다.

            같은 이름의 method 가 없을 경우 super 대신에 this 로 호출해도 된다.

            같은 이름의 method 를 Override Method 하고 한다 ..
         */
        System.out.println("this 로 호출");
        this.method1(); // default , parent 가 다른 package 에 있다면 default 도 호출 되지 않는다.
        this.method2(); // protected
//        this.method3(); // private 는 상속되지 않는다.
        this.method4(); // public
        System.out.println();
        System.out.println("super 로 호출");
        super.method1();
        super.method2();
        super.method4();
    }
}
public class Ex05Inheri {
    public static void main(String[] args) {
        Sub1 sub = new Sub1();
        sub.show();
    }
}
