package day_18.step1_예외처리;

import java.io.IOException;

public class Example1 {
	public static void main(String[] args) {
		// 일반 예외 : 컴파일러가 프로그램 시작 전 검사(에디터에서 예외처리 오류창을 띄워줌)
		
		// 1-1. 일반 예외
		try { // try : 만약 예외가 발생하거나 발생할 것 같은 명령어 작성
				// Class.forName("패키지경로.클래스명"); -> 지정한 클래스 로드
			Class.forName("java.lang.String"); // String 클래스가 존재하므로 예외 발생 X
			Class.forName("java.lang.String2"); // String2 클래스가 존재하지 않으므로 예외 발생 O -> ClassNotFoundException 예외발생
		}catch (ClassNotFoundException e) { // catch : try 에서 예외가 발생하거나 할 것 같은 예외 클래스명 변수명
			System.err.println(e);	// try 에서 지정한 예외 클래스 발생 시 실행
		} 
		
		// 1-2. 일반 예외
		try {
				// System.in read() : 시스템으로부터 읽기 함수
			System.in.read();	// IOException 예외 발생
		}catch (IOException e) { 
			System.out.println(e);
		}
	}
}
