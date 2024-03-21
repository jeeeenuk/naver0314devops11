package day0321;

public class Ex08ArrayDouble {
    public static void main(String[] args) {
        int [][]arr1;
        arr1=new int[2][3]; //2행 3열
        System.out.println("행 갯수 : " + arr1.length);
        System.out.println("0번행의 열갯수 : " + arr1[0].length);

        arr1[0][0]=3; arr1[0][2]=10; arr1[1][1]=30; arr1[1][2]=50;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("arr[%d][%d] = %d\t",i,j,arr1[i][j]);
            }
            System.out.println();
        }

    }
}
