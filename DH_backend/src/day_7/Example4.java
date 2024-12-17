package day_7;

import java.util.Arrays;

public class Example4 {
	
	public static void main(String[] args) {
		// 배열
		
		// 1. 배열 선언
		int[] studentIDs1 = new int[10];
		
		// 2. 배열 초기화
		// 방법 1)
		int[] studentIDs2 = new int[] {101,102,103};
		// 방법 2)
		int[] studentIDs3 = {101,102,103};
		// 방법 3)
		int[] studentIDs4; 
		studentIDs4 = new int[] {101,102,103};

		// 3. 배열 호출
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(num);  
		System.out.println(Arrays.toString(num));	// 배열의 모든 값 출력
		System.out.println(num[0]); // 배열의 특정 index 값 출력
		System.out.println(num[3]); // 배열의 특정 index 값 출력
		
		
		// 예제 p.203
		int[] arr = new int[] {3,6,9,12};
		/*
		arr[0] + 2; 		// 5 
		arr[1] + arr[2];	// 15
		*/
		
		
		// 예제 p.203
		int sum = 0;
		
		for(int i = 0; i < num.length -1; i++) { // 배열 순회
			sum += num[i];		// 0~마지막 인덱스 까지의 합계 구하기
			System.out.println(sum);
		}
		
		
		
		
	}	


}
