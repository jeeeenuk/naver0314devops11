package day0326;

//abstract(추상화) 메서드는 오버라이드만을 목적으로 body(){} 없이 구현하고자 할 경우 사용한다.
//abstract 메서드를 한개 이상 포함하고 있는 클래스일 경우 클래스 역시 추상화 시켜야 한다. -> method 만 abstract 할 수 없음을 의미
//class 앞에 abstract 를 추가해주면 추상화가 된다.
//추상 클래스를 상속받는 서브 클래스는 반드시 추상 메서드를 오버라이드 해야만 하는데, 만약 오버라이드 하지 않았을 경우 서브클래스 역시 추상화 시킨다.
abstract class Animal{
//    public void sound(){
//        System.out.println("**");
//    }
    abstract public void sound();

    //추상 클래스에는 추상 메서드 뿐 아니라 일반 메서드도 포함이 가능
    public void showTitle(){
        System.out.println("--- Show Title ---");
    }
}
class Dog extends Animal{
    @Override
    public void sound(){
        //super.sound();
        System.out.println("멍멍");
    }
}
class Cat extends Animal{
    @Override
    public void sound() {
        //super.sound();
        System.out.println("야옹");
    }
}
class Chick extends Animal{
    @Override
    public void sound() {
        //super.sound();
        System.out.println("삐약");
    }
}

public class Ex01Abstract {
    public static void varAnimal(Animal animal){
        animal.showTitle();
        animal.sound();
    }
    public static void main(String[] args) {
        varAnimal(new Cat());
        varAnimal(new Dog());
        varAnimal(new Chick());
        //varAnimal(new Animal()); //Abstract 일 경우 생성되지 않음..
    }
}
