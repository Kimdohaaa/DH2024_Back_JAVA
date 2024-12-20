package day_08;

public class Student {
	// 멤버 변수 선언
	int studentID ;
	String studentName;
	int grade;
	String address;
	
	// 메서드
	// 1) 현재 객체의 학생명을 호출했던 곳으로 반환하는함수
	public String getStudentname() { // 매개변수 X
		return studentName;
	}
	
	// 2) 매개변수로 받은 새로운 학생명을 객체의 학생명에 저장 / 대입하는 함수
	public void setStudentname(String name) { // 반환값 x -> void 를 사용했기 때문
		studentName = name;
	}
	
	public static void main(String[] args) { // main 함수 : 프로그램을 시작하기 위해 호출하는 함수(클래스의 메소드 X)
		
		Student studentAhn = new Student(); // 1) 인스턴스(객체) 생성
		studentAhn.studentName = "안연수";    // 2) 객체 내 멤버변수에 값을 대입
		System.out.println(studentAhn.studentName);		 // 3) 객체 내 멤버 변수의 값 호출
		System.out.println(studentAhn.getStudentname()); // 4) 객체 내 메소드 호출
	
	}

}
