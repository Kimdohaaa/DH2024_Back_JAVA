package day_9;

import java.util.Scanner;

/*
주제 : 회원 서비스 구현하기
- 문법 : 변수 / 입출력함수 / 연산자 / 제어문 / 클래스
- 회원 : 최대 100명까지 저장 가능 
- 회원정보 : 아이디 / 비밀번호 / 닉네임
- 회원 클래스를 정의하고 회원 객체를 활용하여 구현하기
- 프로그램 초기 메뉴 : 1. 회원가입 2 . 로그인
- 1번 선택 시 : 아이디 / 비밀번호 / 닉네임 을 입력 받아 저장하기
- 2번 선택 시 : 저장된 정보 와 일치하면 '로그인성공' 아니면 '로그인실패' 
*/
public class Example2 {
	public static void main(String[] args) {
		JoinService js = new JoinService();
		Join[] joinArr = new Join[100];
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println(">> 1. 회원가입 2. 로그인");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				js.joinFunc(scan, joinArr);
			}else if(choose == 2) {
				js.logInFunc(scan , joinArr);
			}
		}
	}
}
