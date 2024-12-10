package day_2;

public class Example2 {

	public static void main(String[] args) {
		// 묵시적형변환(=자동형변환)
		byte byteValue = 10; // byte 타입 'byteValue' 변수에 10 대입
		short shortValue = byteValue; // short 타입 'shortValue' 변수에 byte 10 대입
		int intValue = shortValue;
		long longValue = intValue; // intValue 에 들어있는 10을 가져왔기 때문에 L을 쓰지 않아도 됨
								   // -> 리터럴이 아닌 변수 값을 가져왔기 때문
		float floatValue = longValue;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		// 연산 중 묵시적형변환 예시
		byte b1 = 10;
		byte b2 = 20;
		short s1 = 30;
		int i1 = 40;
		float f1 = 3.14f;
		double d1 = 41.32;

		//byte b3 = b1 + b2; 오류 (int 이하 끼리의 연산은 int형이 되기 때문에 int형에 변수를 담아야함 )
		int result1 = b1 + b2;
		// short result2 = b1 + s1 -> 오류
		int result2 = b1 + s1;
		// int result3 = i1 + f1 -> 오류
		float result3 = i1 + f1;
		// float result4 = f1 + d1; -> 오류
		double result4 = f1 + d1;
		
		/*
		메모리 크기 ↓ -> 메모리 크기 ↑
		정밀도 ↓ -> 정밀도 ↑
		byte + byte = int
		byte + short => int
		int + int => int
		int + long => long
		int + float => float
		float + double => double
		예외 . byte / short의 연산은 무조건 int형이 됨
		*/
		
		
		// 명시적형변환(=강제형변환)
		
		double value1 = 3.14;
		float value2 = (float)value1; // 강제형변환은 소괄호 안에 강제로 변환할 자료형을 선언해준다.
		long value3 = (long)value2;
		int value4 = (int)value3;
		short value5 = (short)value4;
		byte value6 = (byte)value5;
		System.out.println(value6); // 데이터 손실이 발생해 3이 출력됨
		
		/*
		메모리 크기 ↑ -> 메모리 크기 ↓
		데이터 손실이 생길 수 있음
		형식 : (변환할 자료형)변수명
		*/
		
		
		/* 예제 p. 67 */
		char ch1 = 'A';
		System.out.println((int)ch1); // 문자에 해당되는 정수 출력 (아스키코드 A->65 출력)
		
		int ch2 = 67;
		System.out.println((char)ch2); // 정수에 해당되는 문자 출력 (아스키코드 67->B 출력)
	
		// 연산 중 강제형변환
		int result5 = (int)3.14 + 3;
		System.out.println(result5); // 데이터 손실이 발생해 6 출력
		
		
		/* 
		예제 p.69 4번 
		변수 두개를 선언하고 10과 2.0을 대입한 후 사칙연산 결과를 정수로 출력하시오.
		*/
		int intV = 10;
		float floatV = 2.0f;
		int result6 = intV + (int)floatV;
		System.out.println(result6);
		
		/* 
		예제 p.69 5번 
		'글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 출력하시오.
		*/
		char ch3 = '글';
		int chInt1 = ch3;
		System.out.println(chInt1);
		System.out.println((char)(chInt1+1)); // '글' 정수형 유니코드에 +1이 되어 '긁'출력
		
		/* 
		예제 p.69 5번 
		'JAVA'를 출력하시오.
		*/
		System.out.println((char)74 + "" + (char)65 + "" + (char)86+"" + (char)65 + "");
		// 중간에 ""(큰 따옴표)를 넣어 문자열로 연결
		
	}

}
