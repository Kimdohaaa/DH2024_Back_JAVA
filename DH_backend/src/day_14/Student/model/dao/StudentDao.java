package day_14.Student.model.dao;

import java.util.ArrayList;

import day_14.Student.controller.StudentController;
import day_14.Student.model.dto.StudentDto;

public class StudentDao {

	// 싱글톤 s
	private StudentDao() {}
	
	private static StudentDao instance = new StudentDao();
	
	public static StudentDao getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	// ArrayList
	ArrayList<StudentDto> studentList = new ArrayList<StudentDto>();
	
	// 1. 학생 등록 처리 메소드
	public Boolean creatStudent(StudentDto studentDto) {
		studentList.add(studentDto);
		
		return true;
	}
	
	// 2. 학생 출력 처리 메소드
	public ArrayList<StudentDto> readStudnet() {
		return studentList;
	}
	
	// 3. 학생 수정 처리 메소드
	public Boolean updateStudnet(StudentDto studentDto, int updateCode) {
		
		for(int i = 0; i < studentList.size(); i++) {
			
			if(studentList.get(i).getCode() == updateCode) {
				studentList.set(i, studentDto);
				return true;
			}
		}
		return false;
	}
	
	// 4. 학생 삭제 처리 메소드
	public Boolean deleteStudent(int deleteCode) {
		
		for(int i = 0; i < studentList.size(); i++) {
		
			if(studentList.get(i).getCode() == deleteCode) {
				studentList.remove(i);
			
				return true;
			}
		}
		return false;
	}
	
}
