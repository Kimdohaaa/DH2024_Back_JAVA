package day_12;

import java.util.Scanner;

public class MemberService {
	public void memberAdd(Scanner scan, MemberDto[] memberArr) {
		System.out.println(">> 회원 회원가입을 선택하셨습니다.");
		
		System.out.print("> 아이디 : ");
		String id = scan.next();
		System.out.print("> 비밀번호 : ");
		String pw = scan.next();
		
		MemberDto manager = new MemberDto(id,pw);
		
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] == null) {
				memberArr[i] = manager;
				System.out.println(">> 회원가입 성공");
				break;
			}
		}
	}
	
	public String memberLogin(Scanner scan, MemberDto[] memberArr, String mi) {
		System.out.println(">> 회원 로그인을 선택하셨습니다.");
		
		System.out.print("> 아이디 : ");
		String id = scan.next();
		System.out.print("> 비밀번호 : ");
		String pw = scan.next();
		
		Boolean state = false;
		for(int i = 0; i < memberArr.length; i++) {
			if(memberArr[i] != null && memberArr[i].getId().equals(id) && memberArr[i].getPw().equals(pw)) {
				state = true;
				System.out.println(">> 로그인 성공");

				return memberArr[i].getId();
			}
			
			if(state == false) {
				System.out.println(">> 로그인 실패");
				break;
			}
		}
		
		return null;
	}
	
	public void rental(Scanner scan, BookDto[] bookArr, MemberDto[] memberArr, MemberDto[] rentalArr) {
		System.out.println(">> 도서대여를 선택하셨습니다.");
		
		System.out.println("> 대여도서 이름 :");
		String title = scan.next();

		//RentalArr rentalArr2 = new RentalArr(null);

		Boolean rentalState = false;
		MemberDto rental = new MemberDto(null);
		
		for(int i = 0; i < bookArr.length; i++) {
			for(int j = 0; j < rentalArr.length ; j++) {
				
				if(bookArr[i] != null && bookArr[i].getTitle().equals(title) && bookArr[i].getCount() > 0) {
					if(rentalArr[j] == null) {
						bookArr[i].setCount(bookArr[i].getCount()-1);
						// rentalArr 에 안들어가ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
						rentalArr[j] = title;
						rentalState = true;
						System.out.println(">> 도서대여완료");
						
						System.out.println(bookArr[i].getCount());
						break;
					}
				}	
			}	
		}
		
		if(rentalState == false) {
			System.out.println(">> 도서대여실패");
		}
				
	}
	
	public void deleteRental(Scanner scan, BookDto[] bookArr, MemberDto[] rentalArr) {
		System.out.println(">> 도서반납을 선택하셨습니다.");
		
		System.out.println("> 반납도서 이름 : ");
		String title = scan.next();
		
		Boolean deleteState = false;
		//////
		for(int i = 0; i < rentalArr.length; i++) {
			for(int j = 0; j < bookArr.length; j++) {
				if(rentalArr[i] != null && rentalArr[i].getRentalArr() == title) {
					rentalArr[i].setRentalArr(null);
					bookArr[j].setCount(bookArr[i].getCount() + 1);
					deleteState = true;
					System.out.println(">> 도서반납완료");
					System.out.println(bookArr[i].getCount());
					System.out.printf(" 도서제목 : %s", rentalArr[i].getRentalArr());
					break;
				}
			}
		}
		
		if(deleteState == false) {
			System.out.println(">> 도서반납실패");
		}
		
	}
	
	public void rentalList(RentalArr[] rentalArr) {
		System.out.println(">> 도서현황을 선택하셨습니다.");
		
		for(int i =0; i < rentalArr.length; i++) {
			///
			if(rentalArr[i] !=  null) {
				System.out.printf(" 도서제목 : %s", rentalArr[i].getRentalArr());
				break;
			}
		}
	}
}
