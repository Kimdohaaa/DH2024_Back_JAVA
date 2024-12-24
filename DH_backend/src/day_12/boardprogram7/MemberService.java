package day_12.boardprogram7;

import java.util.Scanner;

public class MemberService {
	// 멤버변수
	// 생성자
	
	// 메소드
	// 1) 회원가입 메소드
	public void signUp(Scanner scan, MemberDto[] members) {
		System.out.println(">> 회원가입을 선택하셨습니다.");
		
		System.out.println("> 아이디 : ");
		String id =  scan.next();
		System.out.println("> 비밀번호 : ");
		String pwd =  scan.next();
		System.out.println("> 닉네임 : ");
		String name = scan.next();
		
		// MemberDto 의 생성자를 이용한 객체 생성
		MemberDto dto = new MemberDto(id,pwd,name) ;
		
		for(int i = 0; i < members.length ; i++) {
			if(members[i] == null) {
				members[i] = dto;
				System.out.println(">> 회원가입 성공");
				break;
			}
		}
	}
	
	// 2) 로그인 메소드 
	public String logIn(Scanner scan, MemberDto[] members) {
		System.out.println(">> 로그인을 선택하셨습니다.");
		
		System.out.println("> 아이디 : ");
		String id =  scan.next();
		System.out.println("> 비밀번호 : ");
		String pwd =  scan.next();
		
			
		for(int i = 0; i < members.length; i++) {
			MemberDto memberDto = members[i];
			if(memberDto != null && memberDto.getId().equals(id) && memberDto.getPwd().equals(pwd)) {
				System.out.println(">> 로그인 성공");
				
				// 로그인 성공 시 아이디 반환
				return memberDto.getId();
			}
		}
		
		System.out.println(">> 로그인 실패");
		// 로그인 실패 시 null 반환
		return null;
		
	}
}
