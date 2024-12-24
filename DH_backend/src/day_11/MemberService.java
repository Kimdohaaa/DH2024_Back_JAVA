package day_11;

import java.util.Scanner;

public class MemberService {
	public void memberAdd(Scanner scan, Member[] memberArr) {
		System.out.println(">> 회원가입을 선택하셨습니다.");
		
		System.out.println("> 아이디 : ");
		String id = scan.next();
		System.out.println("> 비밀번호 : ");
		String pw = scan.next();
		
		Member member = new Member(id,pw) {};

		for(int i = 0; i < memberArr.length ; i++) {
			if(memberArr[i] == null) {
				memberArr[i] = member;
				break;
			}
		}
	
	}
	public void membersign(Scanner scan, Member[] memberArr, Member state) {
		System.out.println(">> 로그인을 선택하셨습니다.");
		
		System.out.println("> 아이디 : ");
		String id = scan.next();
		System.out.println("> 비밀번호 : ");
		String pw = scan.next();
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] != null && memberArr[i].getId().equals(id) && memberArr[i].getPw().equals(pw) ) {
				state.setState(true);
				break;
			}else {
				state.setState(false);
			}
		}
		
		if(state.getState() == true) {
			System.out.println(">> 로그인 성공");
		}else {
			System.out.println(">> 로그인 실패");
		}
	}
}
