package day_12;

import java.util.Scanner;

/*
과제 : 도서관리 프로그램
- 초기 메뉴 : 회원가입 / 로그인
- 회원가입 시 일반인 인지 관리자 인지 구분하여 가입 진행
- 로그인 시  일반인 인지 관리자 인지 구분하여 로그인 진행
- 로그인 성공 시
	- 관리자인 경우 1. 도서등록 2. 도서목록 
	- 일반인인 경우 1. 도서대여 2. 도서반납 3. 대여현황
- 관리자는 도서 정보를 입력 받아 도서등록을 처리
- 관리자는 현재 등록된 모든 도서목록을 출력
- 일반인은 도서대여 시 대여할 도서번호를 입력받아 대여가 가능하면 대여 진행
- 일반인은 도서반납 시 반납할 도서번호를 입력받아 대여가 가능하면 반납 진행
- 일반인은 내가 대여한 모든 도서 현황 출력
- 로그아웃 제공
- 회원과 도서 정보 멤버변수는 각 3개 이상 
*/
public class Example5 {

	public static void main(String[] args) {
		
		ManagerDto[] managerArr = new ManagerDto[100];
		MemberDto[] memberArr = new MemberDto[100];
		BookDto[] bookArr = new BookDto[100];
		RentalArr[] rentalArr = new RentalArr[100];
		
		ManagerService managerS = new ManagerService();
		MemberService memberS = new MemberService();
		BookService bs =  new BookService();
		
		int mn = 0;
		String mi = null;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("1. 회원가입 2. 로그인");
			int choose1 = scan.nextInt();
			
			if(choose1 == 1) {
				System.out.println("1. 관리자 회원가입 2. 회원 회원가입");
				int choose2 = scan.nextInt();
				
				if(choose2 == 1) {
					managerS.managerAdd(scan, managerArr);
				}else if(choose2 == 2) {
					memberS.memberAdd(scan, memberArr);
				}
				
			}else if(choose1 == 2) {
				System.out.println("1. 관리자 로그인 2. 회원 로그인");
				int choose2 = scan.nextInt();
				
				if(choose2 == 1) {
					mn = managerS.managerLogin(scan, managerArr, mn);
					
					if(mn != 0) {
						while(true) {
							System.out.println(">> 1. 도서등록 2. 도서목록 3. 로그아웃");
							int choose3 = scan.nextInt();
							if(choose3 == 1) {
								bs.bookAdd(scan, bookArr);
							}else if(choose3 == 2) {
								bs.bookList(bookArr);
							}else if(choose3 == 3) {
								mn = 0;
								System.out.println(">> 로그아웃 성공");
								break;
							}
						}
					}
					
				}else if(choose2 == 2) {
					mi = memberS.memberLogin(scan, memberArr, mi);
					if(mi != null){
						while(true) {
							System.out.println(">> 1. 도서대여 2. 도서반납 3. 도서현황 4. 로그아웃");
							int choose3 = scan.nextInt();
							
							if(choose3 == 1) {
								memberS.rental(scan, bookArr, memberArr,rentalArr);
							}else if (choose3 == 2) {
								memberS.deleteRental(scan, bookArr, rentalArr);
							}else if(choose3 == 3 ) {
								memberS.rentalList(rentalArr);
							}else if(choose3 == 4) {
								mi = null;
								System.out.println(">> 로그아웃 성공");
								break;
							}
						}
					}
				}
			}
		}
	}

}
