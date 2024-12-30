package day_15.step2;
// 1. 동물클래스
class 동물{
	// 멤버변수
	String myName;
	
	// 생성자
	동물(){
		myName = "동물";
		System.out.println(">> 동물 생성자 탄생");
	}
	
	void showMe() {
		System.out.println(">> myName : " + this.myName);
	}
}

// 2. 조류 클래스 -> 동물 클래스로부터 상속 받기
class 조류 extends 동물{
	// 생성자
	조류(){
		myName = "조류";
		System.out.println(">> 조류 생성자 탄생");
	}
}

// 3. 참새 클래스 -> 조류 클래스로부터 상속 받기
class 참새 extends 조류{
	참새(){
		myName = "참새";
		System.out.println(">> 참새 생성자 탄생");
	}
}

// 4. 닭 클래스 -> 조류 클래스로부터 상속 받기
class 닭 extends 조류{
	닭(){
		myName = "닭";
		System.out.println(">> 닭 생성자 탄생");
	}
}
public class Example1 {
	public static void main(String[] args) {
		// 1. 동물 인스턴스 생성 ★ 생성된 인스터스 : 2개(Object / animal)
		동물 animal = new 동물(); // 생성자 실행 -> ">> 동물 생성자 실행" 출력
		animal.showMe(); // 메소드 실행 -> ">> myName : 동물" 출력
		
		// 2. 조류 인스턴스 생성 -> 하위클래스 인스터스 생성시 상위클래스의 인스턴스도 같이 생성됨 ★ 생성된 인스턴스 : 3 개(Object / animal / bird)
		조류 bird = new 조류();	// 동물 class 생성자 실행 : ">> 동물 생성자 실행" 출력
								// 조류 class 생성자 실행 : ">> 조류 생성자 실행" 출력
		bird.showMe();			// 동물 클래스의 메소드 실행 : ">> myName : "조류" 출력
		
		// 3. 참새 인스턴스 생성 -> 하위클래스 인스터스 생성시 상위클래스의 인스턴스도 같이 생성됨 ★ 생성된 인스턴스 : 4 개(Object / animal / bird / sparrow)
		참새 sparrow = new 참새(); // 동물 class 생성자 실행 : ">> 동물 생성자 실행" 출력
								 // 조류 class 생성자 실행 : ">> 조류 생성자 실행" 출력
								 // 참새 class 생성자 실행 : ">> 참새 생성자 실행" 출력
		sparrow.showMe();		 // 동물 클래스의 메소드 실행 : ">> myName : "참새" 출력
		
		
		// ★★★ 하위 클래스 생성자를 호출하면 상위클래스의 생성자가 호출된다. ★★★ // 
		
		
		// 타입변환 -> 하위 클래스의 인스턴스 생성 시 상위 클래스의 인스턴스도 같이 생성되기 때문에 하위클래스를 상위클래스로 형변환 가능
		// 1. 하위클래스 - 형변환 -> 상위클래스 => 가능(자식 객체는 부모 타입을 참조하기 때문)
		조류 bird2 = sparrow; // 참새 타입의 객체가 조류타입으로 변환된다. -> 자동타입변환
		동물 animal2 = sparrow; // 참새 타입의 객체가 동물타입으로 변환된다. -> 자동타입변환
		Object obj2 = sparrow; // 참새 타입의 객체가 Object 타입으로 변환된다. -> 자동타입변환
		
		// 2. 상위클래스 - 형변환 -> 하위클래스 => 불가(부모 타입의 객체는 자식타입을 참조하지 않기 때문)
		// 참새 sparrow2 = animal;  // 동물 타입의 객체를 참새 타입으로 변환 불가
		// 조류 bird3 = animal; // 동물 타입의 객체를 조류 타입으로 변환 불가
	
		// 3. 상위클래스 -> 하위클래스로 캐스팅(형변환)이 가능한 경우 => 다운캐스팅 : 부모타입의 객체는 자식 타입으로 변환이 될 수 없지만 본래 자식 타입의 객체였다면 변환 가능
		동물 animal3 = sparrow; // 참새 타입의 객체를 동물 타입으로 변환
		참새 sparrow4 = (참새)animal3; // 동물 타입 객체를 참새타입으로 변환가능(객체가 본래 자식 타입이었기 때문)
		
		// 4. 형제 간의 타입변환은 불가하다.
		// 닭 인스턴스 생성 -> 생성된 인스턴스 : 4개(Object / animal / bird / sparrow)
		닭 chicken = new 닭(); 
		// 참새 sparrow5 = (참새)chicken; // 변환 불가 -> 닭 객체는 참새 객체를 참조하고 있지 않기 때문
	}
}
