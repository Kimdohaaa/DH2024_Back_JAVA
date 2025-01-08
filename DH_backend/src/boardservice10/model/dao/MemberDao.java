package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import boardservice10.model.dto.MemberDto;

public class MemberDao {
	private Connection conn; // DB 연동 결과를 조작하는 인터페이스
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	// 싱글톤 s
	// [1] 생성자
	private MemberDao() {
		// 예외 처리
		try {
			// 1) JDBC 클래스 드라이버 로드 : .Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2) 설정한 경로 / 계정 / 비밀번호로 DB 서버 연동 시도 후 결과(구현체) 반환  
			conn = DriverManager.getConnection(dburl,dbuser,dbpwd);
			System.out.println(">> DB 연동 성공");
		}catch (Exception e) {
			System.out.println(">> DB 연동 실패 "+ e);
		}
	}
	// [2] 객체 생성
	private static MemberDao instance = new MemberDao();
	// [3] 메소드
	public static MemberDao getInstance() {
		return instance;
	}
	// 싱글톤 e

	// [1] 회원가입 SQL 처리
	public boolean signUp(MemberDto memberDto) {
		
		try {
			// [1] SQL 작성
			String sql = "insert into member(mid, mpwd, mname, mphone) values ('"+memberDto.getMid()+"','"+memberDto.getMpwd()+"','"+memberDto.getMname()+"','"+memberDto.getMphone()+"')";
			// [2] DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			// [3] 기재된 SQL 실행 후 결과 반환 받기 : .executeUpdate();
			int count = ps.executeUpdate();
			// [4] 반환값에 따른 처리 및 반환
			if(count == 1) { // 만약 1 개의 레코드를 삽입했다면
				return true;
			}
		
		}catch (SQLException e) {
			System.out.println(">> insert 실패" + e);
		}
			return false;
	}

	// [2] 로그인 SQL 처리
		// 타입을 int 로 설계한 이유 : SQL 로 조회된 회원번호를 반환하기 위해
	public int login(MemberDto memberDto) {
		try {
			// [1] SQL 작성
			String sql = "select mno from member where mid = ? and mpwd = ?";
			
			// [2] DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, memberDto.getMid());
			ps.setString(2, memberDto.getMpwd());
			
			// [3] 기재된 SQL 실행 후 결과 반환 받기
			ResultSet rs = ps.executeQuery();
			
			// [4] 반환값에 따른 처리 및 반환
			if(rs.next()) {
				int mno = rs.getInt("mno");
				return mno;
			}
			
		}catch(SQLException e){
			System.out.println(e);
		}
		
		return 0;
	}

	// [3] 아이디 찾기 SQL 처리
	public String findId(MemberDto memberDto) {
		try {
			// [1] SQL 작성
			String sql = "select * from member where mname = ? and mphone = ?"; // and == &&
			// [2] DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, memberDto.getMname());
			ps.setString(2, memberDto.getMphone());
	
			// [3] 기재된 SQL 실행 후 결과 반환 받기
			ResultSet rs = ps.executeQuery();	// .executeQuery() 의 반환값 : ResulteSet 타입 반환 | DB 에 존재 시 ->  DB 에 존재하지 않을 시 -> null
			// [4] 반환값에 따른 처리 및 반환
			if(rs.next()) { // .next() : 다음 레코드로 이동
				String findMid = rs.getString("mid");	// 다음레코드로 이동이 가능할 경우 DB 에 해당 값이 존재할 경우 찾은 값 반환
				return findMid;
			}
			
		}catch(SQLException e){
			System.out.println(e);
		}
			
		return null;	// 찾지 못했을 시 null 반환
	}
	
	// [4] 비밀번호 찾기 SQL 처리
	public String findPwd(MemberDto memberDto) {
		try {
			// [1] SQL 작성
			String sql = "select * from member where mid = ? and mphone =?";
			// [2] DB와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, memberDto.getMid());
			ps.setString(2, memberDto.getMphone());
			// [3] 기재된 SQL 실행 후 결과 반환 받기
			ResultSet rs = ps.executeQuery();
			// [4] 반환값에 따른 처리 및 반환
			if(rs.next()) {
				String findPwd = rs.getString("mpwd");
				return findPwd;
			}
		
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	// [6] 내정보 SQL 처리
	public MemberDto myInfo(int loginMno) {
		try {	
			// [1] SQL 작성
			String sql = "select * from member where mno = ?";
			
			// [2] DB 와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, loginMno);
			
			// [3] 기재된 SQL 실행 후 결과 반환 받기
			ResultSet rs = ps.executeQuery();
			
			// [4] 반환값에 따른 처리 및 반환
				// 레코드 한 줄을 조회하는 것이기 때문에 while 문이 아닌 if 문 사용
			if(rs.next()) {
				MemberDto memberDto = new MemberDto();
				memberDto.setMid(rs.getString("mid"));
				memberDto.setMname(rs.getString("mname"));
				memberDto.setMphone(rs.getString("mphone"));
				memberDto.setMdate(rs.getString("mdate"));
				
				return memberDto;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return null; // 조회된 회원정보가 없다.
	}
		
	// [7] 회원 탈퇴 SQL 처리
	public void delete(int loginMno) {
		try {
			// [1] SQL 작성
			String sql = "delete from member where mno = ?";
			
			// [2] DB 와 연동된 곳에 SQL 기재
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, loginMno);
			
			// [3] 기재된 SQL 실행 후 결과 반환 받기
			int count = ps.executeUpdate();
			
			// [4] 반환값에 따른 처리 및 반환
			
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
}
