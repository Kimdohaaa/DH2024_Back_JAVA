package 예제.문자열;

import java.util.Scanner;

/*
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

[입력]
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

[출력]
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

*/
public class 문자열_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 입력받은 문자열을 char 타입으로 쪼개기 위한 for 문 
		for(int i = 0; i < str.length(); i++) {
			// .charAt() 메소드를 통해 문자열에 인덱스를 지정
			char index = str.charAt(i);
			
			// int 타입으로의 캐스팅을 통해 아스키코드 출력
			System.out.println((int) index);
		}
	}

}