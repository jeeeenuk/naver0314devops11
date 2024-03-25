package day0325;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone14-pro","SpaceGray");
        System.out.printf("Model : %s\t", myPhone.model);
        System.out.printf("Color : %s\t", myPhone.color);
        System.out.printf("Wifi : %b\t\n", myPhone.wifi);
        myPhone.bell();
        myPhone.sendVoice("Hello ~ ");
        myPhone.receiveVoice("Hi, My name is Gildong");
        myPhone.sendVoice("All right, nice to meet you");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
