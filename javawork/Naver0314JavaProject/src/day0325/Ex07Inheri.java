package day0325;

class Member{
    private String memberName;
    private int memberCount;

    Member(){
        this ("동창회", 10);
    }
    Member(String memberName, int memberCount){
        this.memberName = memberName;
        this.memberCount = memberCount;
    }
    public void writeMember(){
        System.out.printf("모임 이름 : %s\n모임 정원 : %d\n", memberName,memberCount);
    }
}

class SubMember extends Member{
    private String myName;
    private int myAge;

    SubMember(){
        myName = "이름없음";
        myAge = 20;
    }
    SubMember(String memberName, int memberCount, String myName, int myAge){
        super(memberName,memberCount);
        this.myName = myName;
        this.myAge = myAge;
    }

    @Override
    public void writeMember() {
        super.writeMember();
        System.out.printf("내 이름 : %s\n내 나이 : %d\n", myName, myAge);
    }
}
public class Ex07Inheri {
    public static void main(String[] args) {
        SubMember subMember1 = new SubMember();
        subMember1.writeMember();
        System.out.println();
        SubMember subMember2 = new SubMember("701모임", 30, "정진욱", 28);
        subMember2.writeMember();
    }
}
