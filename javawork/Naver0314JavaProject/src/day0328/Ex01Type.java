package day0328;

class GenericType<T>{
    T []v;

    public void set(T[] n) {
        this.v = n;
    }
    public void print(){
        for(T s:v) System.out.println(s+"  ");
        System.out.println();
    }
}
public class Ex01Type {
    public static void main(String[] args) {
        String []s = {"장미","안개","국화","프리지아"};
        Integer []n = {100,98,43,54,99};
        Double []d = {34.5,89.7,90.5};

        GenericType<String> gt1 = new GenericType<>();
        gt1.set(s);
        gt1.print();
        GenericType<Integer> gt2 = new GenericType<>();
        gt2.set(n);
        gt2.print();
        GenericType<Double> gt3 = new GenericType<>();
        gt3.set(d);
        gt3.print();
    }
}
