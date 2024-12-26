package day_13.example.model.dao;

import day_13.example.model.dto.WaitingDto;

public class WaitingDao {
	// 싱글톤
	// 생성자
	private WaitingDao() {}
	
	// 객체
	private static WaitingDao instance = new WaitingDao();
	
	// 메소드
	public static WaitingDao getInstance() {
		return instance;
	}
	
	private WaitingDto[] waitingDB = new WaitingDto[100];
	
	public boolean waiting(WaitingDto waitingDto) {
		
		for(int i = 0; i < waitingDB.length ; i++) {
			if(waitingDB[i] == null) {
				waitingDB[i] = waitingDto;
				
				return true;
			}
		}
		return false;
	}
	
	public WaitingDto[] waitingList() {
		return waitingDB;
	}
}
