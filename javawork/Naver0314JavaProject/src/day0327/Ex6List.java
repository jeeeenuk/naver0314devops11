package day0327;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class Ex6List {
    public static void main(String[] args) {
        List<String> list1 = new Vector<String>();
        List<String> list2 = new Vector<String>(5); //5개가 넘을 경우 10개로 할당
        List<String> list3 = new Vector<String>(5,3); //5개가 넘을 경우 8개로 할당값 변경

        System.out.println("list1 의 데이터 갯수 : " + list1.size());
        //capacity 는 오버라이드 메서드가 아니고 Vector 가 가지고 있는 메서드이다...
        System.out.println("list1 에 할당된 갯수 : " +((Vector<String>)list1).capacity());
        System.out.println();
        System.out.println("list2 의 데이터 갯수 : " + list2.size());
        System.out.println("list2 에 할당된 갯수 : " +((Vector<String>)list2).capacity());

        String []str = {"red","Blue","green","white","yellow","pink"};
        for (String s: str)
        {
            list1.add(s);
            list2.add(s);
        }
        System.out.println("-".repeat(25));
        System.out.println("list1 의 데이터 갯수 : " + list1.size());
        System.out.println("list1 에 할당된 갯수 : " +((Vector<String>)list1).capacity());
        System.out.println();
        System.out.println("list2 의 데이터 갯수 : " + list2.size());
        System.out.println("list2 에 할당된 갯수 : " +((Vector<String>)list2).capacity());

        System.out.println("** 출력 1 **");
        for (String s:list1){
            System.out.println(s);
        }
        System.out.println("** 출력 2 **");
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%d : %s\n", i, list1.get(i));
        }
        System.out.println("** 출력 3 **");
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("** 출력 4 **");
        Object []ob = list1.toArray();
        for (Object s:ob){
            System.out.println((String)s);
        }
    }
}
