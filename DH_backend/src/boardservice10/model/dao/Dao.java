package boardservice10.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	// BoardDao 와 MemberDao 에 JDBC 코드가 공통으로 들어가기 때문에 Dao 에 JDBC 를 작성한 후 두 DAO 에게 상속
	
	protected Connection conn; // DB 연동 결과를 조작하는 인터페이스
	private String dburl = "jdbc:mysql://localhost:3306/boardservice10";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	// 싱글톤 s
	// [1] 생성자
	public Dao() {
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
}
