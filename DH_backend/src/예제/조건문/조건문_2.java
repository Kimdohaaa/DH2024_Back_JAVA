package 예제;

import java.util.Scanner;

// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
public class 조건문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> 시험 점수를 입력 하시오.");
		int score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("> 등급은 A 입니다.");
		}else if(score >= 80) {
			System.out.println("> 등급은 B 입니다.");
		}else if(score >= 70) {
			System.out.println("> 등급은 C 입니다.");
		}else if(score >= 60) {
			System.out.println("> 등급은 D 입니다.");
		}else {
			System.out.println("> 등급은 F 입니다.");			
		}
		
	}

}
