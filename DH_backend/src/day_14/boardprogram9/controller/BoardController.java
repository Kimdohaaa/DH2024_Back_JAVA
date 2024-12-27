package day_14.boardprogram9.controller;

import java.util.ArrayList;

import day_14.boardprogram9.model.dao.Dao;
import day_14.boardprogram9.model.dto.Dto;

public class BoardController {
		// 싱글톤 s
		// 생성자
		private BoardController() {}
		
		// 객체생성
		private static BoardController instance = new BoardController();
		
		// 메소드
		public static BoardController getInstance() {
			return instance;
		}
		// 싱글톤 e
		
		// 1. 게시물 등록 제어 메소드
		// 매개변수 : Dto 객체 | 리턴값 : Boolean
		public boolean create(Dto boardDto) {
			// 1. View 에서 매개변수로 받은 값을 DAO 에게 전달 | Dao 가 반환하는 값이 대입될 변수 선언
			boolean result = Dao.getInstance().creat(boardDto);
			
			// 2. 반환값 View 에게 전달
			return result;
		}
		
		// 2. 게시물 출력 제어 메소드
		// 매개변수 : X | 리턴값 : ArrayList<Dto>
		public ArrayList<Dto> readAll() {
			// 1. View 에서 매개변수로 받은 값을 DAO 에게 전달 | Dao 가 반환하는 값이 대입될 변수 선언
			ArrayList<Dto> result = Dao.getInstance().readAll();
			
			// 2. 반환값 View 에게 전달
			return result;
		}
		
		// 3. 게시물 수정 제어 메소드
		// 매개변수 : 리스트 내 수정할 인덱스번호 / 수정할 정보 | 리턴값 : Boolean
		public boolean update(int uIndex, Dto boardDto) {
			// 1. View 에서 매개변수로 받은 값을 Dao 에게 전달 | Dao 가 반환하는 값이 대입될 변수 선언
			boolean result = Dao.getInstance().update(uIndex, boardDto);
			
			// 2. 반환값 View 에게 전달
			return result;
		}

		// 4. 게시물 삭제 제어 메소드
		// 매개변수 : 리스트 내 삭제할 인덱스 번호 | 리턴값 : Boolean
		public boolean delelte(int dIndex) { 
			// 1. View 에서 매개변수로 받은 삭제할 인덱스를 Dao 에게 전달 | Dao 가 반환하는 값이 대입될 변수 선언
			boolean result = Dao.getInstance().delete(dIndex);
			
			// 2. 반환값 View 에게 전달
			return result;
			
		}
}
