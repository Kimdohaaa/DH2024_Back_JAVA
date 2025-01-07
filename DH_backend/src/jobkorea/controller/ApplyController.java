package jobkorea.controller;


public class ApplyController {
	// 싱글톤 s
	// 생성자
	private ApplyController() {}
	// 객체생성
	private static ApplyController instance = new ApplyController();
	// 메소드
	public static ApplyController getInstance() {
		return instance;
	}
	// 싱글톤 e
}
