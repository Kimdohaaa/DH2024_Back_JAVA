package day_8;

import java.util.Arrays;
import java.util.Scanner;

/*
실습 1 : 게시판 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문) , 클래스 / 객체
	- 제목 / 내용 / 작성자 를 입력받아 등록/출력 구성
	- 게시물 100개 저장하기 -> 게시물 1개당 객체 1개 필요 -> 총 3개 필요 => 9개필요
	
	해당 클래스는 main 함수를 갖는 실행 클래스
*/
public class BoardProgram3 {
	String title;
	String content;
	String writer;
	public static void main(String[] args) {
		// 배열 선언만 하고 초기화를 하지 않았기 때문에 기본값(String 의 기본값 : null) 자동 생성
		BoardProgram3[] boardArr = new BoardProgram3[100]; // null 값 100개 자동 생성
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println(">> 1.등록 2. 출력");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				System.out.println(">> 등록을 선택하셨습니다.");
				
				// 1. 입력 받기
				System.out.println("> 제목을 입력하세요.");
				String title = scan.next();
				System.out.println("> 내용을 입력하세요.");
				String content = scan.next();
				System.out.println("> 작성자을 입력하세요.");
				String writer = scan.next();
				
				// 2. 입력받은 3개의 정보를 하나의 객체로 생성
				BoardProgram3 board = new BoardProgram3();
				board.title = title;
				board.content = content;
				board.writer = writer;
				
				// 3. 생성한 객체를 배열에 저장 -> 배열 내 빈공간을 찾아 빈공간에 저장
				
				// 1) for 문의 실해결과를 저장할 변수 생성
				boolean saveState = false;
				
				// 2) 배열 내 빈 공간 탐색 => 비교
				for(int i = 0; i <= boardArr.length -1 ; i++) {
					// 만약 i 번째 boardArr 이 비어있으면
					if(boardArr[i] == null) {
						boardArr[i] = board; // 비어있는 i 번째 boardArr에 게시물 객체를 대입
						saveState = true;    // 저장 여부 상태 변경
						break; 				 // 가장 가까운 반복문(for 문) 종료
					}
				}
				
				// 4. saveState(저장여부)에 따른 저장 상태 출력
				if(saveState == true) {
					System.out.println(">> 게시물 등록 성공");
				}else {
					System.out.println(">> 게시물 등록 실패");
				}
			}else if(choose == 2) {
				System.out.println(">> 출력을 선택하셨습니다.");
				
				for(int j = 0; j <= boardArr.length -1; j++) {
					if(boardArr[j] != null) {
						BoardProgram3 board = boardArr[j];		// 배열 내 값이 들어있는 인덱스만 출력(null은 출력X)
						System.out.println("\n 번호 : " + j + "\n 제목 : " + board.title + "\n 내용 : " + board.content + " \n 작성자 : " + board.writer);
					}
				}
			}
		}
	}

}
