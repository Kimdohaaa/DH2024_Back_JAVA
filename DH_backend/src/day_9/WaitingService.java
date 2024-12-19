package day_9;

import java.util.Scanner;

import day_8.Example1;

public class WaitingService {
// 메소드 설계
	// 1. 실행조건
	// 2. 매개변수
	// 3. 반환값
	
	void inFunc(Scanner scan, Waiting[] waitingArr) {
		System.out.println(">> 대기 등록 선택");
		
		// Example1에서 매개변수로 전달 받은 scan 을 통해 입력값을 변수에 대입
		System.out.println("> 전화번호를 입력하세요.");
		String tel = scan.next();
		System.out.println("> 인원수를 입력하세요.");
		int count = scan.nextInt();
		
		// Waiting 의 객체를 사용할 수 있도록 Waiting 클래스의 객체 생성
		Waiting people = new Waiting();
		
		// 생성한 Waiting 객체 내 멤버변수에 입력값 대입
		people.tel = tel;
		people.count = count;
		
		// 배열 순회를 통해 배열 내 특정 index 에 입력값을 대입받은 객체를 저장
		for(int i = 0; i <= waitingArr.length -1; i++) {
			if(waitingArr[i] == null) { // 배열 WaitingArr 의 index 가 null 이라면
				waitingArr[i] = people;	// 입력받은 값이 저장된 people 객체를 해당 위치에 저장
				break;
			}
		}
		
	}
	void outFunc(Waiting[] waitingArr) {
		System.out.println(">> 대기 명단 선택");
		
		for(int i = 0; i <= waitingArr.length -1; i++) {
			if(waitingArr[i] != null) {	// 배열 WaitingArr 의 index 에 값이 저장되어 있다면
				Waiting wait = waitingArr[i];	// Waiting 의 객체를 사용할 수 잇는 wait 객체를 생성한 후 배열 내 해당 index 에 들어잇는 값을 대입
				System.out.println(wait.tel + "님");
			}
		}
	}
}
