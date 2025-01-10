package studentservice;

import studentservice.view.StudentView;

public class AppStart {

	public static void main(String[] args) {
		/*
		과제 : StudentService (학생점수관리 서비스)
		1. 학생명 / 국어 , 영어 , 수학 점수를 입력받아 관리하는 서비스 
		2. 기능 : 점수등록 / 전체점수 조회  / 점수 수정 / 점수 삭제
		3. BoardService10  과 동일하게 MVC 패턴을 사용하여 구현하시오.
		*/
		
		StudentView.getInstance().run();
	}

}
