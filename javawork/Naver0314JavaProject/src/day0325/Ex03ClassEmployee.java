package day0325;

public class Ex03ClassEmployee {
    public static void showTitle(){
        System.out.println("번호\t이름\t\t직급\t나이\t기본급\t수당\t\t실수령액");
        System.out.println("-".repeat(43));
    }
    public static void main(String[] args) {
        Employee []em = {
                new Employee(),
                new Employee("강호동", "사원", 30),
                new Employee("유재석", "과장", 40),
                new Employee("이영자", "차장", 45),
                new Employee("손미나",23)
        };

        //0번 데이터 수정
        em[0].setName("이광수");
        em[0].setPosition("사원");
        em[0].setAge(29);
        em[0].setGibon(340);
        em[0].setSudang(23);

        //1번 데이터 수정
        em[1].setPay(450, 100); //기본급과 수당을 같이 수정

        //2번 데이터 수정
        em[2].setSawon("유재남", "계장", 41); //name, position, age
        em[2].setPay(410, 80);

        //3번 데이터 수정
        em[3].setPay(560, 120);

        //4번 데이터 수정
        em[4].setPosition("사원");
        em[4].setPay(289, 67);

        //출력
        showTitle(); //static method 로 제목 출력
        for (int i = 0; i < em.length; i++) {
            System.out.printf("%d\t%s\t%s\t%d\t%d\t\t%d\t\t%d\n", i+1, em[i].getName(), em[i].getPosition(), em[i].getAge(),
                    em[i].getGibon(), em[i].getSudang(), em[i].getNetpay());
        }
    }
}
