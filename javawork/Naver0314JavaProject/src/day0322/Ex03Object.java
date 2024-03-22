package day0322;

class MyShop{
    private String sanpum;
    int su, dan;
    private static String message; //공유 되는 값
    public static final String SHOP="24시간 이마트"; //외부에서도 접근이 가능하게

    //setter method
    public void setSanpum(String sanpum){
        this.sanpum=sanpum;
    }
    public void setSu(int su){
        this.su=su;
    }
    public void setDan(int dan){
        this.dan=dan;
    }
    static public void setMessage(String message){
        //static 멤버변수는 같은 구역에 같은 이름의 변수가 있을 경우 앞에 클래스명을 생략하지 말고 써준다.
        MyShop.message=message;
    }
    //상품명, 수량, 단가를 한번에 변경하고 싶을 경우
    public void setData(String sngpum,int su, int dan){
        this.setSanpum(sanpum);
        this.setSu(su);
        this.setDan(dan);
    }
    //overloading method(중복함수):메서드명은 같으나 인자가 달라야 한다
    public void setData(String sngpum,int su, int dan, String message){
        this.setSanpum(sanpum);
        this.setSu(su);
        this.setDan(dan);
        //인스턴스메서드에서 static 메서드 호출이 가능하다
        //반대로 static 메서드에서 인스턴스 멤버메서드를 호출할 수 없다.
        //static 메서드에서 같은 static 메서드는 호출이 가능하다.
        setMessage(message);
    }
    //출력은 getter 가 아닌 일반 멤버 메서드로 만들어보자
    public  void writeData(){
        System.out.printf("상품명 : %s\n", sanpum);
        System.out.printf("수량 : %d, 단가 : %d\n",su,dan);
        System.out.printf("총금액 : %d\n", su*dan);
        System.out.printf("오늘의 메세지 : %s\n",message);
        System.out.println("-".repeat(30));
    }
}

public class Ex03Object {
    /*
            static 예약어
            static 예약어는 메서드(멤버함수)나 멤버변수에 정의 할 수 있으며 지역 변수나 클래스에게는 정의 할 수 없다.
            메서드(멤버함수)나 멤버변수에 static 이라는 예약어를 정의하면 static 메서드와 static 변수라고 불리게 된다.

            그 이유는 멤버 변수나 메서드들은 해당 객체가 생성될 때 객체가 생상된 메모리 공간에 같이 존재하게 되지만
            static 으로 선언된 메서드나 변수들은 static 영역(메소드 영역)이라는 곳에 유일하게 만들어 지면서
            모든 객체(Object)들이 사용 할 수 있도록 공유개념을 가진다.
     */
    public static void main(String[] args) {
        MyShop sang1 = new MyShop();
        MyShop sang2 = new MyShop();
        MyShop sang3 = new MyShop();

        System.out.println("** 상품 1 **");
        sang1.setSanpum("딸기");
        sang1.setSu(3);
        sang1.setDan(2300);
        MyShop.setMessage("오늘 각종 과일 세일합니다!!");
        sang1.writeData();

        System.out.println("** 상품 2 **");
        sang2.setData("수박", 2, 30000);
        sang2.writeData();

        System.out.println("** 상품 3 **");
        sang3.setData("참외", 5, 2000, "오늘 세일 마감 !");
        sang3.writeData();

        System.out.println("** 상품 1 다시 출력 **");
        sang1.writeData();

        System.out.println("** 상품 2의 수량만 변경 **");
        sang2.setSu(5);
        sang2.writeData();
    }
}
