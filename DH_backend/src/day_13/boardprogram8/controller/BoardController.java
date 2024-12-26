package day_13.boardprogram8.controller;

import day_13.boardprogram8.model.dao.BoardDao;
import day_13.boardprogram8.model.dto.BoardDto;

public class BoardController {
	
	// --- 싱글톤 생성 --- //
	// 생성자
	private BoardController() {}
	
	// 객체 생성
	private static BoardController instance = new BoardController();
	
	// 메소드
	public static BoardController getInstance() {
		return instance;
	}
	// ---- 싱글톤 end --- //
	
	
	// 1. 글쓰기 제어 메소드
	// 매개변수 : boardDto 리턴값 : true / false
	public boolean write(BoardDto boardDto) {
		
		// DAO 에게 저장할 객체 전달 / 응답받기
		Boolean result = BoardDao.getInstance().write(boardDto);
		
		// View 에게 응답하기
		return result;
	}
	
	// 2. 모든 출력 제어 메소드
	// 매개변수 : X 리턴값 : BoardDto[]
	public BoardDto[] findAll() {

		// DAO 에게 모든 게시물 정보 요청 / 응답받기
		BoardDto[] result = BoardDao.getInstance().findAll();
		
		// View 에게 응답
		return result;
	}
	
}
