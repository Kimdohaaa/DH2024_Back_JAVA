package 예제.문자열;

import java.util.Arrays;
import java.util.Scanner;

/*
문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

[입력]
입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 
각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 
문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.

[출력]
각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.

---- 

입력 : 문자열을 입력받을 횟수 / 문자열(횟수만큼)
출력 : 각 문자열의 첫 글자와 마지막 글자

1. 문자열을 입력받을 횟수를 입력받은 후
2. 입력받은 횟수만큼 반복문
3. 문자열의 첫글자와 마지막글자 출력
*/
public class 문자열_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력값만큼의 크기를 갖는 String 타입의 배열 선언
		System.out.print(">> 문자열 입력 횟수 : ");
		int count = sc.nextInt();
		String[] strArr = new String[count];
		
		for(int i = 0; i < strArr.length ; i++) {
			// 배열에 기본값으로 null 이 대입되는 것을 막기위해 배열 내 각 인덱스에 "" 대입
			strArr[i] = "";
			// 문자열을 입력받아 배열의 각 인덱스에 대입
			System.out.print(">> 문자열 입력 : ");
			String str = sc.next();
			strArr[i] += str;
			
			// System.out.println(str);
			// System.out.println(strArr[i]);
		}
		
		
		for(int i = 0; i < strArr.length; i++) {
			// 특정 글자를 변수에 대입하기 위해 String 타입을 .charAt() 메소드를 통해 char 타입으로 변경하여 변수에 저장
			char firstStr = strArr[i].charAt(0);
			char lastStr = strArr[i].charAt(strArr[i].length()-1);
			
			System.out.println("첫 글자 : " + firstStr + " 마지막 글자 : " + lastStr);
			
		}
	}

}
