package day0328;

@FunctionalInterface
interface Orange{
    public void write(); // 추상 메서드
    //public void play(); // 오류 발생
}
@FunctionalInterface
interface DaraAdd{
    public void add(int x, int y);
}
public class Ex02Lambda {
    // 익명 내부클래스 형태로 Orange 를 구현
    Orange or = new Orange() {
        @Override
        public void write() {
            System.out.println("Eating Orange ...");
        }
    };
    public void lambdaMethod(){
        Orange or2 = ()-> System.out.println("Eating Orange Lambda ...");
        or2.write();

        Orange or3 = () -> {
            System.out.println("Lambda");
            System.out.println("isGood");
        };
        or3.write();

        Orange or4 = new Orange() {
            @Override
            public void write() {
                System.out.println("Orange with AbstractMethod");
            }
        };
        or4.write();
    }

    public void lambdaMethod2(){
        DaraAdd add1 = (int x, int y)-> System.out.printf("두 수의 합 : %d", x+y);
        add1.add(10,20);
        add1.add(5, 6);
    }
    public static void main(String[] args) {
        Ex02Lambda ex = new Ex02Lambda();
        ex.or.write();
        ex.lambdaMethod();
        ex.lambdaMethod2();
    }
}
