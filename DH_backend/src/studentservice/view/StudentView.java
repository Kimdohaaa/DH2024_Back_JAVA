package studentservice.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import studentservice.controller.StudentController;
import studentservice.model.dto.ScoreDto;
import studentservice.model.dto.StudentDto;

public class StudentView {
	private StudentView() {}
	private static StudentView instance = new StudentView();
	public static  StudentView getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	
	// 메인
	public void run() {
		
		while(true) {
			System.out.println(">> 1. 점수등록  2. 전체학생점수조회 3. 점수수정  4. 점수삭제 5. 학생등록 ");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				create();
			}else if(choose == 2) {
				read();
			}else if(choose == 3) {
				update();
			}else if(choose == 4) {
				delete();
			}else if (choose == 5) {
				cCreat();
			}
		
		}	
		
	}
	
	// [1] 등록
	public void create() {

		System.out.print(">> 학생명 : ");
		String sName = scan.next();
		System.out.print(">> 국어 점수 : ");
		int kSco = scan.nextInt();
		System.out.print(">> 영어 점수 : ");
		int eSco = scan.nextInt();
		System.out.print(">> 수학 점수 : ");
		int mSco = scan.nextInt();
	
		StudentDto studentDto = new StudentDto(sName);
		
		ScoreDto scoreDto = new ScoreDto(kSco, eSco, mSco);
		
		boolean result = StudentController.getInstance().create(studentDto, scoreDto);
		
		if(result == true) {
			System.out.println(">> 등록 성공");
		}else {
			System.out.println(">> 등록실패");
		}
	
	}
	// 학생등록
	public void cCreat() {
		System.out.print(">> 학생명 : ");
		String sName = scan.next();
		StudentDto studentDto = new StudentDto(sName);
		
		boolean result = StudentController.getInstance().cCreate(studentDto);
		
		if(result == true) {
			System.out.println(">> 등록 성공");
		}else {
			System.out.println(">> 등록 실패");
		}
	
	}
	// [2] 전체학생점수 조회
	public void read() {
		ArrayList<HashMap<String, String>> result = StudentController.getInstance().read();
	
		for(int i = 0; i < result.size(); i++) {
			HashMap<String, String> sDto = result.get(i);
			System.out.println(sDto);
		}
	}
	// [3] 점수수정
	public void update() {
		System.out.print(">> 수정할 학생명 : ");
		String sname = scan.next();
		System.out.print(">> 수정할 국어점수 : ");
		int ksco = scan.nextInt();
		System.out.print(">> 수정할 영어점수 : ");
		int esco = scan.nextInt();
		System.out.print(">> 수정할 수학점수 : ");
		int msco = scan.nextInt();
		
		ScoreDto scoreDto = new ScoreDto(ksco, esco, msco);
		
		boolean result = StudentController.getInstance().update(sname, scoreDto);
		
		if(result == true) {
			System.out.println(">> 수정 성공");
		}else {
			System.out.println(">> 수정 실패");
		}
	}
	// [4] 점수삭제
	public void delete() {
		System.out.print(">> 삭제할 학생명 : ");
		String sname = scan.next();
		
		boolean result = StudentController.getInstance().delete(sname);
		
		if(result == true) {
			System.out.println(">> 삭제 성공");
		}else {
			System.out.println(">> 삭제 실패");
		}
	}
	
	

}
