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
		
		// 4. 증감 연산자 -> ++ / --
		// 세미콜론 기준으로 우선수위 지정
		int num2 = 10;
		int value2;
		
		value2 = ++num2;	// num2 값이 1 증가한 후에 value2 변수에 대입됨
		System.out.println(value2);	// num2 =11 -> value2 =11
		value2 = num2++; // value2 변수에 기존 num2 값이 먼저 대입된 후에 1 증가함
		System.out.println(value2); // value2 = 11 -> num2 = 12
		
		value2 = --num2;	// num2 값이 1 감소한 후에 value2 변수에 대입됨
		System.out.println(value2); // num2 = 11 -> value2 = 11 
		value2 = num2--; // value2 변수에 기존 num2 값이 먼저 대입된 후에 1 감소함
		System.out.println(value2); // value2 = 11 -> num2 = 10
		
		int gameScore = 150;
		int lastScore1 = ++gameScore; // gameScore = 151 -> lastScore1 =151
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore; // gameScore = 150 -> lastScore2 = 150 
		System.out.println(lastScore2);
		
		int result1 = 3 + 3 * 2; // 사칙연산 우선 순위에 따라 곱하기 -> 더하기 순으로 연산 실행
		System.out.println(result1);
		
		// 5. 비교 연산자
		int myAge = 27;
		boolean value = (myAge > 25); // 가독성을 위해 비교연산을 소괄호 안에 작성
		System.out.println(value);
		
		// 6. 논리 연산자
		int num1 =10;
		int i = 2;
		
		boolean value3 = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10);
			// 논리곱이기 때문에 하나라도 false면 결과는 false -> 앞 조건이 false일 경우 뒤에 코드까지 실행되지 않고 false 출력
		System.out.println(value3);
		System.out.println(num1);
		System.out.println(i);
		
		value3 = ((num1 = num1+10) > 10 ) || ((i = i+2) < 10);
			// 논리합이기 때문에 하나라도 true면 결과는 true -> 앞 조건이 true일 경우 뒤에 코드까지 실행되지 않고 true 출력
		System.out.println(value3);
		System.out.println(num1);
		System.out.println(i);
		
		// 7. 복합 대입 연산자
		// 예제 p. 81
		/*
		num1 = num1 + 5; ---> num1 += 5;
		num1 = num1 * num2; ---> num1 *= num2;
		*/
		
		// 8. 조건 연산자
		int num3 = 5 > 3 ? 10 : 20;
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				

	}

}
