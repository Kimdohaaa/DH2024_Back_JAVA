package day_09;

import java.util.Scanner;

public class BoardService {

	// BoardProgram4 클래스의 메소드
	// 1. 등록 함수
	void boardAdd(Scanner scan, Board[] boards) {
		// BoardProgram4에게 매개변수로 전달받은 scan 을 통해 입력값 받기
		System.out.println("> 게시물 등록 ");
		System.out.println("제목 : ");
		String title = scan.next();
		System.out.println("내용 : ");
		String content = scan.next();
		System.out.println("작성자 : ");
		String writer = scan.next();
		
		// Board 클래스에서 전달받은 객체를 통해 객체 생성 / 객체에 입력값 저장
		Board board = new Board();
		board.title = title;
		board.content = content;
		board.writer = writer;
		
		// 유효성 검사
		boolean saveState = false;
		
		// BoardProgram4에게 매개변수로 전달받은 boards 를 통해 객체를 배열에 저장
		for(int i = 0; i <= boards.length -1; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				saveState = true;
				break;
			}
		}
		if(saveState == true) {
			System.out.println(">게시물 등록 성공");
		}else {
			System.out.println("> 게시물 등록 실패");
		}
		
	}
	// 2. 출력 함수
	void boardPrint(Board[] boards) {
		System.out.println("> 게시물 출력 ");
		for(int j = 0; j <= boards.length -1; j ++) {
			Board board = boards[j];
			if(board != null) {
				System.out.println("제목 : " + board.title);
				System.out.println("내용 : " + board.content);
				System.out.println("작성자 : " + board.writer);
			}
		
		}
	}

}
