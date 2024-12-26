package day_13.example.model.dao;

import day_13.example.model.dto.WaitingDto;

public class WaitingDao {
	// 싱글톤 s
	// 생성자
	private WaitingDao() {}
	
	// 객체
	private static WaitingDao instance = new WaitingDao();
	
	// 메소드
	public static WaitingDao getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// 대기 목록을 저장할 배열 선언
	private WaitingDto[] waitingDB = new WaitingDto[100];
	
	// 1. 대기 등록 메소드
	public boolean waiting(WaitingDto waitingDto) { // 1- WaitingController -> WaitingDto 에서 정보를 받아
		
		for(int i = 0; i < waitingDB.length ; i++) {
			if(waitingDB[i] == null) {				// 2- 만약 대기 목록에 자리가 있으면
				waitingDB[i] = waitingDto;			// 3- WaitingController -> WaitingDto 에서 받은 값을 배열에 저장
				
				return true; // 4-1 대기 등록 성공 시 true 를 WaitingDto -> WaitingController 에게 반환값으로 전달
			}
		}
		return false; // 4-2 대기 등록 실패 시 false 를 WaitingDto -> WaitingController 에게 반환값으로 전달
	}
	
	public WaitingDto[] waitingList() {
		return waitingDB;	// WaitingDto -> WaitingController 에게 대기배열(waitingDB) 전달
	}
}
