package day0326;

abstract class Hello{
    abstract public void study();
}
interface Happy{
    public void insert();
    public void delete();
}
class Kiwi{
    Hello hello = new Hello() {
        @Override
        public void study() {
            System.out.println("익명 내부 클래스에 대해서 공부중");
        }
    };
    Happy happy = new Happy() {
        @Override
        public void insert() {
            System.out.println("Insert");
        }

        @Override
        public void delete() {
            System.out.println("Delete");
        }
    };
}

public class Ex10AnonyInner {
    public static void main(String[] args) {
        Kiwi kiwi = new Kiwi();
        kiwi.hello.study();
        kiwi.happy.insert();
        kiwi.happy.delete();
    }
}
