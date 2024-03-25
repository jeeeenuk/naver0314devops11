package day0325;

public class Ex02ClassStudent {
    public static void main(String[] args) {
        Student []s = new Student[4];
        s[0] = new Student();
        s[1] = new Student("이영자");
        s[2] = new Student(100, 90);
        s[3] = new Student("강호동", 89, 70);

        System.out.println("** 전체 학생정보 출력 **");
        System.out.println("번호\t이름\t자바\t스프링\t총점\t평 균\t등 급");
        System.out.println("-".repeat(30));

        for (int i = 0; i < s.length; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%s\t%f\t%s\n",i+1, s[i].getName(), s[i].getJava(), s[i].getSpring(),
                    s[i].getTotal(), s[i].getAverage(), s[i].getGrade());
        }
        System.out.println("0번 학생의 [이름 자바 스프링] 수정");
        s[0].setName("이하나");
        s[0].setScore(89, 81);

        System.out.println("1번 학생의 [스프링] 수정");
        s[1].setSpring(99);

        System.out.println("2번 학생의 [자바] 수정");
        s[2].setJava(60);

        System.out.println("** 수정된 데이터로 다시 출력하기 **");
        System.out.println("번호\t이름\t자바\t스프링\t총점\t평균\t등급");
        System.out.println("-".repeat(30));

        for (int i = 0; i < s.length; i++) {
            System.out.printf("%d\t%s\t%d\t%d\t%s\t%.1f\t%s\n",i+1, s[i].getName(), s[i].getJava(), s[i].getSpring(),
                    s[i].getTotal(), s[i].getAverage(), s[i].getGrade());
        }
    }
}
