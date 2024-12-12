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
		for(int i = 1
				; i <= 9; i++) {
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
		
		
		
		
		
		
		
		
		
	}

}
