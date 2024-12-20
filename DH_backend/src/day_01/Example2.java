package day_01;

public class Example2 {

	public static void main(String[] args) {
		// 논리 자료형(true / false 만 저장 가능)
		boolean bool1 = true;
		// boolean bool2 = 3 ; -> 오류(true / false가 아니기 때문)
		boolean bool3 = false;
		System.out.println("bool1 :" + bool1);
		System.out.println("bool3 :" + bool3); // + (연결연산자)
		
		// 문자 자료형(문자 하나만 저장 가능)
		char ch1 = 'a';
		// char ch2 = "abc" ->  오류 (문자 하나만 저장 가능하기 때문)
		System.out.println(ch1);
		
		// 문자열 자료형
		String str1 = "ABC" ;
		// String str2 = 'ABC' ; -> 오류 (문자열에 작은 따옴표를 사용했기때문)
		System.out.println("str1 : " + str1);
		
		// 정수 자료형
		byte b1 = 100;
		System.out.println("b1 : " + b1);
  		// byte b2 = 300; -> 오류 (자료형 byte의 허용범위를 벗어났기 때문)
		
		short s1 = 32000;
		System.out.println("s1 : " + s1);
		// short s2 = 40000; -> 오류 (자료형 short의 허용범위를 벗어났기 때문)
		
		int i1 = 210000000;
		System.out.println("i1 : " + i1);
		// int i2 = 300000000; -> 오류 (자료형 int의 혀용범위를 벗어났기 때문)

		long lo1 = 300000000L;
		System.out.println("lo1 : " + lo1);
		
		// 실수 자료형
		float f1 = 0.12345678123456789F; // 소수점 아래 8자리까지만 출력 가능
		System.out.println("f1 : " + f1);
		
		double d1 = 0.123456789123456789; // 소수점 아래 17자리까지만	출력 가능
		System.out.println("d1 : " + d1);
				
		
	}

}
