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
		// 로그인 성공한 회원의 정보를 저장하기 위한 변수 선언
	private int loginMno = 0;
		// BoardController 에서 호출(글쓰기 기능을 위해)하기 위해 getter 메소드 생성
		// 0이면 비로그인상태 , 0초과이면 로그인상태 = 번호 = 즉 로그인된 회원번호 , PK
	public int getLogInMno  () { return loginMno; }
	public boolean login(MemberDto memberDto) {
		// 로그인 결과는 true / false 이지만 로그인 성공한 회원번호를 내부적으로 저장(성공한 회원을 기록하기 위해)하기 위해 int 타입으로 반환 받음 
		int result = MemberDao.getInstance().login(memberDto);
		
		// 회원번호(1 ~ n)를 반환 -> 0 : 없는 회원번호 0초과 : 있는 회원번호로 설계했기 때문
		if(result > 0) { // 만약 로그인 성공 시
			loginMno = result;	// 로그인 성공 시 로그인 성공한 회원의 번호를 저장
			return true;
		}else {
			return false;
		}
	}

	// [3] 아이디 찾기
	public String findId(MemberDto memberDto) {
		String result = MemberDao.getInstance().findId(memberDto);
		
		return result;	
	}
	// [4] 비밀번호 찾기
	public String findPwd(MemberDto memberDto) {
		String result = MemberDao.getInstance().findPwd(memberDto);
		
		return result;
	}
	
	// [5] 로그아웃
	public void logout() {
		// 로그인된 회원번호를 저장한 변수의 값을 0으로 바꿔 로그아웃 처리
		loginMno = 0;
	}
	
	// [6] 내정보
	public MemberDto myInfo() {	
		// DAO 에게 로그인된 회원번호 전달 / 반환값 받기
		MemberDto reslut = MemberDao.getInstance().myInfo(loginMno);
		
		return reslut;
	}
	
	// [7] 회원 탈퇴
	public void delete() {
		MemberDao.getInstance().delete(loginMno);
	}
}
