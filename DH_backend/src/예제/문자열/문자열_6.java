package 예제.문자열;

import java.util.Arrays;
import java.util.Scanner;

/*
알파벳 찾기

알파벳 소문자로만 이루어진 단어 S가 주어진다. 
각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

[출력]
각각의 알파벳에 대해서, a 가 처음 등장하는 위치, b 가 처음 등장하는 위치, ... z 가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

-------
1. 문자열 입력 받기
2. 문자열에 a ~ z 알파벳이 존재하는 확인
3. 존재 시 존재한 인덱스 번호 출력 / 존재하지 않을 시 -1 출력
??아스키코드??
int 형변환을 통해 a ~ z +1 for 문 
*/
public class 문자열_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">> 문자열 입력 : ");
		String str = scan.next();
		
		int[] arr = new int[26];
		int a = 97;
		
		boolean bool = false;
		// System.out.println((char) a);
		
		for(int index = 0; index < arr.length; index++) {
			arr[index] = a++;
			
			for(int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
				System.out.println((int)str.charAt(i));
				if((int)str.charAt(i) == arr[i]) {
					arr[i] = i;
					bool = true;
				}			
				if(bool == false) {
					arr[i] = -1;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(arr));

	}
	
}
