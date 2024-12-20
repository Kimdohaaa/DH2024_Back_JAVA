package day_10;

public class Student {
	int studentID;
	String studentName;
	//int koreaScore;
	//int mathScore;
	//String koreaSubject;
	//String mathSubject;	
	// 6~9 행 처럼 과목명을 추가할 경우 과목이 늘어날수록 학생 객체에 과목 변수가 많아짐 
	Subject korea;
	Subject math;
	// 11~12 행 처럼 과목 클래스르 따로 만들어 Student 객체 안에 멤버변수로 넣어주면 각 클래스 목적에 맞게 멤버변수 사용 가능
}
