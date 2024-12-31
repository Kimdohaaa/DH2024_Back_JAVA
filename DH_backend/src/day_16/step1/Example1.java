package day_16.step1;

import java.util.Scanner;

// 부모클래스 : Object | 자식클래스 : B,C | 자손클래스 : D,E
class A{}

// 부모클래스 : A | 자식클래스 : D | 형제클래스 : C
class B extends A{}

// 부모클래스 : A | 자식 클래스 : E | 형제클래스 : B
class C extends A{}

// 부모클래스 : B 
class D extends B{}

// 부모클래스 : C
class E extends C{}

public class Example1 {
	public static void main(String[] args) {
		
		// B 클래스의 인스턴스 생성
		B b = new B(); // B 인스턴스 -> A 인스턴스 -> Object 인스턴스
		// C 클래스의 인스턴스 생성
		C c = new C(); // C 인스턴스 -> A 인스턴스 -> Object 인스턴스
		// D 클래스의 인스턴스 생성
		D d = new D(); // D 인스턴스 -> B 인스턴스 -> A 인스턴스 -> Object 인스턴스
		// E 클래스의 인스턴스 생성
		E e = new E(); // E 인스턴스 -> C 인스턴스 -> A 인스턴스 -> Object 인스턴스
		
		// 1. 자동 타입 변환 (업 캐스팅)
		A a1 = b;	// B 타입의 인스턴스는 A 타입으로 자동 형변환 가능
		A a2 = c;	// C 타입의 인스턴스는 A 타입으로 자동 형변환 가능
		A a3 = d;	// D 타입의 인스턴스는 A 타입으로 자동 형변환 가능
		A a4 = e;	// E 타입의 인스턴스는 A 타입으로 자동 형변환 가능
		
		B b1 = b;
		B b3 = d;
		// B b2 = e; B b4 = e; // 오류 -> 형제 간의 타입 변환은 불가능
		C c2 =  c;
		C c4 = e;
		// C c1 = b;  C c3 = d; // 오류 -> 형제의 자손의 타입 변환은 불가능
	
		
		// 2. 강제 타입 변환 (다운 캐스팅)
		B b5 = (B)a1; // A 타입 -변환-> B 타입
		E e5 = (E)a4; // A 타입 -변환-> E 타입
		
		// E e6 = (E)a1; // A 타입 (a1 의 태생은 B) -변환-> E 타입 
		// -> 오류 : class day_16.step1.B cannot be cast to class day_16.step1.E
		// -> 변수(스택메모리)의 타입을 바꾸는 것일 뿐 인스턴스(힙메모리)의 태생 (주소값/리터럴)은 같기 때문에 오류 발생
		// D d6 = (D)a2; // A 타입(a2의 태생은 C) -변환-> D타입
		// 오류 -> class day_16.step1.C cannot be cast to class day_16.step1.D
		// -> 변수(스택메모리)의 타입을 바꾸는 것일 뿐 인스턴스(힙메모리)의 태생 (주소값/리터럴)은 같기 때문에 오류 발생

		// ★ 본래의 인스턴스(태생)를 확인하는 방법 : instanceof 키워드 ★
		System.out.println(a1 instanceof A ); // a1 변수가 참조하는 인스턴스에 A 타입 존재 -> true 출력
		System.out.println(a1 instanceof Object); // a1 변수가 참조하는 인스턴스에 Object 타입 존재 -> true 출력
		System.out.println(a1 instanceof C); // a1 변수가 참조하는 인스턴스에 C 타입 존재 X -> false 출력
		System.out.println(a4 instanceof B); // a4 변수가 참조하는 인스턴스에 B 타입 존재 X -> false 출력
		
	}
}