package day_14.boardprogram9.view;

import java.util.ArrayList;
import java.util.Scanner;

import day_14.boardprogram9.controller.BoardController;
import day_14.boardprogram9.model.dto.Dto;

public class BoardView {
	// 싱글톤 s
	// 생성자
	private BoardView() {}
	
	// 객체 생성
	private static BoardView instance = new BoardView();
	
	// 메소드
	public static BoardView getInstance() {
		return instance;
	}	
	// 싱글톤 e
	
	Scanner scan = new Scanner(System.in);
	
	// 메인 페이지
	public void run() {
		while(true) {
			System.out.print(">> 1. C 2. R 3. U 4. D  : ");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				creat();
			}else if(choose == 2) {
				readAll();
			}else if(choose == 3) {
				update();
			}else if(choose == 4) {
				delete();
			}
		}
	}
	
	// 1. 게시물 등록 메소드
	public void creat() {
		System.out.println(">> C");
		
		// 1. 저장할 게시물 정보 입력 받기
		System.out.print(">> Title : ");
		String title = scan.next();
		System.out.print(">> Content : ");
		String content = scan.next();
		System.out.print(">> Writer : ");
		String writer = scan.next();
		
		// 2. 입력받은 정보 객체화
		Dto boardDto = new Dto(title,content,writer);
		
		// 3. controller 에게 객체 전달 | controller 가 반환하는 값이 대입될 변수 선언
		boolean result = BoardController.getInstance().create(boardDto);
		
		// 4. 반환값 출력
			if(result) {
				System.out.println(">> save success");
			}else {
				System.out.println(">> save fail");
			}
	}
	
	// 2. 게시물 출력 메소드
	public void readAll() {
		System.out.println(">> R");
		
		// 1. controller 에게 게시물 정보 요청
		ArrayList<Dto> result = BoardController.getInstance().readAll();
		
		// 2. 반환값 출력
		System.out.println("no \t Title \t Content \t Writer");
		
		for(int i = 0; i <= result.size() -1; i++) {
			Dto board = result.get(i);
			System.out.printf("%d \t %s \t %s \t %s \n"
							   , i , board.getTitle(), board.getContent(), board.getWriter());
		}
		
	}
	
	// 3. 게시물 수정 메소드
	public void update() {
		System.out.println(">> U");
		
		// 1. 수정할 정보 입력 받기
		System.out.print(">> update Index : ");
		int uIndex = scan.nextInt();
		
		System.out.println(">> update Title : ");
		String title = scan.next();
		System.out.println(">> update Content : ");
		String content = scan.next();
		System.out.println(">> update Writer : ");
		String writer = scan.next();
		
		// 2. 입력받은 정보 객체화
		Dto boardDto = new Dto(title,content,writer);
		
		// 3. 입력받은 정보를 controller 에게 전달하고 처리 결과 받기
		boolean result = BoardController.getInstance().update(uIndex,  boardDto);
		
		// 4. 반환값 출력
		if(result) {
			System.out.println(">> update success");
		}else {
			System.out.println(">> update fail");
		}
	}
	
	// 4. 게시물 삭제 메소드
	public void delete() {
		System.out.println(">> D");
		
		// 1. 삭제할 인덱스 번호 받기
		System.out.print(">> delete Index : ");
		int dIndex = scan.nextInt();
		
		// 2. 삭제할 인덱스를 controller 에게 전달하고 처리 결과 받기
		boolean result = BoardController.getInstance().delelte(dIndex);
		
		// 3. 반환값 출력
		if(result) {
			System.out.println(">> delete success");
		}else {
			System.out.println(">> delete fail");
		}
	}
	
}
