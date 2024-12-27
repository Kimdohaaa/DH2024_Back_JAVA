package 예제.반복문;

import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

/*
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/

public class 반복문_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> 케이스 개수 T : ");
		int t = scan.nextInt();
		
		int result = 0;
		
		int[] resultArr = new int[t];
		
		for(int i = 0 ; i < t; i++) {
			System.out.println(">> 정수 X : ");
			int x = scan.nextInt();
			System.out.println(">> 정수 Y : ");
			int y = scan.nextInt();

			resultArr[i] = x + y;	
		}
		
		for(int i = 0; i < resultArr.length ; i++) {
			System.out.printf(" Case # %d : %d \n", i , resultArr[i]);	
		}
		

	}

}
