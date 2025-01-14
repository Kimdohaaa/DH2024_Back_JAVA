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
			System.out.println(">> 1. 회원가입  2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				signUp();
			}else if(choose == 2) {
				login();
			}else if(choose == 3) {
				findId();
			}else if(choose == 4) {
				findPwd();
			}
		}
			
	}
	// 회원가입
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
		
		int result = MemberController.getInstance().signUp(memberDto);
		
		if(result == 1) {
			System.out.println(">> 아이디 길이를 5 ~ 30 으로 작성해주세요.");
		}else if(result == 2){
			System.out.println(">> 해당 정보가 이미 존재합니다.");
		}else if(result == 3) {
			System.out.println(">> 비밀번호 길이를 5 ~ 30 으로 작성해주세요.");
		}else if(result == 4) {
			System.out.println(">> 이름 길이를 3 ~ 20 으로 작성해주세요.");
		}else if(result == 5) {
			System.out.println(">> 연락처를 010-0000-0000 형식으로 작성해주세요.");
		}else if(result == 6) {
			System.out.println(">> 회원가입 성공");
		}else if(result == 7) {
			System.out.println(">> 회원가입 실패");
		}
		
	}
	
	// 로그인
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
			BoardView.getInstance().index(); // 로그인 성공 시 BoardView 의 index 메소드 호출
		}else {
			System.out.println(">> 동일한 회원정보가 없습니다.");
		}

	}
	
	// 아이디 찾기
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
	// 비밀번호 찾기
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
	
	// 로그아웃 (수업에서만 !!!)
	public void logout() {
		MemberController.getInstance().logout();
		System.out.println(">> 로그아웃 성공");
	}
	
	// 내정보
	public int myInfo() {
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
				update();
			}else if(choose2 == 2) {
				// delete 메소드에서 0 을 반환 시
				int state = delete();
				if(state == 0) {
					return 0;	
				}
			}else if(choose2 == 3) {
				break;
			}
			
		}
		
		return 1; // 회원 유지
	}
		
	// 회원 탈퇴
	public int delete() {
			System.out.println(">> 정말 회원 탈퇴를 하시나요? 0. 예 1. 아니요");
			int choose3 = scan.nextInt();
			
			if(choose3 == 0) {
				MemberController.getInstance().delete();
				return 0;  // 0-> 탈퇴한 상태로 설계 (기록을 남기기 위해)
			}
			
			return 1;	// 1 -> 탈퇴하지 않은 상태로 설계 (기록을 남기기 위해)
	}
	
	// 회원정보 수정 
	public void update() {
		System.out.print(">> 새로운 비밀번호 : ");
		String mpwd = scan.next();
		System.out.print(">> 새로운 이름 : ");
		String mname = scan.next();
		System.out.print(">> 새로운 전화번호 : ");
		String mphone = scan.next();
		
		
		// 객체화
		MemberDto memberDto = new MemberDto();
		memberDto.setMpwd(mpwd);
		memberDto.setMname(mname);
		memberDto.setMphone(mphone);
		
		// Controller 에게 전달
		boolean result = MemberController.getInstance().update(memberDto);
		
		if(result == true) {
			System.out.println(">> 수정 완료");
		}else {
			System.out.println(">> 수정 실패");
		}
	}
}






















