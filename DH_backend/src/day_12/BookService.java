package day_12;

import java.util.Scanner;

public class BookService {
	public void bookAdd(Scanner scan, BookDto[] bookArr) {
		System.out.println(">> 도서등록을 선택하셨습니다.");
		
		System.out.print("> 도서번호 : ");
		int bookNo = scan.nextInt();
		System.out.print("> 도서제목 : ");
		String title = scan.next();
		System.out.println("> 수량 : ");
		int count = scan.nextInt();
		
		BookDto book = new BookDto(bookNo, title, count);
		
		for(int i = 0 ; i < bookArr.length; i++) {
			if(bookArr[i] == null) {
				bookArr[i] = book;
				System.out.println(">> 도서등록 성공");
				break;
			}
		}
	}
	public void bookList(BookDto[] bookArr) {
		System.out.println(">> 도서목록을 선택하셨습니다.");
		
		for(int i = 0; i < bookArr.length; i++) {
			if(bookArr[i] != null) {
				System.out.printf(" 도서번호 : %d 도서제목 : %s", bookArr[i].getBookNo(), bookArr[i].getTitle());
			}
		}
	}
}
