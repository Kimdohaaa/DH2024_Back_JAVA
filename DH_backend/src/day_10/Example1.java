package day_10;

public class Example1 {

	public static void main(String[] args) {
		// 참조 자료형
		Student s1 = new Student();
		s1.studentID = 1;
		s1.studentName = "유재석";
		//s1.koreaScore = 89;
		//s1.mathScore = 73;
		//s1.koreaSubject = "국어";
		//s1.mathSubject = "수학";

		Student s2 = new Student();
		s2.studentID = 2;
		s2.studentName = "강호동";
		//s2.koreaScore = 55;
		//s2.mathScore = 90;
		//s2.koreaSubject = "국어";
		//s2.mathSubject = "수학";
		
		
		Student s3 = new Student();
		s3.studentID = 3;
		s3.studentName = "유재석";
		// Student 클래스에 멤버변수로 선언된 Subject 클래스의 멤버변수에 접근 | 참조 -> 참조
			Subject sub1 = new Subject();
			sub1.subjectName = "국어";
			sub1.scorePoint = 89;
		s3.korea = sub1;
		// Student 클래스에 멤버변수로 선언된 Subject 클래스의 멤버변수에 접근 | 참조 -> 참조
			Subject sub2 = new Subject();
			sub1.subjectName = "수학";
			sub1.scorePoint = 78;
		s3.math = sub2;
		
		
		System.out.println(s3);
		
	}

}
