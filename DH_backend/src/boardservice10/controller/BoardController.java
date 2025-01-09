package boardservice10.controller;

import java.util.ArrayList;

import boardservice10.model.dao.BoardDao;
import boardservice10.model.dto.BoardDto;

public class BoardController {
	// 싱글톤 s
	private BoardController() {}
	private static BoardController instance = new BoardController();
	public static BoardController getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// [1] 게시물 쓰기
	public void name() {
			
	}
	// [2] 게시물 상세 보기
	public BoardDto findById(int bno) {
		BoardDto boardDto = BoardDao.getInstance().findById(bno);
		
		return boardDto;
	}
	// [3] 게시물 전체 조회
	public ArrayList<BoardDto> findAll() {
		ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
		
		return result;
	}
		
	
}
