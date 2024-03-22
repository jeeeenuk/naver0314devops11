package day0322;

class Oper{
    static public int sum(int a, int b){
        return a+b;
    }
    static public double sum(double a, double b){
        return a+b;
    }
    static public String sum(String a, String b){
        return a+b;
    }
    //Variable Argument
    static public int hap(int ...n) //갯수 제한 없이 인자로 받을 수 있다..
    {
        System.out.println("전달받은 숫자의 갯수 : " + n.length);
        int s=0;
        for (int i = 0; i < n.length; i++) {
            System.out.printf("%d ",n[i]);
            s+=n[i];
        }
        System.out.println();
        return s;
    }
    public static void writeColor(String ...color){
        System.out.printf("총 %d개의 색상 전달 받음 !\n", color.length);
        for (int i = 0; i < color.length; i++) {
            System.out.printf("%s : %s\n",i,color[i]);
        }
        System.out.println("-".repeat(10));
    }
}
public class Ex04Overloading {
    public static void main(String[] args) {
        System.out.println(Oper.sum(5,100));
        System.out.println(Oper.sum(5.3,2.7));
        System.out.println(Oper.sum("Apple","Banana"));

        System.out.printf("총 합계: %d\n", Oper.hap(3,6,8));
        System.out.printf("총 합계: %d\n", Oper.hap(3,6,8,9,4));

        Oper.writeColor("Red"); Oper.writeColor("Gray", "Green","Blue","White");
    }
}
