package day_16.step2;

// 부모클래스 : Object | 자식클래스 : 하위클래스
class 상위클래스 {
	// 멤버변수
	int value1 = 10;
	int value3 = 30;
	
	// 생성자
	public 상위클래스() {
		System.out.println(">> 상위클래스 인스턴스 생성");
	}
	
	// 메소드
	public void showSuperValue() {
		System.out.println(">> 상위클래스");
	}
}

// 부모클래스 : Object , 상위클래스
class 하위클래스 extends 상위클래스{
	// 멤버변수
	int value1 = 100;
	int value2 = 200;
	
	// 생성자
	public 하위클래스() {
		// super() 을 통해 생성자를 호출한 인스턴스의 상위 생성자를 가리킴 -> 디폴트 생성자 생략 가능
		super();
		System.out.println(">> 하위클래스 인스턴스 생성");
	}
		
	// 메소드
	public void showSubValue() {
		// this : 현재 생성자 / 메소드를 호출한 인스턴스의 멤버변수 / 메소드를 가리킴
		// super : 부모 클래스의 멤버변수 / 메소드를 가리킴
		System.out.println(">> 하위클래스 " + (this.value1) + " " +(super.value1));
	}
}
// 상속 시 부모클래스의 멤버변수와 메소드를 상속 받음
public class Example2 {

	public static void main(String[] args) {
		// 1-1. 상위 클래스 인스턴스 생성 //
		상위클래스 obj1 = new 상위클래스();
		
		// 1-2. 본인 인스턴스의 멤버변수 호출 가능 단] 하위 클래스의 멤버변수에는 접근 불가
		System.out.println(obj1.value1); 		

		
		// 2. 멤버변수 , 메소드 상속 //
		// 2-1. 하위 클래스 인스턴스 생성 
		하위클래스 obj2 = new 하위클래스();
		
		// 2-2 . 본인 인스턴스의 멤버변수에 접근
		// -> 만일 상위클래스와 하위클래스의 멤버변수가 같을 시 본인 클래스의 멤버변수가 우선순위
		System.out.println(obj2.value1); // 100 출력 -> 상위클래스의 값이 아닌 본인 클래스의 값 출력(태생이 우선)
		System.out.println(obj2.value2); // 200 출력 -> 본인 클래스의 멤버변수명에 해당되는 멤버변수가 없으면 상위클래스로 올라가 탐색
		// 2-3. 상위 클래스의 멤버변수에 접근 가능
		System.out.println(obj2.value3); // 30 출력 -> 본인 클래스의 멤버변수명에 해당되는 멤버변수가 없으면 상위클래스로 올라가 탐색
		
		// 2-4. 본인 인스턴스의 메소드에 접근
		obj2.showSubValue(); // ">> 하위클래스 100 10" 출력 -> this 키워드에 의해 본인 클래스의 100 출력 / super 키워드에 의해 부모클래스의 10 출력  
		// 2.5 상위 클래스의 메소드에 접근
		obj2.showSuperValue(); // ">> 상위클래스" 출력
		
		// 2-5. 하위 클래스 인스턴스 생성 //
		// -> obj2 와 obj3 의 인스턴스는 다름 => 각 인스턴스는 멤버변수 공유 X , 메소드 공유 O 
		// -> 멤버변수도 공유하려면 static 키워드를 사용하여 멤버변수를 선언해야 함
		하위클래스 obj3 = new 하위클래스(); 
		obj3.value1 = 300;
		obj3.showSubValue(); // ">> 하위클래스 300 10" 출력 -> obj3 인스턴스는 메소드에 있는 this 가 obj3 의 멤버변수 value1 을 가리킴 
							 // (obj2 인스턴스는 메소드의 this 가 obj2 의 멤버변수 value1 가리켜서 서로 다름 -> 멤버변수는 공유하지 않기 때문) 
		
		// 3. 생성자 상속 //
		하위클래스 obj4 = new 하위클래스(); // 생성자 실행 횟수 : 3번 (하위클래스 생성자 -> 상위클래스 생성자 -> Object 생성자)
									  // 인스턴스 개수 : 3개 (하위클래스 인스턴스 -> 상위클래스 인스턴스 -> Object 인스턴스)	
	}

}
