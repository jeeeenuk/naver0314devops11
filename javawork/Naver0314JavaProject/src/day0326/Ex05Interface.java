package day0326;

interface Apple{
    public void one();
}
interface Banana extends Apple{
    public void two();
}
class Orange implements Banana{
    @Override
    public void one() {
        System.out.println("One");
    }

    @Override
    public void two() {
        System.out.println("Two");
    }
    public void three(){
        System.out.println("Three");
    }
}

public class Ex05Interface {
    public static void main(String[] args) {
        Banana banana = new Orange();
        banana.one();
        banana.two();
        ((Orange)banana).three();
    }
}
