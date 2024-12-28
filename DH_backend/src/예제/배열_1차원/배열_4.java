package 예제.배열_1차원;

import java.util.Scanner;

/*
9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61
이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

[입력]
첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

[출력]
첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/
public class 배열_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 배열의 크기 : ");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		// int 의 최소값 지정
		int max = -210000000;

		int findIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(">> 배열의 %d 번째 원소 : ", i);
			arr[i] = scan.nextInt();
			max = Math.max(arr[i], max);
			
			if(max == arr[i]) {
				// 최댓값을 찾을 경우 해당 원소의 인덱스 저장
				findIndex = i;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf(" 최댓값 : %d ",max);
			System.out.println();
			System.out.printf(" %d 번째 원소",findIndex);
			break;
		}
	}

}
