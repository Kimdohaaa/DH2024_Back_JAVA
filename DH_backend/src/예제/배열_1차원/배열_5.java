package 예제.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

/*
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 
가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.

도현이는 앞으로 M번 공을 넣으려고 한다. 
도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 
만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.

공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
각 방법은 세 정수 i j k 로 이루어져 있으며, i 번 바구니부터 j 번 바구니까지에 k  번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 
예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
 
도현이는 입력으로 주어진 순서대로 공을 넣는다.

[출력]
1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.

---------------------------------------------------------------
입력 첫째 줄 : 가지고 있는 바구니 / 공을 넣을 횟수
입력 둘째 줄 : 공을 넣을 바구니 범위(시작바구니 끝바구니) 넣을 공의 숫자
- 바구니에 공이 들어 있을 경우 기존 공을 빼고 새로운 공을 넣는다.
- 빈 바구니는 0 을 출력한다.
*/
public class 배열_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 바구니의 개수 : ");
		int[] basket = new int[scan.nextInt()];
		System.out.print(">> 공을 넣을 횟수 : ");
		int count = scan.nextInt();

		// 공을 넣을 횟수만큼 반복
		for(int j = 0; j < count; j++) {
			for(int i = 0; i < basket.length  ; i++) {
				System.out.print(">> 시작 바구니 : ");
				// 배열의 인덱스 0번 ==  1로 입력받으므로 입력받은 값 -1을 해줌
				int start = scan.nextInt()-1;
				// 배열의 인덱스 0번 ==  1로 입력받으므로 입력받은 값 -1을 해줌
				System.out.print(">> 끝 바구니 : ");
				int end = scan.nextInt()-1;
				
				System.out.print(">> 바구니에 넣을 공의 숫자 : ");
				int number = scan.nextInt();
				
				// 시작 바구니 ~ 끝 바구니 까지 같은 숫자를 가진 공이 들어가야 함으로 반복문 사용
				// 시작 인덱스 ~ 끝 인덱스 까지 ++ 하여 같은 값을 가진 공 대입
				for(; start <= end;start++) {
					basket[start] = number;
					//System.out.println(Arrays.toString(basket));
				}
				
				// count 만큼만 입력을 받기 위해 j == count 가 되면 종료
				break;
			}
		}
		// 배열의 주소값이 아닌 실제 값을 출력하기 위해 Arrays.toString() 메소드 사용
		System.out.println(Arrays.toString(basket));	
	}

}
