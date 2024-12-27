package day_14.boardprogram9;

import day_14.boardprogram9.view.BoardView;

// MVC _ ArrayList 클래스 실습
/*
예제 : 비회원제 게시판
	- controller 패키지
		- BoardController 클래스 : 입력받은 게시물정보를 DAO에게 전달 담당 클래스 -> 싱글톤
	- model 패키지
		- DAO 패키지
			- BoardDao 클래스 : 기능 처리(데이터관련) 담당 클래스 -> 싱글톤
		- DTO 패키지
			- BoarDto 클래스 : 서로 다른 클래스 간의 데이터 이동 시 사용되는 클래스
	- view 패키지
		- BoardView 클래스 : 게시물 입출력 담당 클래스 -> 싱글톤
	- AppStart 클래스 : 프로그램을 시작하는 클래스(main)
	
*/
// 흐름 : 요청 -> AppStart -> BoardView <-BoardDto-> BoardController <-BoardDto-> BoardDao <- 응답


public class AppStart {
	public static void main(String[] args) {
		
		// 싱글톤의 내부 함수 호출
		BoardView.getInstance().run();
		
		// static 함수 호출 : 클래스명.함수명();
		// static 아닌 함수 호출 : 객체.함수명();
	
	}
}
