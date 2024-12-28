package 예제.배열_1차원;

import java.util.Scanner;

/*
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 
주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

[출력]
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
*/
/*
입력 : 배열의 크기 / 배열의 원소 / 정수 X
출력 : 배열 원소 중 X 보다 작은 수를 순서대로 출력
*/
public class 배열_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 배열의 크기 : ");
		int a = scan.nextInt();
		int[] arr = new int[a];
		
		System.out.print(">> 정수 X : ");
		int x = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(">> 배열의 원소 : ");
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				System.out.println(arr[i]);
				// break 입력 시 배열 내 x 보다 작은 수를 발견하면 종료되기 때문에 break 생략
			}
				
		}
		

	}

}
