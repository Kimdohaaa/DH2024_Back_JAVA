package day_13.example.controller;

import day_13.example.model.dao.WaitingDao;
import day_13.example.model.dto.WaitingDto;

public class WaitingController {
	// 싱글톤
	private WaitingController() {}
	
	// 객체
	private static WaitingController instance = new WaitingController();
	
	// 메소드
	public static WaitingController getInstance() {
		return instance;
	}
	
	
	// 1. 대기 등록 제어 메소드
	public boolean waiting(WaitingDto waitingDto) {
		Boolean result = WaitingDao.getInstance().waiting(waitingDto);
		
		return result;
	}
	// 2. 대기 목록 출력 제어 메소드
	public WaitingDto[] waitingList() {
		WaitingDto[] result = WaitingDao.getInstance().waitingList();
		
		return result;
	}
}
