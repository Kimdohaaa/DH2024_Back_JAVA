package 예제.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

/*
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 
바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
도현이는 앞으로 M번 공을 바꾸려고 한다. 
도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

[입력]
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 
각 방법은 두 정수 i j 로 이루어져 있으며, i 번 바구니와 j 번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
도현이는 입력으로 주어진 순서대로 공을 교환한다.

[출력]
1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.

---------------------------
입력 : 배열의 크기 N / 교환 횟수 M / 교환할 인덱스 번호 2개
*/
public class 배열_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 바구니의 크기 : ");
		int[] basket = new int[scan.nextInt()];
		System.out.print(">> 공 교환 횟수 : ");
		int count = scan.nextInt();
		
		// 배열의 각 인덱스에  값 부여
		for(int j = 0; j < basket.length; j++) {
			// 배열의 인덱스는 0부터 시작하기 때문에 1부터 시작하도록 지정
			basket[j] = j + 1 ;
		}
		
		for(int i = 0; i < count; i++) {
			System.out.print(">> 교환할 바구니 번호 : ");
			int index1 = scan.nextInt()-1;
			System.out.print(">> 교환할 바구니 번호 : ");
			int index2 = scan.nextInt()-1;
				
			for(int j = 0; j < basket.length; j++) {
				// 값을 교환하기 위해 임시변수로 temp 선언
				// 입력받은 교환할 바구니번호를 배열의 인덱스로 지정
				int temp = basket[index1];
				basket[index1] = basket[index2];
				basket[index2] = temp;
				break;
			}
		}
		// 배열의 주소값이 아닌 실제 값을 출력하도록 Arrays.toString() 메소드 사용
		System.out.println(Arrays.toString(basket));
		
	}

}
