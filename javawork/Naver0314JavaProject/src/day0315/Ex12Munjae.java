package day0315;

import java.util.Scanner;

public class Ex12Munjae {
	public static void main(String[] args) {
		/*
		 * 점수(score)를 입력받아
		 * 점수가 90점 이상이면 "참 잘했어요 !!"
		 * 		80점 이상이면 "수고했어요!"
		 * 		70점 이상이면 "조금 더 노력하세요!"
		 * 		그 나머지는 "재시험입니다!"
		 * 		메세지를 저장할 문자열 변수명 : msg
		 */
		Scanner sc = new Scanner(System.in);
		int score;
		String msg;
		System.out.println("몇점인가요 ?");
		score = sc.nextInt();
		
//		max = su1> su2&&su1 >su3 ? su1 : su2> su1 && su2 > su3 ? su2 : su3;
//		msg = score>90&&score>80?"참 잘했어요!":score>80&&score>70?"수고했어요!":score>70&&score>60?"조금 더 노력하세요!":"재시험입니다.";
		msg = score>=90?"참 잘했어요!":
				score>=80?"수고했어요!":
					score>=70?"조금 더 노력하세요!":"재시험입니다!";
		System.out.println(score+" => "+msg);
		sc.close();
	}
}
