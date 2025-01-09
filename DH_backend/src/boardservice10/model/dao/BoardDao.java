package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import boardservice10.model.dto.BoardDto;

// extends 키워드를 통해 Dao 를 상속받음
public class BoardDao extends Dao {
	// 싱글톤 s
	private BoardDao(){}	
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	ArrayList<BoardDto> boardList = new ArrayList<BoardDto>();
	
	// [1] 게시물 쓰기
	public void name() {
			
	}
	// [2] 게시물 상세 보기
	public BoardDto findById(int bno) {
		try {
			String sql = "select * from board where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
				
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int Bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				int bview = rs.getInt("bview");
				String bdate = rs.getString("bdate");
				int cno = rs.getInt("cno");
					
				BoardDto boardDto = new BoardDto(Bno, btitle,bcontent,bview,bdate,cno);
				
				return boardDto;
			}
				
			}catch (SQLException e) {
				System.out.println(e);
			}
			
			return null;
			
	}
	// [3] 게시물 전체 조회
	public ArrayList<BoardDto> findAll() {
		// findAll() 메소드 밖에 생성 시 멤버변수로 계속 싱글톤에 남음
		// while 문 안에 생성 시 while 문 종료 시 같이 종료됨
		// 현재 위치에 ArrayList 인스턴스를 생성해야 조회된 레코드를 한 개 씩 저장하여 여러 개의 레코드 저장 가능
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
					
		try {
		
			String sql = "select * from board";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			// 전체 조회를 위해 while 문 사용
			while(rs.next()) {
				// 1) 현재 레코드의 각 속성별 값 반환하기
				 int bno = rs.getInt("bno");
				 String btitle = rs.getString("btitle");
				 String bcontent = rs.getString("bcontent");
				 int bview = rs.getInt("bview");
				 String bdate = rs.getString("bdate");
				 int cno = rs.getInt("cno");
				 
				 // 2) 객체화
				 BoardDto boardDto = new BoardDto(bno, btitle,bcontent,bview,bdate,cno);
				 
				 // 3) ArraysList 에 삽입
				 list.add(boardDto);
				 
			}
	
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		 return list;		

	}
		
}
