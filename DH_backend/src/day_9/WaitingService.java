package day_9;

import java.util.Scanner;

import day_8.Example1;

public class WaitingService {
	void inFunc(Scanner scan, Waiting[] waitingArr) {
		System.out.println("> 전화번호를 입력하세요.");
		String tel = scan.next();
		System.out.println("> 인원수를 입력하세요.");
		int count = scan.nextInt();
		
		Waiting people = new Waiting();
		
		people.tel = tel;
		people.count = count;
		
		for(int i = 0; i <= waitingArr.length -1; i++) {
			if(waitingArr[i] == null) {
				waitingArr[i] = people;
				break;
			}
		}
		
	}
	void outFunc(Waiting[] waitingArr) {
		System.out.println(">> 대기명단 선택");
		
		for(int i = 0; i <= waitingArr.length -1; i++) {
			if(waitingArr[i] != null) {
				Waiting wait = waitingArr[i];
				System.out.println(wait.tel + "님");
			}
		}
	}
}
