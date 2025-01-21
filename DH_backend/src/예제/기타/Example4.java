package 예제.기타;

import java.util.Arrays;
import java.util.Scanner;

/*
팰린드롬인지 확인하기
알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.

팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 

level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.

[출력]
첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
*/
public class Example4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> 단어 입력 :");
		String str = scanner.next();
		char[] arr = new char[str.length()];
		char[] revArr = new char[str.length()];
		
		boolean state = false;
		for(int i = 0; i< arr.length; i++) {
			arr[i] += str.charAt(i);
		}

		for(int i = 0; i < revArr.length ; i++) {
			revArr[i] = arr[str.length()-1 - i];
			
			if(revArr[i] == arr[i]) {
				state = true;
			}
		}
		
		System.out.println(Arrays.toString(revArr));
		System.out.println(Arrays.toString(arr));
		if(state == true) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
			

		
		
		
	}
}
