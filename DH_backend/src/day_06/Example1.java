package day_06;

import java.util.Scanner;

public class Example1 {
	/*
	실습 2 : (식당)대기번호 발행 프로그램
		- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문)
		- 전화번호 / 인원수 를 입력받아 저장/출력 구성
		- 총 대기명단 : 3개
		- 대기명단 1개당 전화번호 / 인원수 저장소 2개 필요
	*/
	public static void main(String[] args) {
		String 전화번호1 = null;
		int 인원수1 = 0;
		String 전화번호2 = null;
		int 인원수2 = 0;
		String 전화번호3 = null;
		int 인원수3 = 0;
		
		int 대기번호 = 0;
		
		while(true) { // while 문 무한루프
			System.out.println("\n ===대기명단===");	// 사용자에게 등록 / 출력 안내
			System.out.println(">> 1. 대기등록 2. 대기번호");
			
			Scanner scan = new Scanner(System.in);
			int 선택 = scan.nextInt();	// 사용자가 입력한 값을 선택 변수에 저장
			
			if(선택 == 1) { // 논리 연산에 따른 제어(조건문 사용)		// 사용자가 대기등록을 선택했을 경우
				System.out.println(">> 대기등록을 선택하셨습니다.");
				
				System.out.println("> 전화번호를 입력하시오.");
				String tel = scan.next();	// 사용자가 입력한 정보를 변수에 저장
				
				System.out.println("> 인원수를 입력하시오.");
				int people = scan.nextInt();	// 사용자가 입력한 정보를 변수에 저장
				
				if(전화번호1 == null) {			// 대기번호 1번이 비어있다면
					전화번호1 = tel;				// 대기명단 1번에 해당되는 변수에 사용자가 입력한 변수 저장
					인원수1 = people;
				}else if(전화번호2 == null) {		// 대기번호 2번이 비어있다면
					전화번호2 = tel;				// 대기명단 2번에 해당되는 변수에 사용자가 입력한 변수 저장
					인원수2 = people;
				}else if(전화번호3 == null) {		// 대기번호 3번이 비어있다면
					전화번호3 = tel;				// 대기명단 3번에 해당되는 변수에 사용자가 입력한 변수 저장
					인원수3 = people;
				}else {
					System.out.println("** 대기자리가 없습니다. **");
				}

			}else if(선택 == 2) {		// 사용자가 대기번호를 선택했을 경우
				
				System.out.println(">> 대기번호를 선택하셨습니다.");
				
				if(전화번호1 != null) {			// 대기명단 1번에 값이 저장되어있을 경우
					System.out.println(전화번호1 + "님의 대기번호 : " + ++대기번호 );
				}else if(전화번호2 != null) {		// 대기명단 2번에 값이 저장되어있을 경우
					System.out.println(전화번호2 + "님의 대기번호 : " + ++대기번호  );
				}else if(전화번호3 != null) {		// 대기명단 3번에 값이 저장되어있을 경우
					System.out.println(전화번호3 + " 님의 대기번호 : " + ++대기번호  );
					대기번호 = 0;					// 대기번호 리셋
				}
			}
		}
	}

}
