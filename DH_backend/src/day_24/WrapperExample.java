package day_24;

public class WrapperExample {
	public static void main(String[] args) {
		
		// [1] 100 을 저장하는 방법
		int value1 = 100;		// 기본타입 사용
		Integer value2 = 100;	// 참조타입 사용
		
		// [2] 3.14 를 저장하는 방법
		double value3 = 3.14;	// 기본타입 사용
		Double value4 = 3.14;	// 참조타입 사용
		
		// 차이점 : 타입이 기본타입 or 참조타입(멤버변수 / 생성자 / 메소드 로 구성)
		// System.out.println(value1.);		// 불가능 : 기본타입으로 메소드가 없기 때문
		System.out.println(value2.BYTES);	// 4출력 : 메소드가 사용 가능
		
		// [3] 오토박싱 / 언박싱 : 기본타입 <-변환-> 참조타입
		// 오토박싱 : 기본타입 -변환 -> 참조타입
		Integer value5 = value1; // int -변환->Integer
		// 언박싱 : 참조타입 -변환-> 기본타입
		int value6 = value2; // Integer -변환-> int		
		
		// [4] parseXXX : 문자열 -변환-> 기본타입
		int val1 = Integer.parseInt("100");	
		double val2 = Double.parseDouble("3.14");
		float val3 = Float.parseFloat("3.14");
		byte val4 = Byte.parseByte("100");
		short val5 = Short.parseShort("100");
		long val6 = Long.parseLong("100");
		boolean val7 = Boolean.parseBoolean("true");
		
		// [5] 기본타입 -변환-> 문자열
		String str1 = 100 + "";
		String.valueOf(100);
		
	}
}
