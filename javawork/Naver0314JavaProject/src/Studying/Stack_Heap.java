package Studying;

import java.util.ArrayList;
import java.util.List;

public class Stack_Heap {
    public static void main(String[] args) {
        int age = 20;
        String name = "WOOK";
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Watermelon");

        change(fruit);
    }

    public static void change(List<String> list){
        String myFruit = list.get(0);
        list.add("Lemon");
    }
}
