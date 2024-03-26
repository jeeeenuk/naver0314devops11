package day0326;

abstract class AbsEx1{
    abstract public void play();
}
abstract class AbsEx2 extends AbsEx1{
    @Override
    public void play() {
        System.out.println("Playing --> 1");
    }
    abstract public void study();
}
class AbsEx3 extends AbsEx2{
    @Override
    public void play() {
        //super.play();
        System.out.println("Playing --> 2");
    }

    @Override
    public void study() {
        System.out.println("Studying");
    }
}
public class Ex02Abstract {
    public static void main(String[] args) {
        AbsEx2 absEx3 = new AbsEx3();
        absEx3.play();
        absEx3.study();
    }
}
