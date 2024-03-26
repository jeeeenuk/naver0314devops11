package day0326;

interface Tire {
    void roll();
}
class HankookTire implements Tire {
    @Override
    public void roll() {
        System.out.println("HankookTire");
    }
}
class KumhoTire implements Tire {
    @Override
    public void roll() {
        System.out.println("KumhoTire");
    }
}
class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new KumhoTire();
    void run(){
        tire1.roll();
        tire2.roll();
    }
}
public class Ex08Book376 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new HankookTire();
        myCar.run();
    }
}
