package day0327;

public class StudentDto {
    private String name;
    private int age;
    private int java;
    private int spring;
    private int html;

    public StudentDto() {
        super();
    }
    public StudentDto(String name, int age, int java, int spring, int html) {
        this.name = name;
        this.age = age;
        this.java = java;
        this.spring = spring;
        this.html = html;
    }
    public int getTotal(){
        return java+spring+html;
    }
    public double getAvg(){
        return getTotal()/3.0;
    }
    //getAvg() 의 값이 90이상이면 "*****", 80 이상이면 "****", 70 이상이면 "***", 나머지는 "*"
    public String getGrade(){
        if (getAvg()>=90) return "*****";
        else if (getAvg()>=80) return "****";
        else if (getAvg()>=70) return "***";
        else return "*";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getJava() {
        return java;
    }
    public void setJava(int java) {
        this.java = java;
    }
    public int getSpring() {
        return spring;
    }
    public void setSpring(int spring) {
        this.spring = spring;
    }
    public int getHtml() {
        return html;
    }
    public void setHtml(int html) {
        this.html = html;
    }
}
