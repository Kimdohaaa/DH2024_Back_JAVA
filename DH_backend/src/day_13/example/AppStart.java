package day_13.example;
/*
과제 : 대기명단 (MVC 패턴 사용)
- 전화번호와 인원수를 입력받아 대기등록 기능 구축
- 현재 모든 대기명단을 출력하느 기능 구축 
*/

import day_13.example.view.WaitingView;

public class AppStart {
	public static void main(String[] args) {
		// WaitingView -> getInstance() -> index() 접근
		WaitingView.getInstance().index();
	}
}
