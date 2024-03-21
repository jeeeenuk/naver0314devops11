package day0321;

public class Ex05ArrayAgeCount {
    public static void main(String[] args) {
        /*
        연령별 인원수를 구해서 출력하시오.
        10세 미만 : %d명
        10대     : %d명
        20대
        ...
        50대
         */
        int []memberAges = {12,56,34,23,34,59,46,6,11,29,32,49,51,38,44,55,5,7,15,28};
        //System.out.printf("총 인원수 : %d",memberAges.length);
        int []ageCount=new int[6];

        for (int memberAge : memberAges) {
            ageCount[memberAge / 10]++;
        }
        for (int i = 0; i < ageCount.length; i++) {
            if (i==0) System.out.printf("10세 미만\t: %d명\n", ageCount[i]);
            else System.out.printf("%d대\t: %d명\n",i*10,ageCount[i]);
        }
    }
}
