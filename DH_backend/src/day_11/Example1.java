package day_11;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Member[] memberArr = new Member[100];
		Board[] boardArr = new Board[100];
		
		MemberService ms = new MemberService();
		BoardService2 bs =  new BoardService2();
		
		Member m = new Member(false) {} ;
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println(">> 1. 회원가입 2. 로그인");
			int choose1 = scan.nextInt();
			
			if(choose1 ==1 ) {
				ms.memberAdd(scan, memberArr);
			}else if(choose1 == 2) {
				ms.membersign(scan, memberArr, m);
				System.out.println(m.getState());
				if(m.getState() == true) {
					System.out.println(">> 1. 게시물 등록 2. 게시물 출력");
					int choose2 = scan.nextInt();
					
					if(choose2 == 1) {
						bs.boardAdd(scan, boardArr, choose2);
					}else if(choose2 == 2) {
						bs.boardPrint(scan, boardArr, memberArr);
					}
				}
			}
		}
	}

}
