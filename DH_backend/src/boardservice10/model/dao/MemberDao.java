package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	public void read() {
		
		// [1] SQL 작성
		// [2] DB와 연동된 곳에 SQL 기재
		// [3] 기재된 SQL 실행 후 결과 반환 받기
		// [4] 반환값에 따른 처리 및 반환
		
	}
	
	// [3] 아이디 찾기 SQL 처리
	public void update() {
		
		// [1] SQL 작성
		// [2] DB와 연동된 곳에 SQL 기재
		// [3] 기재된 SQL 실행 후 결과 반환 받기
		// [4] 반환값에 따른 처리 및 반환
			
	}
	
	// [4] 비밀번호 찾기 SQL 처리
	public void delete() {
		
		// [1] SQL 작성
		// [2] DB와 연동된 곳에 SQL 기재
		// [3] 기재된 SQL 실행 후 결과 반환 받기
		// [4] 반환값에 따른 처리 및 반환
	}
}
