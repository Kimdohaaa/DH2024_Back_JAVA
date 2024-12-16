package day_6;

import java.util.Scanner;

public class BoardProgram1 {
	
	/*
	실습 1 : 게시판 프로그램
		- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문)
		- 제목 / 내용 / 작성자 를 입력받아 등록/출력 구성
		- 게시물 3개 저장하기 -> 게시물1개당 제목/내용/작성자 -> 총 3개 필요 => 9개필요(배열, CSV, 객체 사용 X 시)
	*/
	public static void main(String[] args) {
		// 변수 선언부 -> 선언부에서 초기화를 하지 않을 시 44~46행에서 오류 발생 (변수 호출 불가)
			// 각 게시물 당 필요한 변수 3개씩 선언 -> 총 9개
		String 제목1 = null;
		String 내용1 = null;
		String 작성자1 = null;	// 초기값으로 null(참조값이 없다.(=변수가 갖는 객체 참조가 없다.)) 지정
		
		String 제목2 = null;
		String 내용2 = null;
		String 작성자2 = null;
		
		String 제목3 = null;
		String 내용3 = null;
		String 작성자3 = null;
		
		while(true) {	// while 문 무한 루프
			System.out.println("\n ===게시판 프로그램===");
			System.out.print("1.등록 2.출력 :");
			
			Scanner scan = new Scanner(System.in);
			
			int 선택메뉴 = scan.nextInt();
			
			if(선택메뉴 == 1) {
				System.out.println(">>1.등록을 선택했습니다.");
				System.out.print(">제목 : ");	
				String title = scan.next();
				System.out.print(">내용 : ");
				String content = scan.next();
				System.out.print(">작성자 : ");
				String writer = scan.next();
				// 메세지(print) -> 입력(next) -> 저장(변수)
				
				// 변수 값에 따른 데이터 검사 후 대입
				if( 제목1 == null) { // 첫번째 게시물이 null 이면 첫번째 게시물 변수에 대입
					// 변수값 수정
					제목1 = title;
					내용1 = content;
					작성자1 = writer;
					// while 문 밖 변수에 입력받은 3개의 문자열 각각 저장
				}else if(제목2 == null){ // 다수조건에 따른 단일 출력 / 두번째 게시물이 null 이면 두번째 게시물 변수에 대입
					// 변수값 수정
					제목2 = title;
					내용2 = content;
					작성자2 = writer;
					// while 문 밖 변수에 입력받은 3개의 문자열 각각 저장
				}else if(제목3 == null){ // 세번째 게시물이 null 이면 세번째 게시물 변수에 대입
					// 변수값 수정
					제목3 = title;
					내용3 = content;
					작성자3 = writer;
					// while 문 밖 변수에 입력받은 3개의 문자열 각각 저장
				}else {
					System.out.println("** 등록실패 : 게시물 작성공간이 부족합니다. **");
				}
				
				System.out.println("**등록 성공");

			}else if(선택메뉴 == 2) {
				System.out.println(">>2.출력을 선택했습니다.");
				if(제목1 != null) { // 다수 조건에 따른 다수 실행
					// 변수값 호출
					System.out.print("> 제목 : " + 제목1 + "> 내용 : " + 내용1 + "> 작성자 : " + 작성자1);
				}
				if(제목2 != null) {
					// 변수값 호출
					System.out.print("> 제목 : " + 제목2 + "> 내용 : " + 내용2 + "> 작성자 : " + 작성자2);
				}
				if(제목3 != null) {
					// 변수값 호출
					System.out.print("> 제목 : " + 제목3 + "> 내용 : " + 내용3 + "> 작성자 : " + 작성자3);
				}
			}
		}
	}

}
