package day0325;

public class Ex01ClassShop {
    public static void showTitle(){
        //번호, 상품, 수량, 단가, 총금액
        System.out.println("번호\t상품\t수량\t단가\t총금액");

    }
    public static void writeShop(Shop []myShop){
        for (int i = 0; i < myShop.length; i++) {
//            System.out.printf("%d\t%s\t\t%d\t\t%d\t\t%d\n",i+1, myShop[i].getSang(), myShop[i].getSu(),
//                    myShop[i].getDan(), (myShop[i].getSu()*myShop[i].getDan()));
            System.out.println(i+1 + "\t" + myShop[i].getSang() + "\t" + myShop[i].getSu() + "\t" +
                    myShop[i].getDan()+ "\t" + (myShop[i].getSu()*myShop[i].getDan()));
        }
    }
    public static void main(String[] args) {
//        Shop []myShop = new Shop[4]; //객체 배열 메모리 할당, 초기값은 null
//        myShop[0] = new Shop();
//        myShop[1] = new Shop("딸기");
//        myShop[2] = new Shop(3, 2000);
//        myShop[3] = new Shop("사과", 5, 3000);

        //배열 할당시 생성자 호출하는 방식
        Shop []myShop = {new Shop(), new Shop("딸기"), new Shop(3, 2000), new Shop("사과",5, 3000)};

        showTitle(); //제목을 출력하는 static method
        writeShop(myShop);

        System.out.println();
        System.out.println("0번의 상품명, 수량, 단가 변경");
        myShop[0].setSang("포도");
        myShop[0].setSu(3);
        myShop[0].setDan(2000);

        System.out.println("1번의 상품명, 수량, 단가 변경");
        myShop[1].setSangpum("오렌지", 5, 1200);

        System.out.println();
        System.out.println("** 변경된 값으로 다시 출력 **");
        showTitle();
        writeShop(myShop);
    }
}
