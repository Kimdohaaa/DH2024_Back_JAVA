package jobkorea.view;

public class ApplyView {
	// 싱글톤 s
	// 생성자
	private ApplyView() {}
	// 객체생성
	private static ApplyView instance = new ApplyView();
	// 메소드
	public static ApplyView getInstance() {
		return instance;
	}
	// 싱글톤 e
}
