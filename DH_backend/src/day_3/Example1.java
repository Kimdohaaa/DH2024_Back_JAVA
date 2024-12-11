package day_3;

public class Example1 {

	public static void main(String[] args) {
		// 연산자
		
		// 1. 대입 연산자
		int age = 24; 
		
		int mathScore = 10;
		int engScore = 20;
		int totalScore = mathScore + engScore;
		
		// 2. 부호 연산자 -> + : 양수 / - : 음수
		int num =10;
		System.out.println(+num); // console 창에 양수 +10 출력
		System.out.println(-num); // console 창에 음수 -10 출력
		// 주의점 : 양수였던 num에 출력 시에만 음수 부호를 붙인 것이기 때문에 num이 음수가 된 것은 아님

		num = -num;	// 양수였던 num의 값을 음수로 수정한 것이기 때문에 num이 음수가 됨
		
		// 3. 산술 연산자 -> + / - / * / / / %
		System.out.println( 5 / 3 );	// 1.XXXXXXXXX -> 1 (몫 출력) => 정수로 출력되는 이유 : int / int 연산이기 때문
		System.out.println( 5.0 / 3.0 ); // 1.6666666666667 (나누기 결과 출력) => 실수로 출력되는 이유 : double / double 연산이기 때문
		// int는 정수의 기본값 , double은 실수의 기본값 이기 때문에 굳이 자료형을 선언하지 않아도 자동으로 기본값으로 지정됨
		System.out.println((int) 5.0 / 3.0); // 1.6666666666667 -강제타입변환-> 1 (나누기 결과를 정수로 출력)
		
		int mathS = 90;
		int engS =70;
		int korS = 90;
		int totalS = mathS + engS + korS;
		
		System.out.println(totalS); // 총점 출력
		
		double avg = totalS / 3.0;
		System.out.println(avg); // 평균 출력
	
		
	}

}
