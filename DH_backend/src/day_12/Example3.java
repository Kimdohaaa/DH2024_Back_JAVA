package day_12;

class Student{
	// static 변수(=정적변수) : 프로그램 시작 시 한번만 생성
	public static int seriaNum = 1000;
	// 멤버변수 : 인스턴스 생성 시마다 각 변수 생성
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	// 생성자
	
	// 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
}

class Student2{
	// static 변수(=정적변수) : 프로그램 시작 시 한번만 생성
	public static int seriaNum = 1000;
	// 멤버변수 : 인스턴스 생성 시마다 각 변수 생성
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	// 생성자
	public Student2() {
		seriaNum++; // 학생이 생성될 때마다 static 변수 1 씩 증가
		studentID =  seriaNum; // 증가된 값을 studentID 에 대입
	};
	
	// 메소드
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}	
}

public class Example3 {

	public static void main(String[] args) {
		// 1)
		// 인스턴스 생성
		Student studentLee = new Student();
		Student studentSon = new Student();
		
		
		// static 변수
		studentLee.seriaNum++;
		
		System.out.println(studentLee.seriaNum); // 1001 출력
		System.out.println(studentSon.seriaNum); // 1001 출력
		// static 변수는 모든 인스턴스가 공유하기 때문에 studentLee 와 studentSon 의 seriaNum 값이 같이 증가

		// 멤버변수
		studentSon.setStudentName("손수경");
		studentLee.setStudentName("이수경");
		System.out.println(studentSon.studentName); // "손수경" 출력

		System.out.println(studentLee.studentName); // "이지원" 출력
		// 멤버변수는 인스턴스 생성 시 마다 각 변수를 생성하기 때문에 각각 다른 값 출력
		
		// 2)
		Student2 studentLee2 =  new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee2.studentID); // 1001 출력 
												   //	-> Student2 의 생성자에서 학생 인스턴스 생성시마다 seriaNum을 증가한 뒤 studentID 에 대입했기 때문
		
		Student2 studentSon2 = new Student2();
		studentSon2.setStudentName("손수경");
		System.out.println(studentSon2.studentID); // 1002 출력 
												   //	-> Student2 의 생성자에서 학생 인스턴스 생성시마다 seriaNum을 증가한 뒤 studentID 에 대입했기 때문
		
		// 3) 클래스변수 -> 클래스명.static변수명
		System.out.println(Student.seriaNum); 
		System.out.println(Student2.seriaNum);		
	}

}

// 클래스 : Student / Student2 / Example3
// 인스턴스 : studentLee / studentSon / studentLee2 / studentSon2
// 생성된 멤버변수 : 인스턴드 당 4개 -> 총 16개 ★ 정적변수는 포함 X
// 정적 변수 : 1개 -> 정적변수는 프로그램 시작 시 한번만 생성되므로 생성된 인스턴스 개수와 무관함