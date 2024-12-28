package 예제.배열_1차원;

import java.util.Scanner;

/*
N 개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

[출력]
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
public class 배열_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 배열의 크기 : ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		// int max 를 가장 작은 값으로 초기화 하여 배열 내 원소와 비교해 가장 큰 값 찾기
		int max = -1000000;
		// int min 를 가장 큰 값으로 초기화 하여 배열 내 원소와 비교해 가장 작은 값 찾기
		int min = 1000000;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(">> 배열의 원소 : ");
			arr[i] = scan.nextInt();
			// Math.max(a,b) 메소드 : 인수 a 와 인수 b 중 더 큰 값 반환
			// Math.min(a,b) 메소드 : 인수 a 와 인수 b 중 더 작은 값 반환
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.print(">> 배열 내 최대값 : " + max);
		System.out.print(">> 배열 내 최솟값 : " + min);
		
	
	
	}

}
