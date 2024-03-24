package Studying;

import java.util.ArrayList;
import java.util.List;

public class Stack_Heap {
    public static void main(String[] args) {
        int age = 20; //Stack 에 변수명(age)와 변수(20) 모두가 할당된다.
        String name = "WOOK"; //Stack 에 변수명(name), Heap 에 변수(WOOK)이 할당된다.
        List<String> fruits = new ArrayList<>(); //Stack 에 fruits 라는 변수명이 할당, Heap 에는 할당되지 않는다.
        fruits.add("Apple"); // Heap 에 Apple 이 할당
        fruits.add("Orange"); // Heap 에 Orange 이 할당
        fruits.add("Watermelon"); // Heap 에 Watermelon 이 할당

        System.out.println(fruits); // Apple, Orange, Watermelon
        change(fruits);
        System.out.println(fruits); // Apple, Orange, Lemon
    }

    public static void change(List<String> list){
        String myFruit = list.get(0);
        System.out.println("Change : "+ myFruit); //Apple
        list.add("Lemon");
    }
}
