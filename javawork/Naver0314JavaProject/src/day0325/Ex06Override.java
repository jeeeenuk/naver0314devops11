package day0325;

class Parent2{
    public void job(){
        System.out.println("부모 클래스에서 해야할 일 처리 ...");
    }
}
class Sub2 extends Parent2{
    public void job(){
        super.job(); // 같은 이름의 method 가 현재 class 에 존재(Override)하므로 부모가 가진 method 호출시 반드시 super 로 호출한다.
        System.out.println("자식 클래스에서 해야할 일 처리 ...");
    }
}
public class Ex06Override {
    public static void main(String[] args) {
        Sub2 sub2 = new Sub2();
        sub2.job(); //sub2 가 가진 job method 가 호출된다.
    }
}
