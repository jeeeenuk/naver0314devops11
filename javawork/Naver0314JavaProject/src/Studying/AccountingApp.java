package Studying;

class Accounting{
    // 공급가액
    public double valueOfSupply;
    // 부가가치세율
    public static double vatRate = 0.1;
    public double getVAT(){
        return valueOfSupply * vatRate;
    }
    public double getTotal(){
        return valueOfSupply + getVAT();
    }
}
public class AccountingApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting();
        Accounting a2 = new Accounting();

        a1.valueOfSupply = 10000.0;
        a2.valueOfSupply = 20000.0;
        System.out.printf("Value of supply : %f\n", a1.valueOfSupply);
        System.out.printf("Value of supply : %f\n", a2.valueOfSupply);

//        Accounting.valueOfSupply = 15000.0;
//        System.out.printf("Value of supply : %f\n", Accounting.valueOfSupply);
//        System.out.printf("VAT             : %f\n", Accounting.getVAT());
//        System.out.printf("Total           : %f\n", Accounting.getTotal());
    }
}
