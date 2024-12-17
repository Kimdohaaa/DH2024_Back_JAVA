package day_7;

import java.util.Scanner;

/*
실습 1 : 게시판 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문) , 클래스 / 객체
	- 제목 / 내용 / 작성자 를 입력받아 등록/출력 구성
	- 게시물 3개 저장하기 -> 게시물 1개당 객체 1개 필요 -> 총 3개 필요 => 9개필요
	
	해당 클래스는 main 함수를 갖는 실행 클래스
*/
public class BoardProgram2 {

	String title;
	String content;
	String writer;
	
	public static void main(String[] args) { // main 함수를 통해 클래스 실행
		
		BoardProgram2 board1 = new BoardProgram2();
		BoardProgram2 board2 = new BoardProgram2();
		BoardProgram2 board3 = new BoardProgram2();
		
		
		board1.title = null;
		board1.content = null;
		board1.writer = null;
		
		board2.title = null;
		board2.content = null;
		board2.writer = null;
		
		board3.title = null;
		board3.content = null;
		board3.writer = null;
		
		while(true) {
			// 출력
			System.out.println("1. 등록 2. 출력");

			// 입력
			Scanner scan = new Scanner(System.in);
			int choose = scan.nextInt();
			
			// 조건문 (논리연산)
			if(choose == 1) {
				System.out.println(" >> 등록을 선택했습니다. ");
				System.err.println(" >> 제목 : ");
				String title = scan.next();
				System.out.println(" >> 내용 : ");
				String content = scan.next();
				System.out.println(" >> 작성자 : ");
				String writer = scan.next();
				
				if(board1.title == null) {
					board1.title = title;
					board1.content = content;
					board1.writer = writer;
				}else if(board2.title == null) {
					board2.title = title;
					board2.content = content;
					board2.writer = writer;
				}else if(board3.title == null) {
					board3.title = title;
					board3.content = content;
					board3.writer = writer;
				}
				
			}else if(choose == 2) {
				System.out.println(" >> 출력을 선택했습니다. ");				
			
				if(board1.title != null) {
					System.out.println(" 제목 : " + board1.title + " \n내용 : " + board1.content + " \n 작성자 : " + board1.writer);
				}
				if(board2.title != null) {
					System.out.println(" 제목 : " + board2.title + "\n 내용 : " + board2.content + " \n 작성자 : " + board2.writer);				}
				}
				if(board3.title != null) {
					System.out.println(" 제목 : " + board3.title + "\n 내용 : " + board3.content + " \n 작성자 : " + board3.writer);
				}
			}
		}
		
	
	
}
