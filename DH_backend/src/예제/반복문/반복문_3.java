package 예제.반복문;

import java.util.Scanner;

/*
준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다. 정말 멋졌다.
그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다! 
준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.

영수증에 적힌,

구매한 각 물건의 가격과 개수 구매한 물건들의 총 금액을 보고, 
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.

둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.

이후 N 개의 줄에는 각 물건의 가격 a 와 개수 b 가 공백을 사이에 두고 주어진다.

구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes 를 출력한다. 일치하지 않는다면 No 를 출력한다.
*/
public class 반복문_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> 영수증 총 금액 : ");
		int total1 = scan.nextInt();
		System.out.println(">> 영수증 물건 총 개수 : ");
		int totalCount = scan.nextInt();
		
		int total2 = 0;
		
		for(int i = 1; i <= totalCount ; i++) {
			System.out.println(">> 물건 가격 : ");
			int price = scan.nextInt();
			System.out.println(">> 물건 수량 : ");
			int count = scan.nextInt();
			
			total2 += count * price;
			
		}
		if(total2 == total1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
