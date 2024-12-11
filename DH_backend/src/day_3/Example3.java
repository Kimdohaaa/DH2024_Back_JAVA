package day_3;

public class Example3 {

	public static void main(String[] args) {
		// 조건문
		// 1. if 문
		int age = 10;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} //if e
		
		// 2. if-else 문
		if(age >= 8) {
			System.err.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		} // if e
		
		// 예제 p . 95
		char gender = 'F';
		if(gender == 'F') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		} // if e
			
		// 3. if - else if 문
		int charge;
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}else if(age < 20) {
			charge = 2500;
			System.out.println("청소년입니다.");
		}else if(age >= 60) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}else {
			charge = 3000;
			System.out.println("성인입니다.");
		}// if e
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		// 예제 p .100
		int Score = 65;
		char grade ;
		
		if(Score >= 60 && Score <= 69) {
			grade = 'D';
		}else if(Score <= 79) {
			grade = 'C';
		}else if(Score <= 89) {
			grade = 'B';
		}else if( Score <= 100) {
			grade = 'A';
		}else {
			grade = 'F';
		} // if e
		
		System.out.println("점수는 " + Score + "점 학점은 " + grade + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
