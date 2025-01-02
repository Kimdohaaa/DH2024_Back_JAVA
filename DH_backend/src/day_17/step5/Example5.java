package day_17.step5;

// 인터페이스 선언
interface InterfaceTest2{
	// 상수
	public static final int value = 10;
	
	// 인터페이스의 메소드 종류
	// 1. 추상 메소드
	public abstract void method1();
	
	// 2. 디폴트 메소드 : default 키워드를 통해 디폴트 메소드 생성 시 인터페이스에 메소드의 구현부를 작성할 수 있다.
	public default void method2() {}
	
	// 3. 정적 메소드 : static 키워드를 통해 인터페이스에 정적 메소드 생성 가능
	public static void method3() {}
	
	// 4. private 메소드 : 현재 인터페이스에서 사용 가능한 구현 메소드 생성 가능
	private void method4() {}
	
	// 5. private static 메소드 : 현재 인터페이스에서 사용 가능한 정적 구현 메소드 생성 가능
	private static void method5() {} 
	
	// ★ 인터페이스는 클래스와 다르게 생성자가 없다 -> 인스턴스를 만들 수 없다. ★ //
	// static (정적) -> 변수 / 인스턴스 없이도 사용 가능
}

public class Example5 {

	public static void main(String[] args) {
		// 1. 인터페이스의 상수 호출
		System.out.println(InterfaceTest2.value);
		
		// 2. 인터페이스의 추상메소드 호출
		// InterfaceTest2.method1() // 오류 -> 아직 클래스를 통해 구현되지 않아 실체가 없기 때문
		
		// 3. 인터페이스의 디폴트 메소드 호출
		// InterfaceTest2.method2();  // 오류 -> 아직 클래스를 통해 구현되지 않아 실체가 없기 때문
		
		// 4. 인터페이스 정적 메소드 호출
		InterfaceTest2.method3(); // method3 는 static 으로 변수 , 인스턴스 없이 사용 가능
		
		
		// 인터페이스는 생성자가 없기 때문에 인스턴스를 생성 할 수 없다.
		// InterfaceTest2 inter = new InterfaceTest2();
	}
}
