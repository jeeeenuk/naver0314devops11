package day0326;

public class Ex12Exception {
    public static void main(String[] args) {
        int []arr = {3,5,7,10};
        for (int i = 0; i <= arr.length; i++) {
            try {
            System.out.printf("%d : %d\n", i, arr[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                //e.printStackTrace(); // 에러 추척 -> 라인번호 출력
                System.out.println(e.getMessage()); // 에러 추적 -> 에러만 출력
            }
        }
        System.out.println("** STOP **");
    }
}
