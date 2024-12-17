package day_7;

import java.io.PipedWriter;
import java.lang.classfile.attribute.LocalVariableTableAttribute;
import java.security.Identity;
import java.util.Scanner;

/*
주제 : 회원 서비스 구현하기
- 문법 : 변수 / 입출력함수 / 연산자 / 제어문 / 클래스
- 회원 : 최대 3명까지 저장 가능 
- 회원정보 : 아이디 / 비밀번호 / 닉네임
- 회원 클래스를 정의하고 회원 객체를 활용하여 구현하기
- 프로그램 초기 메뉴 : 1. 회원가입 2 . 로그인
- 1번 선택 시 : 아이디 / 비밀번호 / 닉네임 을 입력 받아 저장하기
- 2번 선택 시 : 저장된 정보 와 일치하면 '로그인성공' 아니면 '로그인실패' 

1. 코드 구현
2. 코드에서 문법 찾기
*/
public class Example3 {
	String id;
	String pw;
	String nickname;
	public static void main(String[] args) {
		Example3 p1 = new Example3();
		Example3 p2 = new Example3();
		Example3 p3 = new Example3();
		
		while(true) {
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println(">> 1. 회원가입 2. 로그인");
			int choose = scan1.nextInt();
			
			if(choose == 1){
				System.out.println("> 아이디 입력");
				String id = scan1.next();
			
				System.out.println("> 비밀번호 입력");
				String pw = scan1.next();
			
				System.out.println("> 닉네임 입력");
				String nickN = scan1.next();
			
				Example3 join = new Example3();
				join.id = id;
				join.pw = pw;
				join.nickname = nickN;
				
				if(p1.id == null) {
					p1 = join;
					System.out.println(p1.id);
				}else if(p2.id == null) {
					p2 = join;
				}else if(p3.id == null) {
					p3 = join;
				}
				
			}else if(choose == 2){
				
				System.out.println("> 로그인 아이디 입력");
				String logId = scan1.next();
				System.out.println("> 로그인 비밀번호 입력");
				String logPw = scan1.next();
				
				if(p1.id != null) {
					if(p1.id.equals(logId) && p1.pw.equals(logPw)) {
						System.out.print( p1.nickname +" 님 로그인 성공");
					}else {
						System.out.println("회원정보가 없습니다.");
					}
				}
				if(p2.id != null) {
					if(p2.id.equals(logId) && p2.pw.equals(logPw)) {
						System.out.print( p2.nickname +" 님 로그인 성공");
					}else {
						System.out.println("회원정보가 없습니다.");
					}
				}
				if(p3.id != null) {
					if(p3.id.equals(logId) && p3.pw.equals(logPw)) {
						System.out.print( p3.nickname +" 님 로그인 성공");
					}else {
						System.out.println("회원정보가 없습니다.");
					}
				}
				
				
			}
		}
	}

}
