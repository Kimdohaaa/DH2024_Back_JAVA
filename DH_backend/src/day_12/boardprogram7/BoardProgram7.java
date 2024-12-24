package day_12.boardprogram7;

import java.util.Scanner;

/*
과제 11 : 회원제 게시판

[개발 순서]
1. 시각화 요소 구성 -> console 에 표현하고 싶은 내용물 구성
2. 메모리(저장) 구성 -> 클래스 구성
3. 기능 구성 -> 메소드 구성
*/
public class BoardProgram7 {
	public static void main(String[] args) {
		
		// MemberDto 멤버변수를 사용하기 위한 인스턴스 생성
		MemberDto[] members = new MemberDto[100];
		// MemberService 메소드를 사용하기 위한 인스턴스 생성
		MemberService ms = new MemberService();
		// 로그인 결과 반환값을 받을 변수 선언
		String loginId = null;
		
		// BoardDto 멤버변수를 사용하기 위한 인스턴스 생성
		BoardDto[] boards = new BoardDto[100];
		// BoardService 메소드를 사용하기 위한 인스턴스 생성
		BoardService bs = new BoardService();
 		
		while(true) { // w s
			Scanner scan = new Scanner(System.in);
			
			System.out.println(">> 1. 회원가입 2. 로그인");
			int choose = scan.nextInt();
			
			if(choose == 1) { 
				// 회원가입 함수 호출
				ms.signUp(scan, members);
			}else if(choose == 2) { // else if s
				// 로그인 함수 호출
				// MemberService 의 logIn 함수의 반환값을 loginId 변수에 대입
				loginId = ms.logIn(scan, members);
				if(loginId != null) { // if s
					while(true) { // w s
						System.out.println(">> 1. 게시물 등록 2. 게시물 출력 3. 로그아웃");
						int  choose2 = scan.nextInt();
						
						if(choose2 == 1) {
							// 게시물 등록 함수 호출
							bs.BoardAdd(scan, boards, loginId);
						}else if(choose2 == 2) {
							// 게시물 출력 함수 호출
							bs.BoardPrint(boards);
						}else if(choose2 == 3) {
							// 로그아웃 -> 로그인 증거 제거 => loginId 를 null 로 변경
							loginId = null;
							System.out.println(">> 로그아웃 성공");
							break;
						}
					} // w e					
				} // if e
			} // else if e
		} // w e
		
		
	} // main e
}
