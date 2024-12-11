package day_3;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class 연산자_추가_예제 {

	public static void main(String[] args) {
	// [ 제어문/반복문 없이 풀이 ]
		Scanner scan = new Scanner(System.in);
	// 문제1 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
		
		System.out.println("문제 1. 정수 1을 입력하시오.");
		int i1 = scan.nextInt();
		int oper1 = i1 % 7;
		String result1 = (oper1 == 0) ? "O" : "X";
		System.out.println("정수 1은 7의 배수이다. " + result1);
		
	// 문제2 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 홀수 이면 'O' 아니면 'X' 출력 하시오.

		System.out.println("문제 2 . 정수 2를 입력하시오.");
		int i2 = scan.nextInt();
		int oper2 = i2 % 2;
		String result2 = (oper2 == 1) ? "O" : "X";
		System.out.println("정수 2는 홀수이다. " + result2);
	
	// 문제3 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
		
		System.out.println("문제 3 . 정수 3을 입력하시오. ");
		int i3 = scan.nextInt();
		String result3 = (i3 % 7 == 0 && i3 % 2 == 0) ? "O" : "X";
		System.out.println("정수 3은 7의배수이자 짝수이다. " + result3);
		
	// 문제4 : 하나의 정수형으로 정수를 입력받아 입력받은 값이 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
		
		System.out.println("문제 4 . 정수 4를 입력하시오. ");
		int i4 = scan.nextInt();
		String result4 = (i4 % 11 == 0 && i4 % 2 == 0) ? "O" : "X";
		System.out.println("정수 4는 11의 배수이자 짝수이다. " + result4);

	// 문제5 : 두개의 정수형으로 정수를 입력받아 입력받은 값이 더 큰수 출력 하시오.
		
		System.out.println("문제 5 . 1번 정수 5를 입력하시오 .");
		int i5_1 = scan.nextInt();
		System.out.println("문제 5 . 2번 정수 5를 입력하시오 .");
		int i5_2 = scan.nextInt();
		
		int result5 = (i5_1 > i5_2) ? i5_1 :i5_2;
		System.out.println("두 정수 중 더 큰 수는  : " + result5);
		
	/* 문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
	       계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14] */
		System.out.println("문제 6 . 반지름을 입력하시오.");
		double d6 = scan.nextDouble();
		final double pi = 3.14;
		
		double result6 = d6 * d6 * pi;
		System.out.printf("원의 넓이는 %6.2f 입니다.", result6);
		
	/* 문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
           예) 54.5   84.3 실수 2개입력시 결과는   64.2% */
		System.out.println("문제 7 . 1번 실수 7을 입력하시오.");
		double d7_1 = scan.nextDouble();
		System.out.println("문제 7 . 2번 실수 7을 입력하시오.");
		double d7_2 = scan.nextDouble();
		
		double result7 = (d7_1 /d7_2) * 100;
		
		System.out.println("퍼센트는 %5.1f 입니다.", result7);
		
	/* 문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
	       계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2 */
		System.out.println("문제 8 . 사다리꼴 윗 변을 입력하시오.");
		double d8_1 = scan.nextDouble();
		System.out.println("문제 8 . 사다리꼴 밑 변을 입력하시오.");
		double d8_2 = scan.nextDouble();
		System.out.println("문제 8 . 사다리꼴 높이를 입력하시오.");
		double d8_3 = scan.nextDouble();
		
		double result8 = (d8_1 + d8_2) * d8_3 / 2 ;
		
		System.out.println("사다리꼴의 넓이는 %5.1f 입니다.", result8);
		
	/* 문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
	       계산식) 표준체중 계산식 = > (키 - 100) * 0.9 */
		System.out.println("문제 9 . 키를 입력하시오.");
		double d9 = scan.nextDouble();
		
		double oper9 = (d9 - 100) * 0.9;
		int result9 = (int)oper9;
		
		System.out.println("해당 키의 표준 체중은" + result9 + "입니다.");
		
	/* 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
	        계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100)) */
		System.out.println("문제 10 . 키를 입력하시오.");
		double d10_1 = scan.nextDouble();
		System.out.println("문제 10 . 몸무게를 입력하시오.");
		double d10_2 = scan.nextDouble();
		
		double result10 = d10_2 / ((d10_1 / 100) * (d10_1 / 100));
		
		System.out.printf("해당 키와 몸무게의 BMI는 %5.2f 입니다.", result10);
		
	/* 문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
	        계산식) 1 inch -> 2.54cm */
		System.out.println(" 문제 11 . inch를 입력하싱오.");
		double d11 = scan.nextDouble();
		
		final double cm = 2.54;
		double result11 = d11 * 2.54;
		
		System.out.printf("해당 inch의 cm 값은 %5.2f 입니다.", result11);

	/* 문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 총점수 출력하시오
	        계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 % */
		System.out.println("중간고사 점수를 입력하시오.");
		double d12_1 = scan.nextDouble();
		System.out.println("기말고사 점수를 입력하시오.");
		double d12_2 = scan.nextDouble();
		System.out.println("수행평가 점수를 입력하시오.");
		double d12_3 = scan.nextDouble();
		
		double oper12_1 = d12_1 * 0.3;
		double oper12_2 = d12_2 * 0.3;
		double oper12_3 = d12_3 * 0.4;
		
		double result12 = oper12_1 + oper12_1 + oper12_1;
		
		System.out.printf("총 점수는 %5.2f 입니다.", result12);
		
	/* 문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
	         int x = 10;
	         int y = x-- + 5 + --x;
	         printf(" x의 값 : %d , y의값 :  %d ", x, y) */

		int x = 10;
        int y = x-- + 5 + --x; //26
        
        System.out.printf("문제 13 . x의 값 : %d , y의 값 : %d" , 11 , 26);
        
	// 문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
        
        System.out.println("문제 14 . 나이를 입력하시오.");
        int i14 = scan.nextInt();
        
        String result14 = (i14 >= 10 && i14 < 20) ? "학생" : 
        				  (i14 >= 20 && i14 < 40 ) ? "성인" : "중년";
        
        System.out.println("해당 나이는 " + result14 + "입니다.");
        
	// 문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

	// 문제16 : 3개의 정수형으로 입력받아 가장 큰수 출력하시오. [ 같은 입력 값을 배제 ]

	// 문제17 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력 하시오
	}

}
