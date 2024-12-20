package day_10;

import java.util.Scanner;

/*
실습 1 : 게시판 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문) , 클래스 / 객체(매개변수 / 메소드) / 생성자
	- 제목 / 내용 / 작성자 를 입력받아 등록함수/출력함수 구현하기
	- 게시물 100개 저장하기 -> 게시물 1개당 객체 1개 필요 -> 총 3개 필요 => 9개필요  
*/
public class BoardProgram5 {
	public static void main(String[] args) {
		
		BoardService bs = new BoardService();
		Board[] boardArr = new Board[100];
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println(">> 1. 게시물등록 2. 게시물 출력");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				bs.BoardAdd(scan, boardArr);
			}else if(choose == 2) {
				bs.BoardPrint(boardArr);
			}
		}
	}
}
