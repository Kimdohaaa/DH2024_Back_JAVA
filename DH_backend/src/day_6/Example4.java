package day_6;

public class Example4 {
	
	public static void main(String[] args) {
		// 클래스는 설계도 일 뿐 실질적인 메모리 역할을 하지않음 

		// 1. 클래스 정의하기 (객체를 만들기 위한 설계도 만들기)
		// ---> 붕어빵틀 클래스에서 붕어빵틀 클래스를 생성함
		
		// 2. 객체 생성 : 클래스 기반으로 메모리 할당 => 인스턴스
		// 			  - 형식 : new 클래스명(); / 쿨래스명 변수명 = new 클래스명(); -> 주로 사용
		
		// 생성자
		new 붕어빵틀();
		new 붕어빵틀(); // 붕어빵틀 -> 1개 / 붕어빵 -> 2개 생성
		
		// 생성한 붕어빵을 변수에 담기
		붕어빵틀 붕어빵1 = new 붕어빵틀();
		붕어빵틀 붕어빵2 = new 붕어빵틀();
		
		// 객체 멤버에 접근하기 : .(접근연산자)사용
		붕어빵1.내용물 = "슈크림";
		붕어빵2.내용물 = "팥";

		
		// 1. 클래스 정의하기
		// ---> 자동차 클래스에서 Car 클래스를 생성함
		
		// 2. 객체 생성
		// 주의점 . 객체 생성 후 변수에 대입하지 않으면 사라짐
		new Car();
		Car car1 = new Car(); // 주의점을 방지하기 위해 주로 객체 생성과 동시에 변수에 담는다 (변수타입은 객체의 클래스명으로 지정)
		Car car2 = new Car();
		
		// 객체 멤버 접근 
		car1.차량주 = "유재석";
		car2.차량주 = "강호동"; // 동일한 클래스로 서로 다른 객체 2개 생성
		
		
		
	}

}
