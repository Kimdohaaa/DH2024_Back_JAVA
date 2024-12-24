package day_11;

import java.util.Scanner;

public class BoardService2 {
	public void boardAdd(Scanner scan, Board[] boardArr ) {
		System.out.println(">> 게시물 등록을 선택하셨습니다.");
		
		System.out.println("> 제목 : ");
		String title = scan.next();
		System.out.println("> 내용 : ");
		String content = scan.next();
		
		Board board = new Board(title,content) {};
		
		for(int i = 0; i < boardArr.length; i++) {
			if(boardArr[i] == null) {
				boardArr[i] = board;
				
				break;
			}
		}

	}
	
	public void boardPrint(Scanner scan, Board[] boardArr , Member[] memberArr) {
		System.out.println(">> 게시물 출력을 선택하셨습니다.");
		
		for(int i = 0; i < boardArr.length; i++) {
			if(boardArr[i] != null) {
				System.out.println(" 제목 : " + boardArr[i].getTitle()
									+ " 내용 : " + boardArr[i].getContent()
									+ " 작성자 : " + memberArr[i].getId());
			}
		}
		
	}
}
