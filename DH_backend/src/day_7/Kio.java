package day_7;

import java.util.Scanner;

/*
실습 3 : 키오스크 프로그램
	- 문법  : 변수 / 입출력함수 / 연산자 / 제어문(조건문 / 반복문)
	- 제품 콜라 / 사이다 / 환타 3개 존재
	- 각 제품의 재고는 초기에 10개씩 존재 
	- 각 제품의 가격은 콜라 : 1000원 / 사이다 : 1500원 / 환타 : 2000원 으로 가정
	- 메뉴] 1. 콜라 2. 사이다 3. 환타 4. 결제
		- 1 선택 시 : 콜라 재고 1차감 장바구니에 담음
		- 2 선택 시 : 사이다 재고 1차감 장바구니에 담음
		- 3 선택 시 : 환타 재고 1차감 장바구니에 담음
		- 4 선택 시 : 현재 장바구니에 담긴 모든 현황을 보여주고 금액 합산을 출력
		- 유효성 검사 : 재고가 부족하면 '재고가 부족합니다.'라고 출력하시오.
*/
public class Kio {
	int 재고;
	int 바구니;
	int 가격;
	
	public static void main(String[] args) {
		Kio 콜라 = new Kio(); 
		Kio 사이다 = new Kio(); 
		Kio 환타 = new Kio(); 

		콜라.재고 = 10;
		사이다.재고 = 10;
		환타.재고 = 10;
		
		콜라.바구니 = 0;
		사이다.바구니 = 0;
		환타.바구니 = 0;
		
		콜라.가격 = 1000;
		사이다.가격 = 1500;
		환타.가격 = 2000;
		
		while(true) {
			Scanner i = new Scanner(System.in);
			System.out.println(">> 상품선택 1. 콜라 2. 사이다 3. 환타 4. 장바구니 내역");
			int choose = i.nextInt();
			
			
			if(choose == 1) {
				if(콜라.재고 == 0) {
					System.out.println("콜라 재고가 부족합니다.");
				}else {
					콜라.재고--;
					콜라.바구니++;
				}
			}else if(choose == 2) {
				if(사이다.재고 == 0) {
					System.out.println("사이다 재고가 부족합니다.");
				}else {
					사이다.재고--;
					사이다.바구니++;
				}
			}else if(choose == 3) {
				if(choose == 0) {
					System.out.println("환타 재고가 부족합니다.");
				}else {
					환타.재고--;
					환타.바구니++;
				}
			}else if(choose == 4) {
				int total = (콜라.바구니 * 콜라.가격) + (사이다.바구니 * 사이다.가격) + (환타.바구니 * 환타.가격);  
				System.out.printf(" 콜라 : %d 개 / 사이다 : %d / 환타 : %d  총금액은 %d 원 입니다. \n", 콜라.바구니 , 사이다.바구니, 환타.바구니 , total);;
			}
			
			
			
			
			
		}
	}

}
