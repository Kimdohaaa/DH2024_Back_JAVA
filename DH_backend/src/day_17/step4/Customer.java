package day_17.step4;

// 참고 
// 상속 : extends 클래스명{	  }	 -> 상속의 경우 클래스 1 개당 상속 1 번만 가능
// 구현 : implements 인터페이스명{	} -> 구현의 경우 클래스 1 개당 여러 개의 인터페이스 구현 가능
public class Customer implements Buy, Sell 	{ // 인터페이스 다중 구현
	// 구현부 -> 인터페이스의 추상메소드 오버라이딩
	@Override
	public void buy() {
		System.out.println(">> 구매 하기");
	}
	@Override
	public void sell() {
		System.out.println(">> 판매 하기");
	}
}
