package day0327;

import java.util.Stack;

public class Ex05Stack {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        stack1.push("사과");
        stack1.push("바나나");
        stack1.push("사과");
        stack1.push("오렌지");
        stack1.push("딸기");

        System.out.println("총 갯수 : " + stack1.size());

        while (!stack1.empty()){
            System.out.println(stack1.pop());
        }
    }
}
