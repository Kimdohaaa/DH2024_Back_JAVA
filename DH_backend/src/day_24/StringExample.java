package day_24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
		
		// 2) StringVuilder 클래스 / append 메소드
		StringBuilder builder = new StringBuilder();
		builder.append("자바");
		builder.append("프로그래밍");
		System.out.println(builder);
		
		// 3) format 메소드 : 형식 문자에 값이 대입된 문자열을 반환하는 함수
		String.format("%s %s", "자바", "프로그래밍");
		
		// 4) += 연산자
		String str7 = "";
		str7 += "자바";
		str7 += "프로그래밍";
		System.out.println(str7);
		
		// 5) charAt 메소드 : 문자열 내 인덱스번째 문자를 반환하는 함수
		char gender = "012345-1230123".charAt(7);
		System.out.println(gender);
			// 활용 : Scanner 클래스를 통해 입력받은 값을 char 타입으로 변환할 경우
			Scanner scan = new Scanner(System.in);
			char ch = scan.next().charAt(0);
			
		// 6) length 메소드 : 문자열의 길이를 반환하는 함수
		System.out.println("012345-1230123".length());
		
		// 7) replace 메소드 : 문자열을 치환하는 함수
		String str8 = "자바프로그래밍".replace("자바", "java");
		System.out.println(str8);
			// 활용 : 서로 다른 언어들끼의 문법을 치환할 경우
			String htmlData = "유재석<br/>안녕하세요";
			System.out.println(htmlData); // 줄바꿈 처리 불가
			String javaData = htmlData.replace("<br/>", "\n"); // 치환
		// 문자열1개 + 문자열1개 = 문자열 1개 (연산자 / 함수는 무조건 하나의 결과만 도출한다.)
		
		// 8) subString 메소드 : 지정한 시작인덱스부터 끝인덱스 전까지의 문자열을 반환하는 함수
		String str9 = "012345-1230123".substring(0,6); // 0번 인덱스 ~ 6번 인덱스 전까지 반환
		System.out.println(str9);
		String str10 = "012345-1230123".substring(7);  // 7번 인덱스 ~ 마지막인덱스까지 반환
		
		// 9) split 메소드 : 지정한 구분문자를 기준으로 문자열을 구분하여 배열로 반환 
		String[] str11 = "012345-1230123".split("-");  // "-"을 기준으로 문자열을 구분하여 배열로 반환 
		System.out.println(str11[0]);	// "012345" 출력
		System.out.println(str11[1]);	// "1230123" 출력
			// 활용 : CSV 형식의 파일을 사용하는 경우
		
		// 10) indexOf("찾을 문자열") 메소드 : 문자열 내 지정한 문자열이 존재하면 해당 문자열의 인덱스 , 존재하지 않으면 -1 을 반환하는 함수
		int findIndex = "자바 프로그래밍 언어".indexOf("자바"); // 0 츌력
			// 활용 : 문자열을 검색하는 경우
		
		// 11) contains("찾을 문자열") 메소드 : 문자열 내 지정한 문자열이 존재하면 true , 존재하지 않으면 false 를 반환하는 함수
		boolean findBool = "자바 프로그램이 언어".contains("자바"); // true 출력
			// 활용 : 문자열을 검색하는 경우
		
		// 12) getBytes 메소드 : 문자열들을 문자 바이트의 배열로 변환하는 함수
		byte[] str12 = "JAVA PROGRAM".getBytes();
		System.out.println(str12);
		System.out.println(Arrays.toString(str12)); // 74,65,86,65,32,80,82,79,71,82,65,77 출력 -> 아스키 코드
			// 영문,일부특수문자 : 문자 1개 당 1 바이트(아스키코드)
		System.out.println("ab".getBytes().length);  // 2 출력 : 영문 2글자 -> 2 바이트	
			// 한글 : 문자 1개 당 2 바이트 (유니코드)
		System.out.println("가나".getBytes().length); // 6 출력 : 한글은 1글자당 2바이트지만 자바의 경우 UTF-8의 규칙정보가 포함되어 총 6바이트
			// 활용 : 문자를 사용하는 인증코드를 만드는 경우
			String code = "";
			for(int index = 1; index <= 6 ; index++) {
				
				System.out.println(new Random());					// 난수 반환
				System.out.println(new Random().nextInt());			// 정수타입의 난수 반환
				System.out.println(new Random().nextInt(26));		// 0 ~ 25 사이의 난수 반환
				System.out.println(new Random().nextInt(26) + 97);  // 97 ~ 122 사이의 난수 반환
				System.out.println((char) new Random().nextInt(26) + 97); // 지정한 범위의 난수를 char 타입으로 변환
				// new Random 클래스 : 난수 관련 기능을 제공하는 클래스
				// new Random.nextInt() : 정수타입의 난수를 반환하는 함수
				
				code += (char)(new Random().nextInt(26) + 97);		
				
			}
			System.out.println(code);	// 6자리의 임의의 난수 문자열 생성
	}

}





















































