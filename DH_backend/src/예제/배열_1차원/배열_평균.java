package 예제.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

/*
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.

세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 
둘째 줄에 세준이의 현재 성적이 주어진다.
이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

[출력]
첫째 줄에 새로운 평균을 출력한다. 
실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

----------------------------
입력 : 과목의 개수 / 성적(과목의 개수만큼 반복)
연산 : 과목점수 / 과목점수최고점 * 100
*/
public class 배열_평균 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 내 최대값을 구하기 위해 배열 내 값과 비교할 max 변수를 선언해준다.
		double max = 0;
		double total = 0;
		
		// 배열의 크기를 입력받아 입력받은 크기를 가진 배열을 선언한다.
		System.out.print(">> 시험 본 과목의 개수 : ");
		int a = scan.nextInt();
		// 배열의 크기는 정수 , 배열 내 원소의 값은 실수형으로 받을 것이기 때문에 배열을 double 형으로 선언한다.
		double[] subjects = new double[a];
		
		// for 문을 통해 입력받은 과목의 개수만큼 성적을 입력받는다.
		for(int i = 0; i < subjects.length; i++) {
			System.out.print(">> 과목 성적 : ");
			// 입력받은 성적을 배열 내 각 인덱스에 대입한다.
			subjects[i] = scan.nextInt();
			
			// Math.max() 라이브러리를 통해 위에서 선언한 max 변수의 값과 배열 내 값을 비교해 최대값을 max 변수에 대입한다.
			max = Math.max(max, subjects[i]);
		}
		
		
		for(int i = 0; i < subjects.length; i++) {
			// total 변수에 문제에서 제시한 연산의 결과를 대입한다.
			total += subjects[i] / max * 100;
			// System.out.println(total);
			// System.out.println(Arrays.toString(subjects));
		}
		// 평균을 구하기 위해 배열의 크기로 total 을 나눠준다.
		total /= a;
		
		System.out.println(total);
	}

}
