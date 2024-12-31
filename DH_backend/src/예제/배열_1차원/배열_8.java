package 예제.배열_1차원;

import java.util.Scanner;

/*
두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.

[출력]
첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.


*/
public class 배열_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		// 서로 다른 값의 개수를 count 하기 위한 int 타입 변ㄴ수 선언
		int count = 0;
		// 비교를 위한 boolean 변수 선언
		boolean b;
		
		// 배열 순회를 통해 배열 내 인데스 % 42 연산 실행
		for(int i = 0; i < arr.length; i++) {
			System.out.print(">> 정수 입력 : ");
			arr[i] = scan.nextInt() % 42;
			
			// System.out.println(arr[i]);
		}
		
		// 배열 내 각 인덱스 값을 비교하기 위해 for 문 실행
		for(int i = 0; i < arr.length; i++) {
			// b 변수의 기본값을 false 로 지정
			b = false;
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					b = true;
					break;
				}
			}
			if(b == false) {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
