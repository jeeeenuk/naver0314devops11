package day0327;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01Set {
    public static void main(String[] args) {
        //<Integer> : 제네릭, 해당 컬렉션에는 Integer 타입만 할당이 가능하다. 다른 타입을 할당할 경우 컴파일 오류가 발생한다.
        Set<Integer> set1 = new HashSet<>(); //뒷부분 제네릭, 즉 꺽쇠 <>는 생략이 가능하다.
        set1.add(100); //JDK5 이전에는 set1.add(new Integer(100));
        set1.add(78);
        set1.add(78);
        set1.add(100);
        set1.add(65);
        System.out.printf("set1 의 데이터 갯수 : %s\n", set1.size()); //3개, 중복된 데이터의 갯수는 세어지지 않음
        System.out.println("** 출력 1 **");
        for(int i:set1){
            System.out.println(i);
        }
        System.out.println("** 출력 2 **");
        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
