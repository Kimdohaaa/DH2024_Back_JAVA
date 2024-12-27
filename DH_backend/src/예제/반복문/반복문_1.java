package 예제.반복문;

import java.util.Scanner;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

각 테스트 케이스마다 A+B를 출력한다.
*/
public class 반복문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.print(">> 케이스 개수 T : ");
			int t = scan.nextInt();

			
			for(int i = 0; i < t ; i++) {
				System.out.println(">> 정수 A :");
				int a = scan.nextInt();
				System.out.println(">> 정수 B :");
				int b = scan.nextInt();
				
				System.out.println(a+b);
			}
			
			
		}
	}

}
