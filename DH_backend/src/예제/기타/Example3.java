package 예제.기타;

import java.util.Scanner;

/*
달팽이는 올라가고 싶다.

땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오. 

[입력]
첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)

*/
public class Example3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 달팽이가 올라갈 수 있는 미터 :");
		int up = scan.nextInt();
		System.out.print(">> 달팽이가 미끄러지는 미터 :");
		int drop = scan.nextInt();
		System.out.print(">> 나무막대의 길이 :");
		int m = scan.nextInt();
		
		// 상태를 저장할 변수 선언
		int arrive = 0;
		int day = 0;
		for(int i = 0; i < m ; i++ ) {
			int oper = up - drop;
			// up - drop => 총 달팽이가 올라간 미터를 day 변수에 대입
			day += oper;
			
			// day 변수가 나무막대기의 길이보다 작으면 ++ 
			if(day < m) {
				arrive++;	
			// day 변수와 나무막대기의 길이가 같아지면 반복문 종료
			}else if(day == m ){
				break;
			}
		}
		
		System.out.println(arrive);
		
	}

}
