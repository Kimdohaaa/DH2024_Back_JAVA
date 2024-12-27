package 예제.반복문;

import java.util.Scanner;

// n 이 주어졌을 때, 1부터 n 까지 합을 구하는 프로그램을 작성하시오.
public class 반복문_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> 정수 n : ");
		int n = scan.nextInt();
		int result = 0;
		
		for(int i = 0; i <= n ; i++) {
			result += i;
		}
		System.out.println(result);
	}

}
