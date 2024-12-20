package day_09;

import day_09.Person;

public class Example3 {
	public static void main(String[] args) {
		// 생성자
		
		// 1. 객체(인스턴스) 생성하기
		
		// 1) new 연산자와 생성자 이용한 인스턴스 생서
		new Person();
		
		// 2) 생성된 인스턴스의 참조 / 주소 / 메모리위치 값을 변수에 대입
		// i. 디폴트 생성자 사용
		Person personLee = new Person();	// 디폴트 생성자이기 때문에 String 의 기본값인 null 값 으로 초기화 됨 
		personLee.name = "이정만";			// 기본값 null 로 초기화 된 Person.name 에 "이정만" 대입
		System.out.println(personLee.name);
		
		// ii. 사용자 지정 생성자 사용 (매개변수 1개)
		Person personKim = new Person("유재석");	// Person 클래스의 Person 생성자에 "유재석" 전달
		System.out.println(personKim.name);		// 생성자를 통해 Person.name을 "유재석"으로 초기화했기 때문에 "유재석" 출력
		
		// iii. 사용자 지정 생성자 사용 (매개변수 3개)
		Person personYou = new Person("유재석", 180.1f , 82.9f);
		System.out.println(personYou.name);
		System.out.println(personYou.height);
		System.out.println(personYou.weight);
		
	}
}
