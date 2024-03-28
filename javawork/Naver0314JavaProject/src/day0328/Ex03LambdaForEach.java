package day0328;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex03LambdaForEach {
    public static void main(String[] args) {
        // List 에 데이터를 넣는 방법 1
        List<String> list1 = new Vector<>();
        list1.add("red"); list1.add("blue"); list1.add("yellow");
        for (String a:list1) System.out.println(a);
        System.out.println("-".repeat(10));

        // List 에 데이터를 넣는 방법 2
        List<String> list2 = Arrays.asList("장미","다알리아","칸나","프리지아");
        list2.forEach(parameter-> System.out.println(parameter));
    }
}
