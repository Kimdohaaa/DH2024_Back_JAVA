package day_13.boardprogram8.view;

import java.util.Scanner;

import day_13.boardprogram8.controller.BoardController;
import day_13.boardprogram8.model.dto.BoardDto;

public class BoardView {
	// --- 싱글톤 생성 --- //
	// 생성자
	private BoardView() {}
	
	// 객체 생성
	private static BoardView instance = new BoardView();
	
	// 메소드
	public static BoardView getInstance() { // 2) AppStart 25행에 의해 호출됨
		return instance; // 3) AppStart 의 25행에 instance 반환
	}
	// --- 싱글톤 end--- //
	
	// 멤버변수(모든 객체에서 사용할 입력객체 생성)
	private Scanner scan = new Scanner(System.in);
	
	// 1. 메인페이지 입출력 메소드
	public void index() {
		
		while(true) {
			System.out.print(">> 1. 등록 2. 출력 : ");
			int choose = this.scan.nextInt(); // 멤버변수 scan 을 가져옴
			
			if(choose == 1) {
				write();
			}else if(choose == 2) {
				findAll();
			}
		}
		
	}
	
	// 2. 글쓰기 입출력 메소드
	public void write() {
		System.out.println("[글쓰기 페이지]");
		
		System.out.println(">> 제목 : ");
		String title = scan.next();
		System.out.println(">> 내용 : ");
		String content = scan.next();
		System.out.println(">> 작성자 : ");
		String writer = scan.next();
		
		// 객체화 -> BoardDto 를 통해
		BoardDto boardDto = new BoardDto(title, content, writer);
		
		// controller 에게 모든 게시물 정보를 요청하고 결과 받기		
		// 1- BoardController 에게 저장할 객체 전달 -> BoardDto 를 통해 생성한 객체를 BoardController 에게 전달
		// 2- BoardController 에게 결과 응답 받기 -> BoardController 가 write() 메소드에서 BoardDto 정보를 처리한 후 return 값을 응답
		// 3- BoardController 에서 응답한 반환값을 result 변수에 대입
		boolean result = BoardController.getInstance().write(boardDto);
		
		
		if(result = true) {
			System.out.println(">> [글쓰기 성공]");
		}else {
			System.out.println(">> [글쓰기 실패]");
		}
		
	}
	
	// 3. 모든 글 출력 메소드
	public void findAll() {
		System.out.println("[모든 글 출력 페이지]");		
		
		// controller 에게 모든 게시물 정보를 요청하고 결과 받기
		BoardDto[] result = BoardController.getInstance().findAll();
		
		// 요청 결과 출력
		for(int i = 0; i < result.length ; i++) {
			BoardDto board = result[i];
			if(board != null) {
				System.out.println(" > 글번호 : " + i 
									+ " > 제목 : " + board.getTitle()
									+ " > 내용 : " + board.getContent()
									+ " > 작성자 : " + board.getWriter());
			}
		}
	}
	
}
