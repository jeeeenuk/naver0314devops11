package day0327;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex04Map {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "김태희");
        map1.put("age", "35세");
        map1.put("addr", "서울");
        map1.put("name", "한가인"); //기존의 Key 값이 있을 경우 덮어쓴다.
        System.out.println("map1 의 갯수 : " + map1.size());
        System.out.println("name : " + map1.get("name"));
        System.out.println("age : " + map1.get("age"));
        System.out.println("addr : " + map1.get("addr"));
        System.out.println("hp : " + map1.get("hp")); // 없는 Key 값을 넣을 경우 null 값 반환

        Set<String> keys = map1.keySet();
        for(String k:keys){
            String v = map1.get(k);
            System.out.printf("%s : %s\n", k,v);
        }
    }
}
