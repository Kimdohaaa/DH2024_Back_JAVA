package day_8;

import java.security.PublicKey;

public class Example2 {

	public static void main(String[] args) {
		// 함수
		
		int num1 = 10;
		int num2 = 20;
		
		// 2. 함수 호출
		// add 함수에 num1 , num2 값을 인수로 전달 -> add 함수가 전달한 인수를 매개변수로 받아 명령어 수행 -> 반환값 sum 에 대입
		int sum = add(num1, num2); 
		int oper1 = oper1(num1, num2);
		int oper2 = oper2(num1, num2);
		int oper3 = oper3(num1, num2);
		int oper4 = oper4(num1, num2);
		
		// 3. 출력
		System.out.printf("%d + %d = %d 입니다. \n", num1 , num2 , sum);
		System.out.printf("%d - %d = %d 입니다. \n", num1 , num2 , oper1);
		System.out.printf("%d * %d = %d 입니다. \n", num1 , num2 , oper2);
		System.out.printf("%d / %d = %d 입니다. \n", num1 , num2 , oper3);
		System.out.println(num1 + " % " + num2 + " = " + oper4 + " 입니다. \n");
	}

	// 예제 p. 137
	// 1. 함수 선언
	public static int add(int n1, int n2) {
		int result =  n1 + n2;
		return result;
		// 반환자료형 / 반환값 : int
		// 함수명 : add
		// 매개변수 : int n1 / int n2
	}
	
	// 예제 p. 138
	public static int oper1(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	
	public static int oper2(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static int oper3(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
	public static int oper4(int n1, int n2) {
		int result = n1 % n2;
		return result;
	}

}
