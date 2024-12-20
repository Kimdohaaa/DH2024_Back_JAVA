package day_10;

import java.util.Arrays;
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
		
		// Join 클래스 생성자에 입력값 전달
		Join p1 = new Join(id,password,nickName);
		// ? 생성자를 초기화하는 방식으로 값을 전달하면 멤버변수의 private 여부 상관 X ??
		//System.out.println(p1);

		
		// 유효성 검사를 위한 Boolean 변수 선언
		Boolean joinState = false;
		
		for(int i = 0; i <= joinArr.length -1; i++) {
			if(joinArr[i] == null) {
				joinArr[i] = p1;
				joinState = true;
				//System.out.println(joinArr[i]);
				System.out.println(Arrays.toString(joinArr));
				break;
			}
		}
		
		// 유효성 검사
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
		
		// 유효성 검사를 위한 Boolean 변수 선언
		Boolean joinState = false;
		
		for(int i = 0; i <= joinArr.length -1; i++) {
			// Join 의 멤버변수가 private 으로 선언되어 있기 때문에 get() 메소드를 통해 해당 멤버변수에 접근 
			if(joinArr[i] != null && joinArr[i].getId().equals(id) && joinArr[i].getPassword().equals(password)) {
					joinState = true;
					break;
				}
			}
			
			// 유효성 검사
			if(joinState == true) {
				System.out.println(">> 로그인 성공");
			}else {
				System.out.println(">> 로그인 실패");
			}	
		}
}
