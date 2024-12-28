package 예제.배열_1차원;

import java.util.Scanner;

/*
총 N개의 정수가 주어졌을 때, 정수 v 가 몇 개인지 구하는 프로그램을 작성하시오.

첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 
셋째 줄에는 찾으려고 하는 정수 v 가 주어진다. 입력으로 주어지는 정수와 v 는 -100보다 크거나 같으며, 100보다 작거나 같다.

첫째 줄에 입력으로 주어진 N개의 정수 중에 v 가 몇 개인지 출력한다.
*/
public class 배열_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 입력할 정수의 개수 : ");
		int n = scan.nextInt();
		
		// 입력값 크기를 가진 배열 선언
		int[] arr = new int[n];
	
		int result = 0;
		
		// 반복문을 통해 배열의 크기만큼 입력값 받기
		for(int index = 0; index < arr.length; index++) {
			System.out.print(">> n 개의 정수 : ");
			arr[index] = scan.nextInt();
		}
		
		System.out.println(">> 탐색할 정수 : ");
		int findi = scan.nextInt();
		
		// 배열 내 특정값을 찾은 후 특정값의 개수만큼 result ++
		for(int index = 0; index < arr.length; index++) {
			for(; findi == arr[index];) {
				result++;
				break;
			}
		}
		System.out.println(result);
		
		

	}

}
