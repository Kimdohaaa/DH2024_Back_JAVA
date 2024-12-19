package day_9;

public class Person {
	// 생성자
	
	String name;
	float height;
	float weight;
	
	// 디폴트 생성자
	Person() {}
	
	// 사용자 지정 생성자 
	Person(String pname){ // Example3 에서 인수로 보낸 "유재석"을 매개변수로 받음
		name = pname;
						  // 생성자는 반환값이 없다.
	}
	
	
	// 예제 p . 157
	// 관례적으로 클래스의 멤버변수명과 생성자의 매개변수명은 동일하게 작성 -> 컴파일러가 식별불가 -> this 키워드 사용 : 현재 객체가 멤버변수를 가리킬 때 사용
	Person(String name, float height, float weight){	// 이름 , 키 , 몸무게 값을 받는 매개변수 선언
		this.name = name;
		this.height = height;
		this.weight = weight;		
	}
	
	// 오버로드 : 동일한 명의 생성자를 여러 개 만드는 것 -> 매개변수의 개수 / 자료형 / 순서가 다르기 때문에 컴파일러 식별 가능 (동일할 경우 오버로드 불가)
}
