package day0326;

interface InterA{
    int MAX = 10; //상수이지만 구분할 필요가 없으므로 final 생략이 가능
    public void disp(); //추상메서드 이지만 구분할 필요가 없으므로 abstract 생략이 가능
    public void study();
}
class MyInter implements InterA{
    @Override
    public void disp() {
        System.out.printf("Disp : %d\n", MAX);
    }

    @Override
    public void study() {
        System.out.println("Study");
    }
    public void play(){
        System.out.println("Play");
    }
}
public class Ex04Interface {
    public static void main(String[] args) {
        InterA interA = new MyInter();
        interA.disp();
        interA.study();
        //interA.play(); //Error

        //서브클래스로 형변환 후 호출해야 한다.
        ((MyInter)interA).play();

    }
}
