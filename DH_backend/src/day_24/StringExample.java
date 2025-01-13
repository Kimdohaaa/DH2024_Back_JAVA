package day_24;

public class StringExample {

	public static void main(String[] args) {

		int a = 3;
		int b = 3;
		System.out.println(a == b); // true : 자료가 1 개 이기 때문
		// -> 변수 : 2개 / 자료 : 1개
		
		int c = 5;
		int d = c;
		System.out.println(c == d); // true : 자료가 1 개 이기 때문
		// -> 변수 : 2개 / 자료 : 1개
		// 리터럴은 상수풀에 저장됨

		Integer value1 = 3; // 순수한 자료의 리터럴
		Integer value2 = new Integer(3); // 순수한 자료의 리터럴이 저장된 타입(wrapper) 
										 // 코드에 취소선 : 권장하지 않는다.
		System.out.println(value1 == value2); 		// false : 리터럴(3) / 인스턴스(3) -> 스택메모리 비교
		System.out.println(value1.equals(value2));	// true : equals() 메소드는 인스턴스 안에 값을 비교하기 때문 -> 힙메모리 비교
		// 변수 : 2개 / 자료 : 2개
		
		// [1] 문자열을 표현하는 방법
		// 1) 배열을 이용한 방법
		char[] str1 = new char[] {'유', '재', '석'}; 
		// 2) "" 리털럴을 이용한 방법
		String str2 = "유재석";				// 상수 풀의 "유재석"
		// 3) 생성자를 이용한 방법
		String str3 = new String("유재석");	// 인스턴스의 "유재석"
		String str4 = "유재석";				// 상수 풀의 "유재석
		
		System.out.println(str2 == str3);		// false : 스택메모리 비교
		System.out.println(str2.equals(str3));	// true : 힙메모리 비교
		System.out.println(str2 == str4);		// true : 스택메모리 비교
		
		// [2] String 클래스의 주요메소드
		// 1) concat 메소드
		String str5 = "자바".concat("프로그래밍");
		System.out.println(str5);
		
		// 2) StringVuilder 클래스 	append 메소드
		StringBuilder builder = new StringBuilder();
		builder.append("자바");
		builder.append("프로그래밍");
		System.out.println(builder);
		
		// 3) format 메소드
		String.format("%s %s", "자바", "프로그래밍");
		
		// 4) += 연산자
		String str7 = "";
		str7 += "자바";
		str7 += "프로그래밍";
		System.out.println(str7);
		
		// 문자열1개 + 문자열1개 = 문자열 1개 (연산자 / 함수는 무조건 하나의 결과만 도출한다.)
	}

}
























