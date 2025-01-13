package day_24;

class Book{
	
}

public class ObjectExample {
	public static void main(String[] args) {
		
		// [1] Object 클래스를 이용한 인스턴스 생성
		Object obj1 = new Object();				// Object 타입
		Object obj2 = 3;						// int 타입
		Object obj3 = 3.14;						// double 타입
		Object obj4 = "유재석";					// String 타입
		Object obj5 = new int [] {3, 10, 20};	// 배열 타입
		Object obj6 = new Book();				// 내가 만든 타입
		Object obj7 = obj6;
		// Object 타입은 자바의 최상위 클래스로 모든 타입을 참조할 수 있음 -> 업캐스팅 
		
		// [2] Object 클래스의 메소드
		
		// 1) toString : 인스턴스의 참조(주소)값을 16진수로 반환
		System.out.println(obj6.toString());
		
		// 2) equals : 두 인스턴스가 동일한지 여부를 반환
		System.out.println(obj1 == obj2);	// 스택 메모리 값 비교 
		System.out.println(obj7 == obj6);   // 스택 메모리 값 비교
											// 스택 메모리 : 함수내 선언된 변수 / 지역변수 
		System.out.println(obj1.equals(obj2));	// 힙 메모리 값 비교
		System.out.println(obj7.equals(obj6));	// 힙 메모리 값 비교
												// 힙 메모리 : 멤버변수
		
		// 3) hashCode : 인스턴스의 해시코드 값을 반환 -> 인스턴스의 주소값을 정수로 반환
		System.out.println(obj1.hashCode()); // 523429237 출력 :객체의 위치를 정수로 표현한 값(해시코드) 
		System.out.println(obj6.hashCode()); // 1392838282 출력
		System.out.println(obj7.hashCode()); // 1392838282 출력
											 // obj6 == obj7
	}
}
