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
	
	// 카테고리전체조회
	public ArrayList<BoardDto> categoryAll(){
		ArrayList<BoardDto> result = BoardDao.getInstance().categoryAll();
		
		return result;
	}
	
	// 게시물 쓰기
	public boolean write(BoardDto boardDto) {
		int loginMno = MemberController.getInstance().getLogInMno();
		boardDto.setMno(loginMno);
		boolean result = BoardDao.getInstance().write(boardDto);
		
		return result;
	}
	// 게시물 상세 보기
	public BoardDto findById(int bno) {
		BoardDto boardDto = BoardDao.getInstance().findById(bno);
		
		return boardDto;
	}
	// 게시물 전체 조회
	public ArrayList<BoardDto> findAll() {
		ArrayList<BoardDto> result = BoardDao.getInstance().findAll();
		
		return result;
	}
		
	
}
