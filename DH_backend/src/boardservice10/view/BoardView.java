	package boardservice10.view;

import java.util.ArrayList;
import java.util.Scanner;

import boardservice10.controller.BoardController;
import boardservice10.model.dto.BoardDto;
import jobkorea.model.dto.PostDto;

public class BoardView {
	// 싱글톤 s
	// 생성자
	private BoardView() {}
	// 객체 생성
	private static BoardView instance = new BoardView();
	// 메소드
	public static BoardView getInstance() {
		return instance;
	}
	
	private Scanner scan = new Scanner(System.in);
	// 싱글톤 e

	// (로그인 했을 때)메인메소드 
	public void index() {
		while(true) {
			findAll();
			System.out.println(">> 1. 로그아웃 2. 내정보보기 3. 게시물쓰기 4. 게시물상세보기 5. 게시물전체조회");
			int choose = scan.nextInt();
			
			
			if(choose == 1) {
				MemberView.getInstance().logout();
				break;	// 반복문 종료로 MemberView 의 run() 메소드로 돌아감
			}else if(choose == 2) {
				int state =  MemberView.getInstance().myInfo();
				if(state == 0) {
					return; // MemberView 의 delete 메소드 -> myInfo 메소드 -> 0 을 반환했을 때
				}
			}else if(choose == 3) {
				write();
			}else if(choose == 4) {
				findById();
			}else if(choose == 5) {
				findAll();
			}
		}
	}
	
	// 카테고리전체조회
	public void categoryAll(){
		ArrayList<BoardDto> result = BoardController.getInstance().categoryAll();
		
		for(int i = 0; i < result.size() ; i++) {
			BoardDto boardDto = result.get(i);
			System.out.printf("번호 : %d 카테고리명 : %s \n", boardDto.getCno(), boardDto.getCname());
		}
	}
	
	// 게시물 쓰기
	public void write() {
		// 1) 카테고리 전체 조회
		categoryAll();
		// 2) 입력
		System.out.print(">> 카테고리번호 : ");
		int cno = scan.nextInt();
		System.out.print(">> 제목 : ");
		String bTitle = scan.next();
		System.out.print(">> 내용 : ");
		String bContent = scan.next();
		
		BoardDto boardDto = new BoardDto();
		boardDto.setCno( cno);
		boardDto.setbTitle(bTitle);
		boardDto.setbContent(bContent);
		
		boolean result = BoardController.getInstance().write(boardDto);
		
		if(result) {
			System.out.println(">> 게시물 작성 완료");
		}else {
			System.out.println(">> 게시물 작성 실패");
		}
	}
	// 게시물 상세 보기
	public void findById() {
		System.out.print(">> 게시물 번호 : ");
		int bno = scan.nextInt();
		
		BoardDto boardDto = BoardController.getInstance().findById(bno);

		
		System.out.println("제목 :" + boardDto.getbTitle());
		System.out.println("내용 :" +boardDto.getbContent());
		System.out.println(boardDto.getCname() + "\t" + boardDto.getMid() + "\t" + boardDto.getbView()+ "\t" + boardDto.getbDate());
		System.out.println();
		
		while(true) {
			System.out.println(">> 1. 뒤로가기 2. 댓글작성 3. 수정 4. 삭제");
			int choose = scan.nextInt();
			if(choose == 1) {
				break;
			}else if(choose == 2) {
				
			}else if(choose == 3) {
				update(boardDto.getBno());
			}else if(choose == 4) {
				delete(boardDto.getBno());
			}
		}
	}
	
	// 게시물 수정
	public void update(int bno) {
		System.out.print(">> 수정할 제목 : ");
		String bTitle = scan.next();
		System.out.print(">> 수정할 내용 : ");
		String bContent = scan.next();
		
		BoardDto boardDto = new BoardDto();
		boardDto.setBno(bno);
		boardDto.setbTitle(bTitle);
		boardDto.setbContent(bContent);
		
		boolean result = BoardController.getInstance().update(boardDto);
		
		if(result) {
			System.out.println(">> 게시물 등록 성공");
		}else {
			System.out.println(">> 작성자가 다릅니다.");
		}
		
	}
	
	// 게시물 삭제
	public void delete(int bno) {
		boolean result = BoardController.getInstance().delete(bno);
		
		if(result) {
			System.out.println(">> 삭제 성공");
		}else {
			System.out.println(">> 작성자가 다릅니다.");
		}
	}
	// 게시물 전체 조회
	public void findAll() {
		// 게시물 전체 출력을 위해 ArrayList 사용
		ArrayList<BoardDto> result = BoardController.getInstance().findAll();
		
		System.out.println();
		System.out.print("번호 \t 카테고리 \t 작성자 \t 작성일 \t 제목 ");
		System.out.println();
		for(int index = 0; index < result.size() ; index++) {
			BoardDto boardDto = result.get(index);
			System.out.print(boardDto.getBno() + "\t");
			System.out.print(boardDto.getCname() + "\t");
			System.out.print(boardDto.getMid() + "\t");
			System.out.print(boardDto.getbDate() + "\t");
			System.out.print(boardDto.getbTitle() + "\n");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
