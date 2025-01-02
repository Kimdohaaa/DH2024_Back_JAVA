package day_17.step1;
// implement : 구현하다
class Tool1 implements InterfaceTest{
	// 1. 추상 메소드 구현
		// 선언부를 인터페이스의 추상 메소드와 동일하게 작성
		// 오버라이딩
	
	public int method1(int a) {	
		System.out.println(">> Tool1 클래스 구현 메소드1");
		return a;	
	}
	
	@Override
	public int method2(int a) {
		System.out.println(">> Tool1 클래스 구현 메소드2");
		return a;
	}
}


class Tool2 implements InterfaceTest{
	// 추상 메소드 구현 => 자동완성 : ctrl + space bar
	@Override
	public int method1(int a) {
		System.out.println(">> Tool2 클래스 구현 메소드1");
		return 0;
	}
	
	@Override
	public int method2(int a) {
		System.out.println(">> Tool2 클래스 구현 메소드2");
		return 0;
	}
}


public class Example1 {
	public static void main(String[] args) {
		// 1. 인터페이스의 상수 호출
			// 인터페이스명.상수명;
		System.out.println(InterfaceTest.value2);
		System.out.println(InterfaceTest.value3);
		
		// 2. 인터페이스의 추상 메소드 호출 , 사용
		// InterfaceTest.method2(); // -> 오류 : 추상 메소드는 구체적인 메소드가 아닌 공통적인 특성만 선언했기 때문에
									// 			메소드의 구현부{ }가 없으므로 호출 불가 -> 추상메소들르 구체적으로 구현(클래스를 통하여)
		// 2-1. (추상메소드를 구현한) 클래스 인스턴스 생성
		Tool1 tool1 = new Tool1();
		// 2-2. 구체화한 추상메소드 호출
		tool1.method1(10);
		tool1.method2(20);
		
		// 2-3. 다형성을 이용한 추상 메소드 호출 , 사용 
		// 인터페이스 타입은 추상메소드를 구현한 클래스의 인스턴스를 참조할 수 있다.
		InterfaceTest inter1 = new Tool1();
		inter1.method1(10);
		inter1.method2(20);
		
		InterfaceTest inter2 = new Tool2();
		inter2.method1(10);
		inter2.method2(20);
		// ===> 다형성
		
	}
}
