package day_10;

import java.util.Scanner;

public class JoinService {
	void joinFunc(Scanner scan, Join[] joinArr) {
		System.out.println(">> 회원가입 선택");
		
		System.out.println("> 아이디 입력");
		String id = scan.next();
		System.out.println("> 비밀번호 입력");
		String password = scan.next();
		System.out.println("> 닉네임 입력");
		String nickName = scan.next();
		
		Join p1 = new Join(id,password,nickName);
		System.out.println(p1);
		
		Boolean joinState = false;
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i] == null) {
				joinArr[i] = p1;
				joinState = true;
				break;
			}
		}
		if(joinState == true) {
			System.out.println(">> 회원가입 성공");
		}else {
			System.out.println(">> 회원가입 실패");
		}
	}
	
	void logInFunc(Scanner scan, Join[] joinArr) {
		System.out.println(">> 로그인 선택");
		
		System.out.println("> 아이디 입력");
		String id = scan.next();
		System.out.println("> 비밀번호 입력");
		String password = scan.next();
		
		Join l1 = new Join(id, password);
		
		
		Boolean logInState = false;
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i] != null && joinArr[i].getId().equals(l1.getId()) && joinArr[i].getPassword().equals(l1.getPassword())) {
				System.out.println(">> 로그인 성공");
				logInState = true;
				break;
			}
			if(logInState == false) {
				System.out.println(">> 로그인 실패");
				break;
			}
			
		}
		
	}
}
