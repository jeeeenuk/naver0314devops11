package day0322;

public class Ex05CallBy {
    public static void changeNum(int n){
        n=10;
    }
    public static void changeArray(int []a){
        a[1]=200;
    }
    static public void changeHome(String home){
        home="Jeju-Island";
    }
    public static void main(String[] args) {
        int n=50;
        changeNum(n); //값만 전달, Call by Value (기본형은 모두 해당)
        System.out.println(n);

        int []arr={3,5,7}; //배열은 객체로 인식
        changeArray(arr); //주소 전달, Call by Reference
        for (int a:arr)
            System.out.printf("%4d", a);
        System.out.println();

        String home = "Seoul";
        changeHome(home); //Call By Value : 주소가 아닌 값이 전달
        System.out.println(home);
    }
}
