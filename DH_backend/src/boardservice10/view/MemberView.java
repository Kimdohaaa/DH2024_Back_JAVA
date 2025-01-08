package boardservice10.view;

import java.util.Scanner;

import boardservice10.controller.MemberController;
import boardservice10.model.dto.MemberDto;

public class MemberView {
	// 싱글톤 s
	// [1] 생성자
	private MemberView() {}
	// [2] 객체 생성
	private static MemberView instance = new MemberView();
	// [3] 메소드
	public static MemberView getInstance() {
		return instance;
	}
	// 싱글톤 e

	Scanner scan = new Scanner(System.in);
	
	// 메인 메소드
	public void run() {
		while(true) {
			System.out.println(">> 1. 회원가입  2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기 5. 로그아웃");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				signUp();
			}else if(choose == 2) {
				login();
			}else if(choose == 3) {
				findId();
			}else if(choose == 4) {
				findPwd();
			}else if(choose == 5) {
				logout();
			}
		}
	}
	// [1] 회원가입
	public void signUp() {
		System.out.print(">> 아이디 : ");
		String mid = scan.next();
		System.out.print(">> 비밀번호 : ");
		String mpwd = scan.next();
		System.out.print(">> 이름 : ");
		String mname = scan.next();
		System.out.print(">> 전화번호 : ");
		String mphone = scan.next();
		
		MemberDto memberDto = new MemberDto(mid, mpwd , mname, mphone);
		
		boolean result = MemberController.getInstance().signUp(memberDto);
				
		if(result == true) {
			System.out.println(">> 회원가입 성공");
		}else {
			System.out.println(">> 회원가입 실패");
		}
	}
	
	// [2] 로그인
	public void login() {
		System.out.print(">> 아이디 : ");
		String mid = scan.next();
		System.out.print(">> 비밀번호 : ");
		String mpwd = scan.next();
		
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMpwd(mpwd);
		
		boolean result = MemberController.getInstance().login(memberDto);
		
		if(result) {
			System.out.println(">> 로그인 성공");
		}else {
			System.out.println(">> 동일한 회원정보가 없습니다.");
		}

	}
	
	// [3] 아이디 찾기
	public void findId() {
		// 1) 입력
		System.out.print(">> 이름 : ");
		String mname = scan.next();
		System.out.print(">> 전화번호 : ");
		String mphone = scan.next();
	
		// 2) 객체화 -> 데이터 가공
		MemberDto memberDto = new MemberDto(); // 디폴트 생성자로 인스턴스 생성
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		
		// 3) controller 로 전달(request)
		String result = MemberController.getInstance().findId(memberDto);
		
		// 4) controller 의 응답(response)에 따른 결과 처리
		if(result != null) {
			System.out.println(">> 찾은 아이디 : " + result);
		}else {
			System.out.println(">> 동일한 회원정보가 없습니다.");
		}
	}
	// [4] 비밀번호 찾기
	public void findPwd() {
		// 1) 입력
		System.out.print(">> 아이디 : ");
		String mid = scan.next();
		System.out.print(">> 전화번호 : ");
		String mphone = scan.next();
		
		// 2) 객체화 -> 데이터 가공
		MemberDto memberDto = new MemberDto();
		memberDto.setMid(mid);
		memberDto.setMphone(mphone);
		
		// 3) controller 로 전달(request)
		String result = MemberController.getInstance().findPwd(memberDto);
		
		// 4) controller 의 응답(response)에 따른 결과 처리
		if(result != null) {
			System.out.println(">> 찾은 비밀번호 : " + result);
		}else {
			System.out.println(">> 동일한 회원정보가 없습니다.");
		}
	}
	
	// [5] 로그아웃 (수업에서만 !!!)
	public void logout() {
		MemberController.getInstance().logout();
		System.out.println(">> 로그아웃 성공");
	}
	
	// [6] 내정보
	public void myInfo() {
		MemberDto result = MemberController.getInstance().myInfo();
		
		System.out.println("======= 마이페이지 =======");
		System.out.println(">> 아이디 : " + result.getMid());
		System.out.println(">> 이름 : " + result.getMname());
		System.out.println(">> 전화번호 : " + result.getMphone());
		System.out.println(">> 가입일 : " + result.getMdate());
		
		// 서브메뉴
		while(true) {
			System.out.println(">> 1. 회원수정 2. 회원탈퇴 3. 뒤로가기 ");
			int choose2 = scan.nextInt();
			if(choose2 == 1) {
				
			}else if(choose2 == 2) {
				delete();
			}else if(choose2 == 3) {
				break;
			}
		}
	}
		
	// [7] 회원 탈퇴
	public void delete() {
			System.out.println(">> 정말 회원 탈퇴를 하시나요? 0. 예 1. 아니요");
			int choose3 = scan.nextInt();
			
			if(choose3 == 0) {
				MemberController.getInstance().delete();
				logout(); 	// 탈퇴 성공 시 로그아웃
			}
	}
}






















