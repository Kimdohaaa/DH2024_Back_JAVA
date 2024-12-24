package 예제.조건문;

import java.util.Scanner;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오
// 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
// 출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
//		- A가 B보다 큰 경우에는 '>'를 출력한다.
//		- A가 B보다 작은 경우에는 '<'를 출력한다.
//		- A와 B가 같은 경우에는 '=='를 출력한다
public class 조건문_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> 정수 A 를 입력하시오.");
		int i1 = scan.nextInt();
		System.out.println(">> 정수 B 를 입력하시오.");
		int i2 = scan.nextInt();
		
		if(i1 > i2) {
			System.out.println(i1 + " > " + i2);
		}else if(i1 < i2) {
			System.err.println(i1 + " < " + i2);
		}else if(i1 == i2) {
			System.out.println(i1 +" == " + i2);
		}
	}

}
