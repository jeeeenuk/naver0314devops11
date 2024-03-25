package day0325;

public class Shop {
    // 상품, 수량, 단가
    private String sang;
    private int su;
    private int dan;
    public Shop(){
        this ("", 0, 0);
    }
    public Shop(String sang){
        this (sang, 0, 0);
    }
    public Shop(int su, int dan){
        this ("", su, dan);
    }
    public Shop(String sang, int su, int dan){
        this.sang = sang;
        this.su = su;
        this.dan = dan;
    }

    public void setSang(String sang) {
        this.sang = sang;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public void setSu(int su) {
        this.su = su;
    }

    public String getSang() {
        return sang;
    }

    public int getSu() {
        return su;
    }

    public int getDan() {
        return dan;
    }
    public void setSangpum(String sang, int su, int dan){
//        this.sang = sang;
//        this.su = su;
//        this.dan = dan;
        setSang(sang); setSu(su); setDan(dan);
    }
}
