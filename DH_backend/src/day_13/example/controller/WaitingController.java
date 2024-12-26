package day_13.example.controller;

import day_13.example.model.dao.WaitingDao;
import day_13.example.model.dto.WaitingDto;

public class WaitingController {
	// 싱글톤 s
	private WaitingController() {}
	
	// 객체
	private static WaitingController instance = new WaitingController();
	
	// 메소드
	public static WaitingController getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// 1. 대기 등록 제어 메소드
	public boolean waiting(WaitingDto waitingDto) {
		
		// 1. 정보전달 / 반환값 받기
		// 1. WaitingDto -> WaitingDao 에게 매개변수 전달 / true , false 응답 받기
		// 1- WaitingDto -> WaitingDao 에게 배열에 저장할 정보(WaitingDto 객체)를 매개변수로 전달
		// 2- WaitingDto -> WaitingDto 로부터 true or false 를 반환값으로 전달 받음
		Boolean result = WaitingDao.getInstance().waiting(waitingDto);
		
		// 2. WaitingDto -> WaitingView -> waiting() 메소드 55 행에게 반환값 전달
		return result;
	}
	
	// 2. 대기 목록 출력 제어 메소드
	public WaitingDto[] waitingList() {
		
		// 1. 반환값 받기 / 정보전달
		// WaitingDto -> WaitingDao -> waitingList() 메소드에서 반환한 배열(대기목록)을 result 변수에 대입
		WaitingDto[] result = WaitingDao.getInstance().waitingList();
		
		// 2. WaitingDto -> WaitingView -> waitingList() 메소드 72 행에게 반환값 전달
		return result;
	}
}
