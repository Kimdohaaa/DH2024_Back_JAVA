package 예제;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		배, 사과, 오렌지를 키우고 있는데 각 과일의 하루 생산량은 각각 5, 6, 7개
		1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		2)시간당 과일의 생산 갯수를 출력

		단, 과일의 갯수를 저장하는 변수는 int 타입으로
		하루에 생산되는 과일의 총 갯수를 저장하는 변수도 int 타입으로
		시간당 생산 갯수를 저장할 변수는 float 타입으로 작성할 것.
		*/
		int apple = 5;
		int pear = 6;
		int orange = 7;
		
		int total = apple + pear + orange;
		float H = total / 24.0f;
		
		System.out.println(">> 총 생산 개수 : " + total);
		System.out.println(">> 시간 당 생산 개수 : " + H);

		
		/*
		변수 n 에 정수값을 저장하고 1부터 입력받은 정수 n 까지의 합을 계산하여 
		그 결과를 출력하는 프로그램을 작성.
		예를들어 정수 5를 입력받으면, 
		1 + 2 + 3 + 4 + 5의 연산결과인 15를 출력해야 한다.
		*/
		Scanner scan = new Scanner(System.in);

		System.out.println(">> 정수를 입력하시오.");
		int n = scan.nextInt();
		int result1 = 0;
		
		for(int i = 1; i <= n ; i++) {
			result1 += i;
		}
		
		System.out.println(">> 1 ~ 정수의 합 : " + result1);
		
		/*
		변수 n1과 n2에 값을 넣고 n1과 n2사이의 합을 계산하여 그 결과를 출력하는 프로그램을 작성.
		예를들어 2와 5를 입력받으면, 2 + 3 + 4 + 5의 연산결과인 14를 출력해야 한다.
		
		//단, 5와 2 처럼 큰 수를 먼저 입력받아도 같은 결과가 나와야 함 
		*/
		System.out.println(">> 정수 1을 입력하시오.");
		int n1 = scan.nextInt();
		System.out.println(">> 정수 2을 입력하시오.");
		int n2 = scan.nextInt();
		int result2 = 0;
	
		for(; n1 <= n2; n1++) {
			result2 += n1; 
		}
		System.out.print(">> 정수 1 ~ 정수 2의 합 :" + result2);
		
		/*
		1부터 100까지 반복하는 문장에서 3의 배수만 출력하시오
		*/
		System.out.println();
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(">> 1 ~ 100까지 3의 배수 : " + i);	
			}
		}

		
		
	}

}
