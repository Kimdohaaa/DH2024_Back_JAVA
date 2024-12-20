package day_10;

import java.util.Scanner;

public class BoardService {
	// 등록함수
	void BoardAdd(Scanner scan, Board[] boardArr){
		// 실행조건 : choose 가 1 일 시
		// 매개변수 : Scanner scan -> 입력값을 변수에 대입하기 위해 / Board[] boardArr -> 입력받은 값을 배열로 저장하기 위해
		// 반환값 : X
		System.out.println(">> 게시물 등록을 선택하셨습니다.");		
		
		System.out.print("> 제목 :");
		String title = scan.next();
		System.out.print("> 내용 :");
		String content = scan.next();
		System.out.print("> 작성자 :");
		String writer = scan.next();
		
		
		// 생성자를 이용한 객체 생성
		Board board = new Board(title, content, writer);
		
		// 유효성 검사를 위해 boolean 형 변수 선언
		boolean boardState = false;
		
		// 배열 내 index 에 입력값을 저장한 객체 저장
		for(int i = 0; i <= boardArr.length -1; i++) {
			if(boardArr[i] == null) {
				boardArr[i] = board;
				System.out.println(">> 게시물이 등록되었습니다.");
				
				boardState = true;
				break;
			}
		}
		if(boardState == false) {
			System.out.println(">> 게시물 등록 실패");
		}
		
		return;
	}
	// 출력 함수
	void BoardPrint(Board[] boardArr) {
		// 실행조건 : choose 가 2 일 시
		// 매개변수 :Board[] boardArr -> 배열에 저장된 입력값을 출력하기 위해
		// 반환값 : X
		System.out.println(">> 게시물 출력을 선택하셨습니다.");
		
		for(int i = 0; i <= boardArr.length -1; i++) {
			if(boardArr[i] != null) {
				System.out.println("> 제목 :" + boardArr[i].title);
				System.out.println("> 내용 :" + boardArr[i].content);
				System.out.println("> 작성자 :" + boardArr[i].writer);
			}
		}
	}
}
