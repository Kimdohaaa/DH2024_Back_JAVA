package day_9;

import java.util.Scanner;

public class JoinService {
	void joinFunc(Scanner scan, Join[] joinArr) {
		System.out.println(">> 회원가입을 선택하였습니다.");
		
		System.out.println("> 아이디 입력");
		String id = scan.next();
		System.out.println("> 비밀번호 입력");
		String password = scan.next();
		System.out.println("> 닉네임 입력");
		String nickName = scan.next();
		
		Join p1 = new Join();
		p1.ID = id;
		p1.password = password;
		p1.nickName = nickName;
		
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i] == null) {
				joinArr[i] = p1;
				break;
			}
		}
	}
	void logInFunc(Scanner scan, Join[] joinArr) {
		System.out.println(">> 로그인을 선택하였습니다.");
		
		System.out.println("> 아이디 입력");
		String id = scan.next();
		System.out.println("> 비밀번호 입력");
		String password = scan.next();
		
		Join l1 = new Join();
		l1.ID = id;
		l1.password = password;
		
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i].ID.equals(l1.ID) && joinArr[i].password.equals(l1.password)) {
				System.out.println(">> 로그인 성공");
				System.out.println(joinArr[i].nickName + " 님 로그인 되었습니다.");
				break;
			}else {
				System.out.println(">> 로그인 실패");
			}
		}
	}
}
