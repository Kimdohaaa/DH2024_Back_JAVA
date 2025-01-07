package boardservice10.controller;

import boardservice10.model.dao.MemberDao;
import boardservice10.model.dto.MemberDto;

public class MemberController {
	// 싱글톤 s
	// [1] 생성자
	private MemberController(){}
	// [2] 객체 생성
	private static MemberController instance = new MemberController();
	// [3] 메소드
	public static MemberController getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// [1] 회원가입
	public boolean signUp(MemberDto memberDto) {
		boolean result = MemberDao.getInstance().signUp(memberDto);
		
		return result;
	}
	// [2] 로그인
	public boolean read() {
			
	}
	// [3] 아이디 찾기
	public String update() {
			
	}
	// [4] 비밀번호 찾기
	public String delete() {
			
	}
}
