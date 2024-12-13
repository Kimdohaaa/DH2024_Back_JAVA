package day_4;

public class Example3 {

	public static void main(String[] args) {
		// for 문 
		// 초기화식 , 조건식 , 증감식 등을 필요 여부에 따라 생략 가능 -> 모두 생략 시 무한 루프
		int sum1 = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.printf("1 ~ 10까지의 합은 %d 입니다.", sum1);
		
		// for 문 예제 p . 114
		
		for(int i = 1 ; i <= 10; i++) {
			System.out.printf(" \n 안녕하세요%d", i);
		}
		
		// 구구단
 		// 2단
		for(int i = 1; i <= 9; i++) {
			System.out.printf("2 * %d = %d \n", i, (2*i));
		}
		// 3단
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("3 * %d = % d \n", i , (3*i));
		}
		// 4단
		for(int i = 1 ; i <= 9; i++) {
			System.out.printf("4 * %d = %d \n", i , (4*i));
		}
		// 5단
		for(int i = 1; i <= 9; i++) {
			System.out.printf("5 * %d = %d \n", i , (5*i));
		}
		// 6단
		for(int i = 1; i  <= 9 ; i++) {
			System.out.printf("6 * %d = %d \n", i , (6*i));
		}
		// 7단
		for(int i = 1; i <= 9; i++) {
			System.out.printf("7 * %d = %d \n", i , (7*i));
		}
		// 8단
		for(int i = 1; i <= 9; i++) {
			System.out.printf("8 * %d = %d \n" , i , (8*i));
		}
		// 9단
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("9 * %d = %d \n", i , (9*i));
		}
		
		// 구구단 이중 for 문
		for(int i = 2 ; i <= 9  ; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("1. %d * %d = %d \n", i , j ,(i*j));
			}
		}
		
		// 예제 p . 118
		for(int i = 3; i <=7 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.printf("2. %d * %d = %d \n", i , j ,(i*j));
			}
		}
		
		// continue 문
		int total1 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {	// 짝수 조건문
				continue;		// 짝수 일 경우 74줄로 흐르지 않고 for 문으로 돌아가 증감식 실행
			}
			total1 += i;     // 홀수인 경우 조건문을 통과제 74줄 실행			
		}
		System.out.println("1 ~ 100까지 홀수의 합은 : " + total1);
		
		// 예제 p . 120
		int total2 = 0;
		for(int i = 1 ; i <= 100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			total2 += i;
		}
		System.out.println("1 ~ 100까지 3의 배수의 합은 " + total2 );
		
		// break 문
		// 반복문이 중첩되었을 때 break 를 사용하면 가장 가까운 반복문만 종료 (모든 반복문을 종료 X)
		int total3 = 0;
		for(int i = 1 ;  ; i++) { // break를 사용하기 때문에 조건식 생략
			total3 += i; 
			if(total3 >= 100) {
				break; 		// total3의 값이 100이 넘으면 반복문 종료
			}
		}
		
		
		// 예제 p . 123
		// 1번
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		// 1) if 문 사용
		if(operator == '+') {
			num1 += num2;
		}else if(operator == '-') {
			num1 -= num2;
		}else if(operator == '*') {
			num1 *= num2;
		}else if (operator == '/') {
			num1 /= num2;			
		}
		
		// 2) switch 문 사용
		switch(operator) {
			case '+' : num1 += num2; break;
			case '-' : num1 -= num2; break;
			case '*' : num1 *= num2; break;
			case '/' : num1 /= num2; break;
		}
		
		// 2번
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9 ; j++) {
		
				if(i % 2 != 0) {
					continue;
				}
				System.out.printf("%d * %d = %d \n" , i , j, (i*j));				
			}
		}
		
		// 3번
		for(int i = 2; i <= 9 ; i++ ) {
			for(int j = 1; j <= 9 ; j++ ) {
				if(i < j) {
					break;
				}
				System.out.printf("%d * %d = %d \n" , i , j, (i*j));
			}
		}
		
		// 4번
		for(int i = 1; i <= 5; i++) {
			System.out.print("★");
		}	// 1행 별 찍기
		for(int i = 1; i <= 5; i++) {
			System.out.println("★");
		}	// 1열 별 찍기
		
		System.out.println("---------");

		for(int i  = 1; i <= 5; i++) {		// 행
			for(int j = 1; j <= 5 ; j++) {  // 열
				System.out.print("★");
			}
		}
		for(int i = 1; i <= 5; i++) {
			for(int j  = 1; j < i ; j++) {
				System.out.print("★");
			}
		System.out.println();	
		}
		/*
		i 는 5까지 1씩 증가 -> i 가 1씩 증가할 때 실질적으로 별을 찍는 j 는 i 의 최대치만큼 같이 증가 
		*
		**
		***
		****
		***** 출력
		*/
		
		for(int i  =1; i <= 5; i++) {
			for(int j = 1; j <= 5 -1 ; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("★");
			}
			System.out.println();
		}
	
	}

}
























