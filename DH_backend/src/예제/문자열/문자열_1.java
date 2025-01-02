package 예제.문자열;

import java.util.ArrayList;
import java.util.Scanner;

/*
단어 S 와 정수 i 가 주어졌을 때, S 의 i 번째 글자를 출력하는 프로그램을 작성하시오.

[입력]
단어 S 와 정수 i 가 주어졌을 때, S 의 i 번째 글자를 출력하는 프로그램을 작성하시오.

[출력]
S 의 i 번째 글자를 출력한다.


*/
public class 문자열_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print(">> 문자열 입력 : ");
		String str = scan.next();
		
		System.out.print(">> 탐색할 문자열 : ");
		// charAt() 메소드의 인덱스는 0부터 시작하기 때문에 +1 을 해준다.
		int find = scan.nextInt()-1;
		
		// charAt() :  String 타입으로 입력된 문자열에 인덱스를 부여해 해당 인덱스를 char 타입으로 변환
		System.out.println(str.charAt(find));
	}
	

}
