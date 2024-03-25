package day0325;

class Phone2{
    private String model;
    private String color;

    public Phone2(String model, String color) {
        super();
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class SmartPhone2 extends Phone2{
    private String wifi;
    public SmartPhone2(String model, String color, String wifi) {
        super(model, color);
        this.wifi = wifi;
    }
    public void info(){
        System.out.printf("Model : %s\t", this.getModel());
        System.out.printf("Color : %s\t", this.getColor());
        System.out.printf("Wifi : %s\n", wifi);
    }
}
public class Ex08Inheri {
    public static void main(String[] args) {
        SmartPhone2 smartPhone1 = new SmartPhone2("iPhone15-Pro","RoseGold","KT");
        smartPhone1.info();

        SmartPhone2 smartPhone2 = new SmartPhone2("Galaxy24-Ultra", "White","SKT");
        smartPhone2.info();
    }
}
