package day_7;

import java.util.Arrays;
import java.util.stream.Sink.ChainedInt;

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
		System.out.println(num);  // 배열의 가상메모리위치(=주소) 값 출력
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
		
		// 전체 배열 길이와 유효한 요소 값
		double[] data = new double[5];	// double 5개를 저장할 수 있는 배열 선언
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		// 초기화 하지 않은 data[3],data[4]는 기본값 0.0으로 초기화된다.
		
		for(int i =0; i < data.length ; i++) {
			System.out.println(data[i]);
		}
		
		
		
		int 총점 = 0;
		int 평균 = 0;
		
		int[] 점수 = new int[5];	
		for(int i = 0; i < 점수.length -1 ; i++) {
			총점 += 점수[i];
			평균 *= 점수[i];
		}
	}	


}
