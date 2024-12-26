package day_13;

public class Company {
	// 싱글톤
	
	// 1 단계 : private 디폴트 생성자 선언
	private Company() {} // private 생성자 -> 외부에서 객체 생성 불가능
	
	// 2 단계 : 클래스 내부에 static 인스턴스 선언/생성
	private static Company instance = new Company(); // private 생성자 -> 외부에서 객체 생성 불가능
													 // static -> 프로그램 시작 시 우선 할당(프로그램 시작 시 객체 생성)

	// 3 단계 : 외부에서 참조할 수 있는 public 메소드 선언
	public static Company getInstance() { // public -> 내부에 만든 객체를 다른 클래스(외부)에서 접근 가능
										  // static -> 프로그램 시작 시 우선 할당(프로그램 시작 시 객체 생성)
		if(instance == null) {
			instance = new Company();
		}
		return instance; // static 이기 때문에 this 생략
						 // return instance -> 내부에 미리 만든 (싱글톤) 객체를 반환	
	}
	
	
	// ~~~ Example1 ~~~>
	
	// 참고 2
	public void method() { }
}
