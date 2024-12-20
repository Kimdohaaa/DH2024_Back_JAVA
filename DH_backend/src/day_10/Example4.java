package day_10;

import java.util.Scanner;

/*
주제 : 회원 서비스 구현하기
- 문법 : 변수 / 입출력함수 / 연산자 / 제어문 / 클래스
- 회원 : 최대 100명까지 저장 가능 
- 회원정보 : 아이디 / 비밀번호 / 닉네임
- 회원가입 함수 / 로그인 함수
- 프로그램 초기 메뉴 : 1. 회원가입 2 . 로그인
- 1번 선택 시 : 아이디 / 비밀번호 / 닉네임 을 입력 받아 저장하기
- 2번 선택 시 : 저장된 정보 와 일치하면 '로그인성공' 아니면 '로그인실패' 

[개발 순서]
1. 구현하고자하는 초기 화면 구성
2. 메모리 구성
3. 메소드 구성
*/
public class Example4 {

	public static void main(String[] args) {
		Join[] joinArr = new Join[100];
		Join p1 = new Join();
		Join l1 = new Join();
		
		JoinService js = new JoinService();
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println(">> 1. 회원가입 2. 로그인");
			int choose = scan.nextInt();
				
			if(choose == 1) {
				js.joinFunc(scan, joinArr, p1);
			}else if(choose == 2) {
				js.logInFunc(scan, joinArr, l1);
			}
		}
	}

}
