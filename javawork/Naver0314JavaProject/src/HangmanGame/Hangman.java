package HangmanGame;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void answerPrint(String answer, int answerNum){
        for (int i = 0; i < answerNum; i++) {
            System.out.print("_");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String []words = {"java", "count", "school", "book", "student", "programmer"};
        int life = 5;

        String answer = words[random.nextInt(words.length)];
        int answerNum = answer.length();
        System.out.println(answer); //정답
        //System.out.println(answerNum); //정답의 갯수

        answerPrint(answer,answerNum);
    }
}
