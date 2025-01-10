package studentservice.controller;

import java.util.ArrayList;
import java.util.HashMap;

import studentservice.model.dao.StudentDao;
import studentservice.model.dto.ScoreDto;
import studentservice.model.dto.StudentDto;

public class StudentController {
	private StudentController() {}
	private static StudentController instance = new StudentController();
	public  static StudentController getInstance() {
		return instance;
	}
	
	
	// [1] 등록
	public boolean create(StudentDto studentDto , ScoreDto scoreDto) {
		boolean result = StudentDao.getInstance().create(scoreDto ,studentDto);
		
		
		return result;
	}
	
	// 학생등록
	public boolean cCreate(StudentDto studentDto) {
		boolean result = StudentDao.getInstance().cCreat(studentDto);
		
		return true;
	}
	// [2] 전체학생점수 조회
	public ArrayList<HashMap<String, String>> read() {
		ArrayList<HashMap<String, String>> sDto = StudentDao.getInstance().read();
		
		return sDto;
	}
	// [3] 점수수정
	public boolean update(String sname , ScoreDto scoreDto) {
		boolean result = StudentDao.getInstance().update(sname , scoreDto);
	
		return result;
	}
	// [4] 점수삭제
	public boolean delete(String sname) {
		boolean result = StudentDao.getInstance().delete(sname);
		return result;
	}
	
}
