package day0322;

class Orange{
    //private 접근지정자는 같은 Class 안에서만 접근이 가능
    //멤버 변수는 자동 초기화
    private String name;
    private int age;

    private static String company="Samsung";
    //static 변수를 반환하는 메서드
    public static String getCompany(){
        return company;
    }


    //getter 메서드 : 멤버변수값을 반환하는 메서드(규칙 getName, getAge)
    public String getName(){
        //return name;//같은 구역 안에서 같은 이름이 없을경우에만 this 생략이 가능
        return this.name;//this : 자기자신을 의미하는 인스턴스 변수(일반 멤버메서드에만 존재, static 메서드에는 없음)
    }
    public int getAge(){
        return this.age;
    }

    //외부로부터 값을 받아서 멤버변수의 값을 변경
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
}
public class Ex02Object {
    public static void main(String[] args) {
        Orange or=new Orange();
        System.out.println(or.getAge());
        System.out.println(or.getName());

        or.setAge(23);
        or.setName("진욱이");
        System.out.println(or.getAge());
        System.out.println(or.getName());

        //static method 호출도 클래스명으로 호출이 가능하다.
        System.out.println(Orange.getCompany());
    }
}
