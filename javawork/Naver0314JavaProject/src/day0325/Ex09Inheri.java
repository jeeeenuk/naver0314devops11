package day0325;

import day0320.Ex08ArraySearchNum;

class Animal{
    public void writeAnimal(){
        System.out.println("Animal 부모 클래스 !");
    }
}
class Cat extends Animal{
    @Override
    public void writeAnimal() {
        super.writeAnimal();
        System.out.println("나는 야옹!! 고양이 입니다.");
    }
    public void play(){
        System.out.println("야옹야옹!");
    }
}
class Dog extends Animal{
    @Override
    public void writeAnimal() {
        super.writeAnimal();
        System.out.println("나는 멍멍!! 강아지 입니다.");
    }
    public void play(){
        System.out.println("멍멍 !");
    }
}
public class Ex09Inheri {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.writeAnimal();
        dog.play();

        Cat cat = new Cat();
        cat.writeAnimal();
        cat.play();
        System.out.println("------------------");
        /*
            부모 클래스로 선언, 자식 클래스로 생성
            다형성이라고 한다.
            Override method 에 한해서만 호출이 가능
            writeAnimal method 는 호출이 가능하지만, play method 는 호출할 수 없다.
         */
        Animal animal = null;
        animal = new Cat();
        animal.writeAnimal();
//        animal.play(); // Error

        animal = new Dog();
        animal.writeAnimal();
    }
}
