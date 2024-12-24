package day_12;

class Member{
	
	// 멤버변수
	String name;
	static int age;
	
	// 생성자
	
	// 메소드
	boolean getAge() {
		return true;
	}
	static int getName() {
		return 10;
	}
}

public class Example4 {

	// ★ main 함수 -> static 메소드 (=정적메소드)
	public static void main(String[] args) {
		// 1) main 함수 내에서 동일 클래스 동적 메소드  호출
		// signUp()  // -> 호출 불가 =>	main 함수는 static 으로 우선 할당되기 때문에 signUp() 함수의 존재여부를 알 수 없음
		Example4 example4 = new Example4(); // 메소드 호출을 위해 인스턴스 생성
		example4.signUp(); // -> 인스턴스를 통해 호출 가능
		
		// 2) main 함수 내에서 동일 클래스 정적 메소드 호출
		login();	 // -> 호출 가능 => login() 함수도 static 으로 우선 할당되기 때문
	}
	
	void signUp() { // 일반 메소드 (=동적메소드)
		
		// 3) 동적 메소드 내에서 동일 클래스 동적 메소드 호출
		myInfo(); // -> 호출 가능
		
		// 4) 동적 메소드 내에서 다른 클래스 메소드 호출
		// getAge(); // -> 호출 불가
		Member member = new Member(); // 메소드 호출을 위해 인스턴스 생성
		member.getName(); // -> 인스턴스를 통해 호출 가능
	
	}
	void myInfo() {
		
	}
	static void login() { // static 메소드(=정적메소드)
		
	}

}

/*
★ main 메소드는 static 메소드(=정적 메소드)
1. 정적 메소드 내에서 동일 클래스의 동적 메소드 호출 
 	-> 메소드 호출을 위한 인스턴스 생성 후 메소드 호출 가능
2. 정적 메소드 내에서 동일 클래스 정적 메소드 호출
  	-> 인스턴스 없이 함수명으로 호출 가능
3. 동적 메소드 내에서 동일 클래스의 동적 메소드 호출
	-> 인스턴스 없이 함수명으로 호출 가능
4. 동적 메소드 내에서 다른 클래스의 메소드 호출
	-> 메소드 호출을 위한 인스턴스 생성 후 메소드 호출 가능
*/

/*
[함수 호출 판단]
1. 호출하고자 하는 메소드가 동일 클래스 or 다른 클래스
2. 호출하고자 하는 메소드가 동적 메소드 or 정적 메소드
3. 함수를 호출하고자 하는 현재 위치의 메소드가 동적 메소드 or 정적 메소드
---------------------------------------------------------
★ static X (=동적메소드) -> 객체를 통해 호출
★ static O (=정적메소드) -> 클래스를 통해 호출
*/
 