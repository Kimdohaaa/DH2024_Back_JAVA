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
	
	
	
	// 카테고리전체조회
	public ArrayList<BoardDto> categoryAll(){
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		try {
			String sql = "select * from category";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDto boardDto = new BoardDto();
				boardDto.setCno(rs.getInt("cno"));
				boardDto.setCname(rs.getString("cname"));
				
				list.add(boardDto);
			}
		}catch (SQLException e) {
			System.out.println(e);
		}	
		
		return list;
	}
	
	// 게시물 쓰기
	public boolean write(BoardDto boardDto) {
		try {
			String sql = "insert into board(btitle , bcontent, cno , mno) values ( ? , ? , ? , ? )";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, boardDto.getbTitle());
			ps.setString(2, boardDto.getbContent());
			ps.setInt(3, boardDto.getCno());
			ps.setInt(4, boardDto.getMno());
			
			int count = ps.executeUpdate();
			
			if(count == 1) {
				return true;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return false;
		
	}
	// 게시물 상세 보기
	public BoardDto findById(int bno) {
		try {
			String sql = "select b.* , c.cname , m.mid "
					+ " from board as b inner join category as c on b.cno = c.cno "
					+ " inner join member as m on b.mno = m.mno "
					+ " where b.bno = ? ";
			PreparedStatement ps = conn.prepareStatement( sql );
			ps.setInt( 1 , bno );
			ResultSet rs = ps.executeQuery();
			if( rs.next() ) {
				BoardDto boardDto = new BoardDto(
						rs.getInt("bno") , rs.getString("btitle") , 
						rs.getString("bcontent") , rs.getInt("bview") ,
						rs.getString("bdate") , rs.getInt("mno"),
						rs.getInt("cno" ));
				boardDto.setCname( rs.getString("cname" ) );
				boardDto.setMid( rs.getString("mid") );
				
				return boardDto;
			}
				
			}catch (SQLException e) {
				System.out.println(e);
			}
			
			return null;
			
	}
	
	// 게시물 수정
	public boolean update(BoardDto boardDto,int bno) {
		try {
			String sql = "update board set btitle = ? , bcontent = ? where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, boardDto.getbTitle());
			ps.setString(2, boardDto.getbContent());
			ps.setInt(3, bno);
			int count = ps.executeUpdate();
			
			if(count == 1) {
				return true;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		return true;
	}
	
	// 게시물 삭제
	public boolean delete(int bno) {
		try {
			String sql = "delete from board where bno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			
			int count = ps.executeUpdate();
			
			if(count == 1) {
				return true;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	// 내가 쓴 게시물인지 확인
	public boolean writeCheck(int loginMno , int bno) {
		try {
			String sql = "select * from where bno = ? and mno = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			ps.setInt(2, loginMno);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	// 게시물 전체 조회
	public ArrayList<BoardDto> findAll() {
		// findAll() 메소드 밖에 생성 시 멤버변수로 계속 싱글톤에 남음
		// while 문 안에 생성 시 while 문 종료 시 같이 종료됨
		// 현재 위치에 ArrayList 인스턴스를 생성해야 조회된 레코드를 한 개 씩 저장하여 여러 개의 레코드 저장 가능
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
					
		try {
		
			String sql = "select b.* , c.cname , m.mid "
					+ " from board as b inner join category as c on b.cno = c.cno "
					+ " inner join member as m on b.mno = m.mno";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while( rs.next() ) {
				// 레코드 : DB테이블의 가로/행 데이터	// 조회된 결과 레코드1개 <---> 인스턴스(DTO) 1개 // 레코드 여러개 <---> [] 1개 또는 ArrayList 1개 
				// 1. 현재 레코드의 각 속성별 값 반환하기 
				int bno = rs.getInt("bno");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				int bview = rs.getInt("bview");
				String bdate = rs.getString("bdate");
				int mno = rs.getInt("mno");
				int cno = rs.getInt("cno" );
				BoardDto boardDto = new BoardDto(bno, btitle, bcontent, bview, bdate, mno, cno); // 2. 반환 속성값들을 dto(객체)로 만들기 
				
				boardDto.setCname( rs.getString("cname" ) );
				boardDto.setMid( rs.getString("mid") );
				
				list.add(boardDto); // 3. 생성된 dto(객체)를 리스트에 담기 
				 
			}
	
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		 return list;		

	}
		
}
