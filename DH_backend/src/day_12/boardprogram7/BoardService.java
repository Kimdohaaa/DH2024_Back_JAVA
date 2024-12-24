package day_12.boardprogram7;

import java.util.Scanner;

public class BoardService {
	// 멤버변수
	// 생성자
	
	// 메소드
	// 1) 게시물 등록 메소드 
	public void BoardAdd(Scanner scan, BoardDto[] boards, String loginId) {
		System.out.println(">> 게시물 등록을 선택하셨습니다.");
		
		System.out.println("> 제목 : ");
		String title = scan.next();
		System.out.println("> 내용 : ");
		String content = scan.next();

		BoardDto dto = new BoardDto(title,content,loginId);
		
		for(int i = 0; i < boards.length; i ++ ) {
			if(boards[i] == null) {
				boards[i] = dto;
				System.out.println(">> 게시물 등록 성공");
				break;
			}
		}
	}
	// 2) 게시물 출력 메소드
	public void BoardPrint(BoardDto[] boards) {
		System.out.println(">> 게시물 출력을 선택하셨습니다.");
		
		for(int i = 0; i < boards.length; i++) {
			if(boards[i] != null) {
				System.out.println(" 제목 : " + boards[i].getTitle()
									+ " 내용 : " + boards[i].getContent()
									+ " 작성자 : " + boards[i].getWriter());
			}
		}
	}
}
