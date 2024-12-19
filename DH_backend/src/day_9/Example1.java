package day_9;

import java.util.Scanner;

/*
실습 2 : (식당)대기번호 발행 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문) / 배열
	- 전화번호 / 인원수 를 입력받아 저장/출력 구성
	- 총 대기명단 : 100개
	- 대기명단 1개당 전화번호 / 인원수 저장소 2개 필요 
*/
public class Example1 {

	public static void main(String[] args) {
		
		WaitingService ws = new WaitingService();
		
		Waiting[] waitingArr = new Waiting[100];
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("<< 1. 대기등록 2. 대기명단");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				ws.inFunc(scan , waitingArr);
			}else if(choose == 2) {
				ws.outFunc(waitingArr);				
			}
		}

	}

}
