package day_16.step3;
// 부모클래스 : Object | 자식클래스 : Child
class Parent{
	// 멤버변수
	String filed1;
	
	// 메소드
	public void method1() {
		System.out.println(">> Parent method1");
	}
	public void method2() {
		System.out.println(">> Parent method2");		
	}
}

// 부모클래스 : Object , Parent 
class Child extends Parent{
	// 멤버변수
	String filed2;
	
	// 메소드
	public void method3() {
		System.out.println(">> Parent method3");
	}
	
	// ★ 오버라이딩 : 부모클래스로부터 물려받은 메소드를 재정의 하기 ★ //
	// 1. 메소드 선언부 -> 동일하게 작성(메소드는 모든 인스턴스가 공유 가능하기 때문에 멤버변수처럼 super, this 로 구분하지 않아도 됨)
	@Override // -> 오버라이딩 어노테이션(생략가능)
	public void method1() {
		// 2. 재정의
		System.out.println(">> Child method1");
	}
	// 1. 메소드 선언부
	@Override
	public void method2() {
		// 2. 재정의
		System.out.println(">> Child method2");
	}
}

public class Example3 {

	public static void main(String[] args) {

		// 1. 자식클래스의 인스턴스 생성
		Child child = new Child();
	
		// 2. 메소드 호출
		child.method1();	// 부모클래스 Parent 클래스의 메소드를 오버라이딩한 본인 클래스의 메소드 출력 (부모보다 본인의 메소드가 우선이기 때문)
		child.method2();	// 부모클래스 Parent 클래스의 메소드를 오버라이딩한 본인 클래스의 메소드 출력 (부모보다 본인의 메소드가 우선이기 때문)
		// ---> 오바라이딩이 최우선 호출대상이다.
		child.method3();  	// 본인클래스 Child 클래스의 메소드 method3 사용
		
		// 3-1. 자식 클래스의 인스턴스 -타입변환-> 부모클래스
		Parent parent = child; // Child -타입변환-> Parent
		parent.method1();	// Child method1 출력 -> 타입변환 != 인스턴스변환 (형식은 바꾸지만 태생은 바뀌지 않음)
		// parent.method2();
		// parent.method3();
		// -> 오류 : 타입변환 시 하위 타입 멤버에 접근할 수 없기 때문
		
		// 3-2. 강제타입변환 부모 클래스 타입 -타입변환-> 자식 클래스 타입
		Child child2 = (Child)parent; // Parent -타입변환-> Child
		child.method1();	// Child method1 출력
		child.method2();	// Child method2 출력
		child.method3();	// Parent method3 출력
		// -> 타입 변환을 한 경우에도 오버라이딩이 우선
		
		// 4. 부모 클래스 인스턴스 생성
		Parent parent2 = new Parent();
		parent2.method1();	// Parent method1 출력 -> 부모클래스는 자식 클래스를 모르기 때문
		// Child child3 = (Child)parent2; // -> 오류 : 태생이 Parent 이기 때문에 (다운 캐스팅은 원래 태생으로 돌아가는 것만 가능)
		
		// 5. 태생 검사
		if(parent2 instanceof Child) { // 변수 parent2 의 Child 타입 참조 여부 검사
			Child child3 = (Child)parent2;	// 참조하고 있다면 타입 변환 실행
		}else {
			System.out.println(">> 타입 변환 불가"); // 참조하지 않고 있다면 안내문구 출력
		}
		
	}

}
