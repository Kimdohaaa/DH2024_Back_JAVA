package day_4;

public class Example2 {

	public static void main(String[] args) {
		// while 문
		/*
		형식
		while(조건식){
		 	실행문; // 조건이 거짓 일 때 실행
		};
		실행문; 	// 조건이 참 일때 실행
		
		
		사용할 변수에 초기값을 지정해주지 않을 경우 해당 변수를 이용한 연산 불가
		-> 변수에 초기값을 지정해주지 않을 경우 변수에는 쓰레기값 / 임의값이 지정된다. => 임의값은 연산불가함
		
		*/
		int num1 = 1;
		int sum1 = 0;
		
		while (num1 <= 10) {
			sum1 += num1;
			num1++;
		}
		
		// for 문
		int sum2 = 0;
		
		for(int num2 = 1; num2 <= 10 ; num2++) {
			sum2 += num2;
		}
		
		// while 문 무한루프  -> 조건식에 상수 true 지정
		/* while (true) {
			System.out.println("whil e문 무한 루프");
		} */
		
		// for 문 무한 루프
		/*
		for( ; ; ){
			System.out.println("for문 무한 루프");
		*/
		
		// do-while 문
		
		int num3 = 1;
		int sum3 = 0;
		
		do{ // 먼저 실행
			sum3 += num3;
			num3++;
		}while(num3 <= 10);	// 실행 후 검사
		System.out.println("1 ~ 10 까지의 합은 " + sum3 + "입니다.");
		
		
		// 예제 . 구구단 2단 출력
		// 1. while 문

		int oper1 = 1;
		
		while (oper1 <= 9) {
			System.out.println("2 * " + oper1 + " = " + (oper1 * 2));
			oper1++;
		}
		
		// 2. do - while 문
		int oper2 = 1;
		do {
			System.out.println("2 * " + oper2 + " = " + (oper2 * 2));
			oper2++;
		}while(oper2 <= 9);
			
		// 3. for 문
		for(int oper3 = 1; oper3 <= 9; oper3 ++) {
			System.out.println("2 * " + oper3 + " = " + (oper3 * 2));
		}
		
		
	}

}
