package 예제.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

/*
X대학 M교수님은 프로그래밍 수업을 맡고 있다. 
교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

[입력]
입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.

[출력]
출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
*/
public class 배열_7 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int[] arr = new int[30];
		
		for(int i = 0; i < 28; i++) {
			System.out.print(">> 제출자 출석번호 : ");
			int num = scan.nextInt();
			// 배열의 인덱스는 0부터 시작하기 때문에 입력값 -1
			// 제출한 인덱스를 1로 지정
			arr[num - 1] = 1;
		}
		
		// 30개의 정수를 입력값에 없는 정수를 찾기 위해 for 문 사용
		for(int i = 0; i < 30; i ++) {
			// 만약 arr[i] 가 0 이라면 -> 제출하지 않았다면
			if(arr[i] == 0) {
				// 배열의 인덱스는 0부터 +1
				System.out.println(i+1);
			}
		}
	}

}
