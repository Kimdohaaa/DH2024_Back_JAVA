package day_12;
class Person{ // class s
	// 멤버변수
	String name;
	int age;
	
	// 생성자
	// 1) 디폴트 생성자(매개변수 X)
	Person(){ 
		this("이름없음", 1); // 14 행 생성자에게 인수값 전달
	};
	
	// 2) 사용자 정의 생성자 (매개변수 O)
	Person(String name, int age){ // 9 행에서 매개변수로 전달받은 "이름없음" / 1 
		this.name = name; 
		this.age= age;    
		// this 는 현재 생성자르 호출한 인스턴스의 멤버변수를 가리킴
		// this.name -> 인스턴스의 멤버변수를 가리킴
		// name -> 매개변수를 가리킴
	}
	
	// 메소드
	
} // class e
public class Example2 { // class s
	public static void main(String[] args) { // main s
		Person noName = new Person();
		
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person yesName = new Person("유재석" , 40);
		System.out.println(yesName.name);
		System.out.println(yesName.age);
		
	} // main e
} // class e

// 클래스 -> Person() / Example2
// 객체(인스턴스) -> noName / yesName
// 할당된 멤버변수 -> 객체 당 2개 => 총 4개

// this.멤버변수 -> 인스턴스의 멤버변수를 가리킴
// this() -> 인스턴스의 생성자를 가리킴
// this -> 인스턴스의 참조값을 가리킴





