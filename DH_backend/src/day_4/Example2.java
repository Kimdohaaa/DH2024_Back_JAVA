package day_4;

public class Example2 {

	public static void main(String[] args) {
		// while 문
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
		
		// while문 무한루프  -> 조건식에 상수 true  wlwjd
		/* while (true) {
			System.out.println("while문 무한 루프");
		} */
		
		// for 문 무한 루츠
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
		
		
		// 구구단 2단 출력
		// 1. while 문
		int num4 = 0;
		int oper = 1;
		
		while (oper <= 9) {
			num4 = oper * 2;
			oper++;
			System.out.println("2 * " + oper + " = " + num4);
			
		}
		// 2. do - while 문
			
			
	
	}

}
