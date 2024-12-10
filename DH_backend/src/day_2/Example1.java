/*

*/
package day_2;	// 현재 class가 위치한 패키지(폴더) 명

public class Example1 {	// 현재 class의 시작

	public static void main(String[] args) { // main함수의 시작
		final int MIN_NUM ;	// 상수 선언
		MIN_NUM = 0; // 초기화
		final int MAX_NUM = 100; // 상수 선언 -> final 키워드 사용 / 선언과 동시에 초기화
		
		System.out.println("MAX_NUM ; " + MAX_NUM);
		System.out.println("MIN_NUM ; " + MIN_NUM);
	 
		// MAX_NUM = 1; -> 오류 (MAX_NUM)은 상수로 값 변경 불가
	} // main함수의 끝
// main 함수 중괄호 밖에 코드 작성 시 실행 불가
} // 현재 class의 끝

// class 중괄호 밖에 코드 작성 시 번역 불가