package day_09;
import java.util.Scanner;
/*
실습 1 : 게시판 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문) , 클래스 / 객체(매개변수 / 메소드)
	- 제목 / 내용 / 작성자 를 입력받아 등록함수/출력함수 구현하기
	- 게시물 100개 저장하기 -> 게시물 1개당 객체 1개 필요 -> 총 3개 필요 => 9개필요  
*/
public class BoardProgram4 {
	
	public static void main(String[] args) {
		
		// boardService의 메소드를 사용할 객체 생성
		BoardService bs = new BoardService();
		
		// boardService의 메소드를 사용할 배열 객체 생성
		Board[] boards = new Board[100];
		
		while(true) {
			 System.out.println(">> 1. 등록 2. 출력");
			 Scanner scan = new Scanner(System.in);
			 int choose = scan.nextInt();
			 	
			 if(choose == 1) {
				 bs.boardAdd(scan, boards); 	// 객체를 통해 BoardService의 boardAdd 메소드 호출
				 						// 입력값을 객체에 저장하기 위해 scan 을 매개변수로 메소드에 전달
				 						// 입력값을 배열에 저장하기 위해 boards 를 매개변수로 메소드에 전달
			 }else if(choose == 2) {
				 bs.boardPrint(boards);		// 객체를 통해 BoardService의 boardPrint 메소드 호출
											// 배열의 특정 index 값을 출력하기 위해 boards 를 매개변수로 메소드에 전달
			 }
		}
	}

}
