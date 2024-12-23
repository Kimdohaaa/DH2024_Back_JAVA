package day_11;

import java.util.Scanner;
// main 함수를 갖는 프로그램 실행 클래스
public class BoardProgram6 { // class s
	
	public static void main(String[] args) { // main s
		BoardDto[] boardArr = new BoardDto[100];
		BoardService bs = new BoardService();
		while(true) { // while s
			Scanner scan = new Scanner(System.in);
			
			System.out.println(">> 1. 등록 2. 출력");
			int choose = scan.nextInt();
			
			if(choose == 1) { // if s
				// 등록함수 호출
				bs.BoardAdd(scan, boardArr);
			}else if(choose == 2) {
				// 출력함수 호출
				bs.Boardprint(boardArr);
			} // if e
			
		} // while e
	} // main e
} // class e
