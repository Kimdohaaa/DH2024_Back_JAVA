package 예제.배열_1차원;

import java.util.Scanner;

/*
총 N개의 정수가 주어졌을 때, 정수 v 가 몇 개인지 구하는 프로그램을 작성하시오.

첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 
셋째 줄에는 찾으려고 하는 정수 v 가 주어진다. 입력으로 주어지는 정수와 v 는 -100보다 크거나 같으며, 100보다 작거나 같다.

첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
*/
public class 배열_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> 입력할 정수의 개수 : ");
		int i = scan.nextInt();
		
		int find = 0;
		int[] arr = new int[i];
		int result = 0;
				
		for(int j = 0; j < i ; j++) {
			System.out.println(">> 정수 : ");
			int i1 = scan.nextInt();
		}
		
		System.out.println(">> 탐색할 정수 : ");
		find = scan.nextInt();
		
		for(int j = 0; j <= arr.length -1 ; i++) {
			int findNum = arr[i];
			if(find == findNum) {
				result++;
				
				break;
			}	
		}
		
		System.out.println(result);
		
	}

}
