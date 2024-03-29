package day0322;
class Member {
    private String name;
    private String hp;
    private String addr;

    //생성자
    Member(){
        this ("*","*","*");
    }
    Member(String name){
        //this.name = name;
        //this (name,"","");
        this (); // 아무 값도 들어가지 않기 때문에 생성자 본인이 출력
    }
    Member(String name, String hp){
//        this.name = name;
//        this.hp = hp;
        this (name, hp, "*");
    }
    Member(String name, String hp, String addr){
        this.name = name;
        this.hp = hp;
        this.addr = addr;
    }
    //setter
    public void setName(String name) {this.name = name;}
    public void setHp(String hp){this.hp = hp;}
    public void setAddr(String addr) {this.addr = addr;}
    //getter
    public String getName() {return name;}
    public String getHp() {return hp;}
    public String getAddr() {return addr;}

}
public class Ex10ClassMunjae {
    public static void writeMember(Member m){
        System.out.printf("%s  %s  %s\n",m.getName(), m.getHp(), m.getAddr());
    }
    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member("이강인");
        Member m3 = new Member("손흥민","010-2222-3333");
        Member m4 = new Member("Candy","010-444-5555","제주도");

        System.out.println("-- 멤버 명단 출력 --");
        writeMember(m1); writeMember(m2); writeMember(m3); writeMember(m4);

        System.out.println("-- m1 멤버의 값 변경하기 --");
        m1.setName("이영자");
        m1.setHp("011-2323-6767");
        m1.setAddr("부산");

        writeMember(m1);
    }
}
