package 예제.문자열;

import java.util.Scanner;

/*
문자열 반복

문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

[입력]
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

[출력]
각 테스트 케이스에 대해 P를 출력한다.

---------
입력 : 문자열 입력횟수 | 각 문자열을 반복할 횟수 | 문자열
문자열을 문자단위로 반복 횟수 만큼 반복
*/
public class 문자열_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> 문자열 입력 횟수 : ");
		int incount = scan.nextInt();
		
		// 입력횟수만큼 반복
		for(int i =0; i < incount ; i++) {
			System.out.print(">> 문자열 반복 횟수 : ");
			int count = scan.nextInt();
			System.out.print(">> 문자열 입력");
			String str = scan.next();
		
			// 입력받은 문자열 순회
			for(int z = 0; z < str.length() ; z++) {
				// 입력받은 문자열을 char 단위로 나눠 count 값만큼 반복
				for(int j = 0; j < count; j++) {
				
					System.out.print(str.charAt(z));
					
				}
			}

		}
		
		//System.out.println();
	}

}
