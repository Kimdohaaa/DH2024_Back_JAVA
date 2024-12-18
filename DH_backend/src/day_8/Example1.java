package day_8;

import java.lang.annotation.ElementType;
import java.lang.runtime.ExactConversionsSupport;
import java.util.Scanner;

/*
실습 2 : (식당)대기번호 발행 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문) / 배열
	- 전화번호 / 인원수 를 입력받아 저장/출력 구성
	- 총 대기명단 : 100개
	- 대기명단 1개당 전화번호 / 인원수 저장소 2개 필요 
*/
public class Example1 {
	String tel;
	int count;
	public static void main(String[] args) {

		Example1[] waitingArr = new Example1[100];
		
		int waitingNo = 0;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println(">> 1. 대기등록 2. 대기명단");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				System.out.println(">> 대기등록을 선택하셨습니다.");
				
				System.out.println("> 전화번호를 입력하세요.");
				String tel = scan.next();
				System.out.println("> 인원수를 입력하세요.");
				int count = scan.nextInt();
				
				Example1 waiting = new Example1(); 
				waiting.tel = tel;
				waiting.count = count;
				
				for(int i = 0; i <= waitingArr.length -1; i++) {
					if(waitingArr[i] == null) {
						waitingArr[i] = waiting;
						break;
					}
				}
			}else if(choose ==2) {
				System.out.println(">> 대기명단을 선택하셨습니다.");				
				
				for(int j = 0; j <= waitingArr.length -1; j++) {
					if(waitingArr[j] != null) {
						Example1 waiting = waitingArr[j];
						System.out.println(waiting.tel + "님의 대기번호 : " + ++waitingNo );
					}
				}
			}
		}
	}

}
