package 예제.기타;

import java.util.Arrays;
import java.util.Scanner;

/*
일곱 난쟁이

[문제]
왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 
일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.

아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 
뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.

아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.

[출력]
일곱 난쟁이의 키를 오름차순으로 출력한다. 
일곱 난쟁이를 찾을 수 없는 경우는 없다.

*/
public class Example5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
		// 결과를 저장할 배열변수 선언
		int[] result = new int[7];
		int total = 0;
		
		for(int i = 0; i < 9 ; i++) {
			System.out.print(">> 난쟁이의 키 : ");
			height[i] = sc.nextInt();
			// 난쟁이의 총 키
			total += height[i];
		}
		
		for(int i = 0;  i < height.length; i++) {
			for(int j = 0; j < height.length; j++) {
				
				// 난쟁이는 총 7 명이므로 두명 제외한 합이 100이 되는 경우 
				if(total - height[i] - height[j] == 100) {

					// 시간 복잡도를 줄이기 위해 for 문 대신 변수 사용
					int index = 0;
					
					for(int z = 0; z < 7; z++) {
						// 9명 중 두명 제외한 값을 result 배열 각 인덱스에 대입
						if(z != i && z != j) {
							result[index++] = height[z];

						}
					}

					break;
				}
			
			}
		}
	
		// .sort() : 오름차순 정렬
		// Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

}
