package 예제.조건문;

import java.util.Scanner;

/*
흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.

예를 들어, 좌표가 (12, 5)인 점 A는 x 좌표와 y 좌표가 모두 양수이므로 제1사분면에 속한다. 
점 B는 x 좌표가 음수이고 y 좌표가 양수이므로 제2사분면에 속한다.

점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 
단, x 좌표와 y 좌표는 모두 양수나 음수라고 가정한다
*/ 
class 조건문_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">> x 좌표 : ");
		int x = scan.nextInt();
		System.out.println(">> y 좌표 : ");
		int y = scan.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("해당 좌표는 제 1 사분면입니다.");
		}
		if(x < 0 && y > 0) {
			System.out.println("해당 좌표는 제 2 사분면입니다.");
		}
		if(x < 0 && y < 0) {
			System.out.println("해당 좌표는 제 3 사분면입니다.");
		}
		if(x > 0 && y < 0) {
			System.out.println("해당 좌표는 제 4 사분면입니다.");
		}
	}
}
