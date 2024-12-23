package day_11;

import java.util.Scanner;

public class BoardService { // BA s
	// 게시물 등록 메소드
	public void BoardAdd(Scanner scan, BoardDto[] boardArr){
		System.out.println(">> 등록을 선택하셨습니다.");
		
		System.out.print("> 제목 : ");
		String title = scan.next();
		System.out.print("> 내용 : ");
		String content = scan.next();
		System.out.print("> 작성자 : ");
		String writer = scan.next();
		
		// 생성자를 이용한 객체 생성
		BoardDto boardDto = new BoardDto(title, content, writer);
		
		// 유효성 검사를 위한 변수 선언
		Boolean saveState = false;
		
		// 배열에 입력값 저장
		for(int i = 0; i <= boardArr.length -1; i++) { // for s
			if(boardArr[i] == null) { // if s
				boardArr[i] = boardDto;
				saveState = true;
				break;
			} // if e
		} // for e
		
		if(saveState == true) { // if s
			System.out.println(">> 등록 성공");
		}else {
			System.out.println(">> 등록 실패");
		} // if e		
	} // BA e
	// 게시물 출력 메소드
	public void Boardprint(BoardDto[] boardArr) { // BP s
		System.out.println(">> 출력을 선택하셨습니다.");
		
		for(int i = 0 ; i <= boardArr.length -1 ; i++ ) { // for s
			if(boardArr[i] != null) { // if s
				System.out.printf("> 제목 : %s 내용 : %s 작성자 : %s " 
						, boardArr[i].getTitle()
						, boardArr[i].getContent()
						, boardArr[i].getWriter());
			} // if e
		} // for e
	} // BP e
}
