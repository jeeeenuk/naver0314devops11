package Studying;

class Accounting{
    // 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;
    public Accounting(double valueOfSupply){
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT(){
        return valueOfSupply * vatRate;
    }
    public double getTotal(){
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0);

        System.out.printf("Value of supply : %f\n", a1.valueOfSupply);
        System.out.printf("Value of supply : %f\n\n", a2.valueOfSupply);
        System.out.printf("VAT             : %f\n", a1.getVAT());
        System.out.printf("VAT             : %f\n\n", a2.getVAT());
        System.out.printf("Total           : %f\n", a1.getTotal());
        System.out.printf("Total           : %f\n\n", a2.getTotal());

//        Accounting.valueOfSupply = 15000.0;
//        System.out.printf("Value of supply : %f\n", Accounting.valueOfSupply);
//        System.out.printf("VAT             : %f\n", Accounting.getVAT());
//        System.out.printf("Total           : %f\n", Accounting.getTotal());
    }
}
