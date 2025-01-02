package day_17.step1;

public interface InterfaceTest {
	// 인터페이스 멤버
	// 1. 상수
	// int value1; // -> 오류 : 인터페이스는 변수를 가질 수 없다.
	
	// 상수 생성_1
	int value2 = 10; // 변수가 아닌 상수로 자동 초기화 됨
	
	// 상수 생성_2 -> public static final 타입 상수명 = 상수초기값;
	public static final int value3 = 20;
	
	
	// 2. 추상 메소드
	// int method(int a) {}; // 오류 : 인터페이스는 일반 메소드를 가질 수 없다.
	// 추상 메소드 생성_1
	int method1(int a);
	
	// 추상 메소드 생성_2
	abstract int method2(int a);
}
