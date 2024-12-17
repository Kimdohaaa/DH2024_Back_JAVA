package day_7;

import java.util.Scanner;

/*
실습 2 : (식당)대기번호 발행 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문)
	- 전화번호 / 인원수 를 입력받아 저장/출력 구성
	- 총 대기명단 : 3개
	- 대기명단 1개당 전화번호 / 인원수 저장소 2개 필요
*/
public class Waiting {
	
	String tel;
	int people;
	
	public static void main(String[] args) {
		
		Waiting wait1 = new Waiting();
		Waiting wait2 = new Waiting();
		Waiting wait3 = new Waiting();
		
		wait1.tel = null;
		wait1.people = 0;
		
		wait2.tel = null;
		wait2.people = 0;
		
		wait3.tel = null;
		wait3.people = 0;
		
		int waitingNo = 0;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("1. 대기등록 2. 대기명단");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				
				System.out.println("대기등록을 선택하였습니다.");
				System.out.println(">> 전화번호 입력");
				String tel = scan.next();
				System.out.println(">> 인원수 입력");
				int people = scan.nextInt();
				
				if(wait1.tel == null) {
					wait1.tel = tel;
					wait1.people = people;
				}else if(wait2.tel == null) {
					wait2.tel = tel;
					wait2.people = people;
				}else if(wait3.tel == null) {
					wait3.tel = tel;
					wait3.people = people;
				}else {
					System.out.println("대기자리가 없습니다.");
				}
				
			}else if(choose == 2) {
				System.out.println("대기명단을 선택하였습니다.");
				
				if(wait1.tel != null) {
					System.out.println(wait1.tel + "님의 대기번호 : " + ++waitingNo );
				}
				if(wait2.tel != null) {
					System.out.println(wait2.tel + "님의 대기번호 : " + ++waitingNo );
				}
				if(wait3.tel != null) {
					System.out.println(wait3.tel + "님의 대기번호 : " + ++waitingNo );
				}
				
			}
			
		}
	}

}
