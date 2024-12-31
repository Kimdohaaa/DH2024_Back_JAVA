package 예제.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

/*
도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다. 
바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다. 

도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 
도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.

바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음, 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오

[입력]
첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.

둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다. 
방법은 i j 로 나타내고, 왼쪽으로부터 i 번째 바구니부터 j 번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)

도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.

[출력]
모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.

-------------------------
입력 : 바구니(배열)의 크기 / 값을 교활할 횟수 / 교환할 바구니(배열)의 번호(인덱스) 
*/
public class 배열_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 바구니의 개수 : ");
		int[] basket = new int[scan.nextInt()];
		System.out.print(">> 교환할 횟수 : ");
		int change = scan.nextInt();
		
		int startIndex = 0;
		int endIndex = 0;
		
		
		for(int i = 0; i < basket.length; i++) {
			basket[i] = i + 1;
		}
		
		for(int i = 0; i < change; i++) {
			System.out.print(">> 교환할 바구니 번호 1 : ");
			int start = scan.nextInt();
			System.out.print(">> 교환할 바구니 번호 2 : ");
			int end = scan.nextInt();
			
			for(int j = 0; j < basket.length; j++) {
				for(int z = 0; z < basket.length; z++) {
					if(basket[j] == start) {
						if(basket[z] == end) {
							int temp = basket[j];
							basket[j] = basket[z];
							basket[z] = temp;
							//break;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(basket));
	}

}
