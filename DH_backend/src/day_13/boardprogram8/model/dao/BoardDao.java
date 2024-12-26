package day_13.boardprogram8.model.dao;

import day_13.boardprogram8.model.dto.BoardDto;

public class BoardDao {
	// --- 싱글톤 생성 --- //

	// 생성자
	private BoardDao() {}
	
	// 객체 생성
	private static BoardDao instance = new BoardDao();
	
	// 메소드
	public static BoardDao getInstance() {
		return instance;
	}
	
	// --- 싱글톤 end --- //
	
	// 멤버변수 (모든 게시물 정보를 갖는 배열 -> 임시 DB 역할)
	private BoardDto[] boardDB = new BoardDto[100];
	
	// 1. 글쓰기 처리 메소드
	// 매개변수 : BoardDto 리턴값 : true / false
	public boolean write(BoardDto boardDto) {
	
		// 매개변수로 받은 저장할 boardDto 를 배열에 저장
		for(int i  = 0; i <= boardDB.length -1 ; i++) {
			if(boardDB[i] == null) {
				boardDB[i] = boardDto;
				
				return true;
			}
		}
		
		return false;
		// 결과를 controller 에게 응답
	
	}
	
	// 2. 모든 글 출력 처리 메소드
	// 매개변수 : X 리턴값 : BoardDto[]
	public BoardDto[] findAll(){
		// 배열 내 모든 객체를 controller 에게 응답
		return boardDB;

	}
}
