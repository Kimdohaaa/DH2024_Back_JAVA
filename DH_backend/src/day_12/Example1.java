package day_12;

// 하나의 .java 파일에 1개 이상의 클래스를 생성할 수 있다.

//객체(인스턴스)를 생성하기 위한 객체 설계도 클래스
class BirthDay{ // class s
	
	// 1. 멤버변수 -> 모든 객체(인스턴스)가 각각 사용하는 변수 => 힙메모리사용
	int day;
	int month;
	int year;
	// ★ 멤버변수는 객체가 각각 자기만의 속성을 갖기 때문에 this 키워드를 사용할 필요 X
	
	// 2. 생성자
	
	// 3. 메소드 -> 모든 객체(인스턴스)가 공동으로 사용하는 함수 => 정적(static)메모리 사용 
	public void setYear(int year) {
		this.year = year;	// this 는 해당 메소드를 호출하는 인스턴스를 가리킴 -> 34행 37행
	}
	
	public void printThis() {
		System.out.println(this);
	}
	// ★ 메소드는 여러 객체가 공동으로 사용하기 때문에 this 키워드를 사용
	
} // class e

//main 함수를 갖는 실행 클래스
public class Example1 { // class s
	public static void main(String[] args) {
		
		// 1. 인스턴스 생성 -> 객체를 구현하기 위해 설계도(클래스)에 메모리 할당 => 실체화
		BirthDay dDay = new BirthDay();
		
		// 2. 인스턴스가 메소드를 호출
		dDay.printThis(); // -> 주소값 출력 : day_12.BirthDay@5305068a
		
		BirthDay dDay2 = new BirthDay();
		dDay2.printThis(); // -> 주소값 출력 : day_12.BirthDay@1f32e575
		// ★ dDay 주소값 != dDay2 주소값
		
		// 3. 인스턴스의 멤버변수 값 대입
		dDay.setYear(2000);
		System.out.println(dDay.year); // -> 2000 출력
		
		dDay2.setYear(2024);
		System.out.println(dDay2.year); // -> 2024 출력
	
	}
} // class e

// 클래스 -> BirthDay / Example
// 인스턴스 -> dDay / dDay2
// 할당된 멤버변수 -> 인스턴스 당 3개 => 총 6개
// 메소드 -> setYear / printThis

