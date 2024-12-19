package day_9;

import java.util.Scanner;

public class JoinService {
	void joinFunc(Scanner scan, Join[] joinArr) {
		System.out.println(">> 회원가입을 선택하였습니다.");
		
		
		// 매개변수로 받은 scan 을 통해 입력값을 변수에 대입
		System.out.println("> 아이디 입력");
		String id = scan.next();
		System.out.println("> 비밀번호 입력");
		String password = scan.next();
		System.out.println("> 닉네임 입력");
		String nickName = scan.next();
		
		// Join 클래스 회원가입 객체 생성
		Join p1 = new Join();
		// 생성한 Join 클래스 객체에 입력값 대입
		p1.ID = id;
		p1.password = password;
		p1.nickName = nickName;
		
		// joinArr[] 내 index 에 객체 저장
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i] == null) {
				joinArr[i] = p1;
				break;
			}
		}
	}
	void logInFunc(Scanner scan, Join[] joinArr) {
		System.out.println(">> 로그인을 선택하였습니다.");
		
		// 매개변수로 받은 scan 을 통해 입력값을 변수에 대입
		System.out.println("> 아이디 입력");
		String id = scan.next();
		System.out.println("> 비밀번호 입력");
		String password = scan.next();
		
		// Join 클래스 로그인 객체 생성
		Join l1 = new Join();
		// 생성한 Join 클래스 객체에 입력 값 대입
		l1.ID = id;
		l1.password = password;
		
		
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i].ID.equals(l1.ID) && joinArr[i].password.equals(l1.password)) { // Join 클래스의 회원가입 객체의 값 == Join 클래스의 로그인 객체의 값
				if(joinArr[i] != null) {
					System.out.println(joinArr[i].nickName + " 님 로그인 되었습니다.");	// Join 클래스 회원가입 객체의 닉네임 출력
					break;
				}
			}else{	// Join 클래스의 회원가입 객체의 값 != Join 클래스의 로그인 객체의 값
				if(joinArr[i] == null) {
					System.out.println(">> 로그인 실패");
				}
			}
		}
	}
}
