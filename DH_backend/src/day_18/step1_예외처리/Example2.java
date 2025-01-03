package day_18.step1_예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		// 실행예외 : 프로그램 실행 도중에 발생하는 예외 -> 
		
		// 1. NullPointerException 실행 예외 -> 인스턴스가 존재하지 않는다.
		try {
			String str1 = "강호동";
			System.out.println(str1.length());
			
			String str2 = null;
			System.out.println(str2.length()); // NullPointerException 실행 예외 발생
		}catch (NullPointerException e) {	// 만약 NullPointerException 예외가 발생하면
			System.out.println(">> 인스턴스가 존재하지 않습니다." + e); // 출력
		}
		
		// 2. NumberFormatException 실행 예외 -> int 타입으로 변환할 수 없다.
		try {	
			String str3 = "100";
			String str4 = "1aa";
				// Integer.parseInt(변수명); -> 문자열 타입을 int 타입으로 형변환하는 함수
			int value1 = Integer.parseInt(str3); // "100" -> 100 : 가능
			int value2 = Integer.parseInt(str4); // "1aa" -> 정수 : 불가능 => NumberFormatException 실행 예외 발생
		}catch (NumberFormatException e) {
			System.out.println(">> int 타입으로 변환이 불가능합니다." + e);
		}
		
		// 3. ArrayIndexOutOfBoundsException 실행 예외 -> 해당 인덱스가 배열의 크기를 벗어났다.
		try {
			int[] intArray = {1,2,3};
			System.out.println(intArray[0]);
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 해당 인덱스가 배열에 존재하지 않습니다." + e);
		}
		
		
		// 4. InputMismatchException 실행 예외 -> 입력값이 지정한 타입과 맞지 않는다.
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println(">> 정수를 입력하세요."); // 입력이 int 타입이 아닐 시 예외 발생
			int value3 = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(">> 입력값의 타입이 일치하지 않습니다." + e);
		}
		
		// 5. 다중 예외 처리 : try 내에서 예외 발생 시 지정한 예외클래스의 catch 로 이동 
		try {
			Integer.parseInt("1aa");
			
			int[] intArrays = {1,2,3};
			System.out.println(intArrays[3]);
			
			String str = null;
			System.out.println(str.length());
			
		}catch (NumberFormatException e1) {
			System.out.println(e1);
		}catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}catch (InputMismatchException e3) {
			System.out.println(e3);
		}finally { // 예외 여부와 상관없이 무조건 실행
			System.out.println(">> 무조건 실행");
		}
	
		
		
		
		
		
		
		
	}
	
}
