package day_12;

import java.util.Scanner;

public class ManagerService {
	// 관리자 회원가입 메소드
	public void managerAdd(Scanner scan, ManagerDto[] managerArr) {
		System.out.println(">> 관리자 회원가입을 선택하셨습니다.");
		
		System.out.print("> 아이디 : ");
		String id = scan.next();
		System.out.print("> 비밀번호 : ");
		String pw = scan.next();
		System.out.print("> 관리자 번호 : ");
		int managerNo = scan.nextInt();
		
		ManagerDto manager = new ManagerDto(id,pw,managerNo);
		
		for(int i = 0; i < managerArr.length; i++) {
			if(managerArr[i] == null) {
				managerArr[i] = manager;
				System.out.println(">> 회원가입 성공");
				break;
			}
		}
		
	}
	
	// 관리자 로그인 메소드
	public int managerLogin(Scanner scan, ManagerDto[] managerArr , int mn) {
		System.out.println(">> 관리자 로그인을 선택하셨습니다.");
		
		System.out.print("> 아이디 : ");
		String id = scan.next();
		System.out.print("> 비밀번호 : ");
		String pw = scan.next();
		System.out.print("> 관리자 번호 : ");
		int managerNo = scan.nextInt();
		
		Boolean state = false;
		for(int i = 0; i < managerArr.length; i++) {
			if(managerArr[i] != null && managerArr[i].getId().equals(id) 
									 && managerArr[i].getPw().equals(pw)
									 && managerArr[i].getManagerNo() == managerNo) {
				state = true;
				System.out.println(">> 로그인 성공");
				
				return managerArr[i].getManagerNo();
			}
			
			if(state == false) {
				System.out.println(">> 로그인 실패");
			}
		}
		
		return 0;
	}
}
