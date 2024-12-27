package day_14.boardprogram9.model.dao;

import java.util.ArrayList;

import day_14.boardprogram9.model.dto.Dto;

public class Dao {
	// 싱글톤 s
	// 생성자
	private Dao() {}
	
	// 객체생성
	private static Dao instance = new Dao();
	
	// 메소드
	public static Dao getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	
	// 게시물 리스트 선언
	private ArrayList<Dto> boards = new ArrayList<Dto>();
		
	
	// 1. 게시물 등록 처리 함수
	// 매개변수 : Dto 객체 | 리턴값 : Boolean
	public boolean creat(Dto boardDto) {
		// 1. 매개변수로 받은 객체를 .add 메소드를 통해 리스트에 저장
		boards.add(boardDto);
		
		// 2. controller 에 결과값 반환
		return true;
	}
	
	// 2. 게시물 출력 처리 함수
	// 매개변수 : X | 리턴값 : ArrayList<Dto
	public ArrayList<Dto> readAll() {
		// 1. 모든 게시물을 갖는 리스트 객체를 controller 에게 반환
		return boards;
	}
	
	// 3. 게시물 수정 처리 함수
	// 매개변수 : 리스트 내 수정할 인덱스번호 / 수정할 정보 | 리턴값 : Boolean
	public boolean update(int uIndex, Dto boardDto) {
		// 1. 유효성 검사 |
		if(uIndex > boards.size() -1 || uIndex < 0) {
			return false;
		}
		
		// 2. 해당되는 인덱스의 정보 수정
		// 변수명.set(인데스 , 수정할 요소값)
		boards.set(uIndex, boardDto);
		
		// 3. controller 에 결과값 반환
		return true;
	}
	
	// 4. 게시물 삭제 처리 함수
	// 매개변수 : 리스트 내 삭제할 인덱스 | 리턴값 : Boolean
	public boolean delete(int dIndex) {
		// 1. 유효성 검사 | 리스트 에서 삭제할 인덱스 삭제
		if(dIndex > boards.size() -1) {
			return false;
		}
		boards.remove(dIndex);
		
		// 2. controller 에 결과값 반환
		return true;
	}
}
