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
				
			}else if(choose == 3) {
				
			}else if(choose == 4) {
				
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
	public void read() {
		
	}
	// [3] 아이디 찾기
	public void update() {
		
	}
	// [4] 비밀번호 찾기
	public void delete() {
		
	}
	
}
