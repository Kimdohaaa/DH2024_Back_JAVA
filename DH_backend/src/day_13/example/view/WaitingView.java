package day_13.example.view;

import java.util.Scanner;

import day_13.example.controller.WaitingController;
import day_13.example.model.dto.WaitingDto;

public class WaitingView {
	// 싱글톤 s
	// 생성자
	private WaitingView() {}
	
	// 객체
	private static WaitingView instance = new WaitingView();
	
	// 메소드
	public static WaitingView getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// 모든 객체에서 사용할 입력 객체 생성
	private Scanner scan =  new Scanner(System.in);
	
	// 1. 메인페이지
	public void index() {
		
		while(true) {
			System.out.println(">> 1. 대기등록 2. 대기목록");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				waiting(); // WaitingView 의 waiting() 메소드 접근
			}else if(choose == 2) {
				waitingList(); // WaitingView 의 WaitingList() 메소드 접근
			}
		}
	}
	
	// 2. 대기 등록 메소드
	public void waiting() { // 33 행
		System.out.println(">> 대기등록");
		
		System.out.println("> 전화번호 : ");
		String tel = scan.next();
		System.out.println("> 인원수 : ");
		int count = scan.nextInt();
		
		// 객체화 -> WaitingDto 생성자를 통해 초기화
		WaitingDto waitingDto = new WaitingDto(tel,count);
		
		
		boolean result = WaitingController.getInstance().waiting(waitingDto);
		
	}
	// 3. 대기 목록 메소드
	public void waitingList() { // 35 행
		System.out.println(">> 대기 목록");
		
		WaitingDto[] result = WaitingController.getInstance().waitingList();
		
		for(int i = 0; i < result.length; i++) {
			WaitingDto waiting = result[i];
			if(waiting != null) {
				System.out.printf(" 대기번호 : %d 전화번호 : %s 인원수 : %d", i , waiting.getTel() , waiting.getCount());
			}
		}
	}
}
