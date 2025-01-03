package day_18.step2_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example1 {
	public static void main(String[] args) {
		// DB 연동하기
		
		
		// 인터페이스 타입
		Connection connection;
		
		try {
	
			// 1. mysql JDBC 클래스 존재하는지 로드/불러오기 : Class.forName() 메소드 사용
			Class.forName("com.mysql.cj.jdbc.Driver"); // Libraries -> com.mysql -> jdbc -> Driver 클래스 찾기
													   // 참고_오라클 사용 시 : oracle.jdbc.driver.OracleDriver
		
			// 2. DB Server 와 연동 시도
			connection =	// 연동된 결과를 connection 에 저장하여 구현체를 반환 -> 연동된 결과를 인터페이스에서 조작 가능
				// DriverManager : DB 서버와 연동하는 클래스
				// .getConnection("jdbc:mysql://DB 서버 ip/DB명", "DB 서버 계정명", "DB 서버 비밀번호") : 연동 메소드
					// MySQL -> MySQL Connections -> 사람모양 : 계정명 / 사람모양밑에 : DB 서버 ip / 비밀번호는 설정해놓은 거
			DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb0103", "root","1234");
		
			System.out.println(">> DB 연동 성공");
		
		}catch (ClassNotFoundException e) {
			System.out.println(">> 프로젝트 내 jdbc 드라이버가 존재하지 않습니다." + e);
		}catch (SQLException e) {
			System.out.println(">> DB 연동 실패" + e);
		}
	}
}
