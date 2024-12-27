package day_14.Student.controller;

import java.util.ArrayList;

import day_14.Student.model.dto.StudentDto;
import day_14.Student.model.dao.StudentDao;
import day_14.Student.view.StudentView;

public class StudentController {

	// 싱글톤 s
	private StudentController() {}
	private static StudentController instance = new StudentController();
	
	public static StudentController getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// 1. 학생 등록 제어 메소드
	public Boolean creatStudent(StudentDto studentDto) {
		boolean result = StudentDao.getInstance().creatStudent(studentDto);
		
		return result;
	}
	
	// 2. 학생 출력 메소드
	public ArrayList<StudentDto> readStudnet() {
		
		ArrayList<StudentDto> result = StudentDao.getInstance().readStudnet();
		
		return result;
	}
	
	// 3. 학생 수정 메소드
	public Boolean updateStudnet(StudentDto studentDto , int updateCode) {
		boolean result = StudentDao.getInstance().updateStudnet(studentDto , updateCode);
		
		return result;
	}
	
	// 4. 학생 삭제 메소드
	public Boolean deleteStudent(int deleteCode) {
		boolean result = StudentDao.getInstance().deleteStudent(deleteCode);
		
		return result;
	}
	
}
