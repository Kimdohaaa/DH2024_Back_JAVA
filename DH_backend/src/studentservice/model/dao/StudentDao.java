package studentservice.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import studentservice.model.dto.ScoreDto;
import studentservice.model.dto.StudentDto;


public class StudentDao {
	private Connection conn;
	private String dburl = "jdbc:mysql://localhost:3306/stdb";
	private String dbuser = "root";
	private String dbpwd = "1234";
	
	// 싱글톤 s
	// 생성자
	private StudentDao () {
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
	private static StudentDao instance = new StudentDao();
	// 메소드
	public static StudentDao getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// [1] 등록
	public boolean create(ScoreDto scoreDto , StudentDto studentDto) {
		try {
			String sql = "insert into sco(ksco, esco, msco,stuno) select ?,?,?, stuno"
					+ "	from stu where sname = ?;";
	
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, scoreDto.getkSco());
			ps.setInt(2, scoreDto.geteSco());
			ps.setInt(3, scoreDto.getmSco());
			ps.setString(4, studentDto.getsName());
			
			int count = ps.executeUpdate();
			
			if(count == 1) {
				return true;
			}
		}catch (SQLException e) {
			System.out.println("2"+e);
		}
		
		return false;
	}
	// [5] 학생등록 
	public boolean cCreat(StudentDto studentDto) {
		try {
			String sql = "insert into stu (sname) values (?);";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, studentDto.getsName());
				
			int count = ps.executeUpdate();
				
			if(count == 1) {
				return true;
			}
		}catch (Exception e) {
			System.out.println("1" +e);
		}
			
		return false;
			
	}
	// [2] 전체학생점수 조회
	public ArrayList<HashMap< String, String>> read() {
		ArrayList<HashMap< String, String>> sDto = new ArrayList<HashMap<String,String>>();
		try {
			String sql = "select stu.sname,  sco.ksco , sco.esco, sco.msco "
					+ "from sco inner join stu on sco.stuno = stu.stuno";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String sname = rs.getString("sname");
				int ksco = rs.getInt("ksco");
				int esco = rs.getInt("esco");
				int msco = rs.getInt("msco");
				
				HashMap<String, String> map = new HashMap<String,String>();
				
				map.put("학생명", sname);
				map.put("국어점수", ksco + "");
				map.put("영어점수", esco + "");
				map.put("수학점수", msco + "");
				
				sDto.add(map);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return sDto;
	}
	// [3] 점수수정
	public boolean update(String sname , ScoreDto scoreDto) {
		try {
			String sql = "update sco inner join stu on sco.stuno = stu.stuno "
					+ "	set sco.ksco = ? , sco.esco = ?, sco.msco =? "
					+ " where stu.sname = ? ;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, scoreDto.getkSco());
			ps.setInt(2, scoreDto.geteSco());
			ps.setInt(3, scoreDto.getmSco());
			ps.setString(4, sname);
			
			int count = ps.executeUpdate();
			
			if(count == 1) {
				return true;
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
	// [4] 점수삭제
	public boolean delete(String sname) {
		try {
			String sql1 = "delete sco from sco join stu on sco.stuno = stu.stuno where stu.sname = ? ";
			String sql2 = "delete sco from sco left join stu on sco.stuno = stu.stuno where stu.stuno is null;";
			PreparedStatement ps1 = conn.prepareStatement(sql1);
			ps1.setString(1, sname);
			PreparedStatement ps2 = conn.prepareStatement(sql2);
			
			int count1 = ps1.executeUpdate();
			int count2 = ps2.executeUpdate();
			
			return true;
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	
	
}
