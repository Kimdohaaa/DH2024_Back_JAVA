package day_18.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// import java.util.concurrent.CountDownLatch;
/*
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
*/
public class Dao {
	
	// 멤버변수
	private String DBURL = "jdbc:mysql://localhost:3306/mydb000";
	private String DBID = "root";
	private String DBPW = "1234";
	
	// JDBC 인터페이스
	private Connection conn;

	// 싱글톤 s
		
	// [1] 생성자
	private Dao() {	
		// *** JBDC 연동 *** // -> 생성자에서 JBDC 연동을 했기 때문에 싱글톤 생성 시 DB 연동
		
		// 예외처리 //
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DB 서버와 연결 시도 -> 성공 시 JDBC 인터페이스
			conn = DriverManager.getConnection(DBURL, DBID, DBPW);
		
			System.out.println(">> DB 연동 성공");
			
		}catch (ClassNotFoundException e) {
			System.out.println(">> DB Driver 탐색 실패" + e);		
		}catch (SQLException e) {
			System.out.println(">> DB 연동 실패" + e);		
		}	
	}
	
	// [2] 인스턴스 생성
	private static Dao instance = new Dao() ;
	
	// [3] 메소드
	public static Dao getInstance() {
		return instance;
	}
	
	// 싱글톤 e

	
	// [1] insert
	public void insert() {
		
		// 예외 처리 //
		try {
			// 1) SQL 작성
			String sql = "insert into user(uname,uage) values ('유재석', '30')";

			// 2) SQL 기재 -> conn 인터페이스를 통해 연동된 DB 에 SQL 기재하고 기재된 SQL 을 객체에 반환
			// ※ 참고 : prepare (준비) / Statement (기재 / 서명) / excute (실행)
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 3) 기재된 SQL 실행 -> 현재 기재된 SQL 실행
			// .executeUpdate() 메소드 : 현재 기재된 SQL 을 실행하고 처리한 레코드를 반환하는 함수(int 반환)
			// ps.executeUpdate();
		
			// 4) SQL 실행 결과 반환 받기
			int count = ps.executeUpdate();
			
			// 5) 반환 결과 조작
			if(count == 1) { // 저장을 했다면 
				System.out.println(">> insert 성공");
				return; // 함수 종료
			}
			
		}catch (SQLException e) {	System.out.println(e);	}
		
		System.out.println(">> insert 실패");
		
	}
	
	
	// [2] select
	public void select() {
		
		try {
			// 1) SQL 작성
			String sql = "select * from user";
			
			// 2) SQL 기제
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 3) 기재된 SQL 실행
				// .executeQuery() 메소드 : 현재 기재된 SQL 을 실행하고 조회결과를 조작 가능한 인스턴스 반환(Resultset 반환)
			// ps.executeQuery();
			
			// 4) SQL 실행 결과 반환 받기
			ResultSet rs = ps.executeQuery();
			
			// 5) 반환 결과 조작
				// .next 메소드 : 조회 결과에서 다음 레코드로 이동하는 메소드로 다음 레코드 존재시 true / 존재하지 않을 시 false 반환
			while(rs.next()) { // 첫번째 레코드 ~ 마지막 레코드 까지 다음 레코드로 하나씩 이동
					// rs.get 타입 ("속성명"); : 현재 레코드의 속성 값 반환 메소드 ★ 타입이 일치 해야함
				System.out.printf("%d \t %s \t %s \n", rs.getInt("uno"), rs.getString("uname"), rs.getInt("uage"));
			}
		
		}catch (SQLException e) {	System.out.println(e);	}
		
	}
	
	// [3] update
	public void update() {

		try {
			// 1) SQL 작성
			String spl = "update user set uname = '강호동' where uno = 2";
			
			// 2) SQL 기재 
			PreparedStatement ps = conn.prepareStatement(spl);
			
			// 3) 기재된 SQL 실행하고 반환 받기
			int count = ps.executeUpdate();
			
			// 4) 반환 결과 제어
			if( count == 1) {
				System.out.println(">> update 성공");
				return;
			}
			
		}catch (SQLException e) {	System.out.println(e);	}
		System.out.println(">> update 실패");	
	}
	
	// [4] delete
	public  void delete() {
		try {
			String spl = "delete from user where uno = 1";
			PreparedStatement ps = conn.prepareStatement(spl);
		
			int count = ps.executeUpdate();
			
			if(count == 1) {	// 1 개를 삭제 했다면	
				System.out.println(">> delete 성공");
				return;
			}
		}catch (SQLException e) {	System.out.println(e);	}
		System.out.println(">> delete 실패");	
	}
	
	// insert , update , delete => .executeUpdate()
	// select => .executeQuery()
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
