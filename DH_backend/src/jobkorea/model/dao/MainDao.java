package jobkorea.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import jobkorea.controller.MainController;

public class MainDao {
	private Connection conn;
	private String dburl = "jdbc:mysql://localhost:3306/jobkorea";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	// 싱글톤 s
	// 생성자
	private MainDao () {
		// 예외처리
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
	// 객체생성
	private static MainDao instance = new MainDao();
	// 메소드
	public static MainDao getInstance() {
		return instance;
	}
	// 싱글톤 e
	
    // [1] 회원 회원가입 메소드
    public void mSignUp() {
       
    }
    // [2] 회원 로그인 메소드
    public void mLogin() {
       
    }
    // [3] 회원 로그아웃 메소드
    public void mLogout() {
    	
    }
    
    
    
    // [1] 기업 회원가입 메소드
    public void eSignUp() {
       
    }
    // [2] 기업 로그인 메소드
    public void eLogin() {
       
    }
    // [3] 기업 로그아웃 메소드
    public void eLogout() {
       
    }
    
    
    // [1] 우수기업 R
    public ArrayList<HashMap<String, String>>  bestList() {
    	ArrayList<HashMap<String, String>> bList = new ArrayList<>();
    	try {
    		String sql = "select e.ename , avg(r.rrating) as ravg from review r left join enterprise e "
    					+ "on  r.eno = e.eno group by r.eno order by ravg desc";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ResultSet rs = ps.executeQuery();
    		
    		while(rs.next()) {
    			String list = rs.getString("ename");
    			String rating = rs.getString("ravg");
    			
    			HashMap<String, String> map = new HashMap<String, String>();
    			
    			map.put("기업명", list);
    			map.put("별점", rating);
    			
    			bList.add(map);
    		}
    	}catch (Exception e) {
    		System.out.println(e);
		}
    	
    	return bList;
    }
    // [2] 후기 R
    public ArrayList<HashMap<String, String>>  reviewList(String ename) {
    	ArrayList<HashMap<String, String>> rList = new ArrayList<>();
		try {
			String sql = "select e.ename,  r.rcontent, r.rrating from review r join enterprise e "
						+ "on r.eno = e.eno  where e.ename = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ename);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("ename");
				String rcontent = rs.getString("rcontent");
				String rrating = rs.getString("rrating");
				HashMap<String, String> map = new HashMap<String, String>();
				
				map.put("기업명", name);
				map.put("후기", rcontent);
				map.put("별점", rrating);
				
				rList.add(map);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		
		return rList;
	}
}