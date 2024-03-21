package day0321;

public class Ex10ArrayDouble {
    public static void main(String[] args) {
        //자바는 각행의 열갯수를 각각 다르게 줄 수 있다.
        int [][]arr=new int[][] {{3,4,5},{10,20,30,40},{1,5,7,9,11}};

        System.out.printf("행의 갯수 : %d\n", arr.length);
        System.out.printf("0행의 열갯수 : %d\n", arr[0].length);
        System.out.printf("1행의 열갯수 : %d\n", arr[1].length);
        System.out.printf("2행의 열갯수 : %d\n", arr[2].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
