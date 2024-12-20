package day_09;

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
		
		// WaitingService 의 메소드를 사용할 수 있는 객체 생성
		WaitingService ws = new WaitingService();
		
		// Waiting 의 객체를 저장할 수 있는 배열 객체 생성
		Waiting[] waitingArr = new Waiting[100];
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("<< 1. 대기등록 2. 대기명단");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				ws.inFunc(scan , waitingArr); // 입력값을 변수에 저장할 수 있는 scan 을 WaitingService의 메소드에게 매개변수로 전달
											  // 변수에 저장된 입력값을 Waiting[]의 index 에 저장할 수 있도록 WaitingService의 메소드에게 매개변수로 전달
			}else if(choose == 2) {
				ws.outFunc(waitingArr);		  // WaitingService 의 메소드 inFunc()에서 Waiting[]에 저장한 index 의 값을 출력하기 위해 Waiting[]을 outFunc()에게 매개변수로 전달		
			}
		}

	}

}
