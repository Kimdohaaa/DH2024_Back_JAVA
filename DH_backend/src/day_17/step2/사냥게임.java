package day_17.step2;

// 키보드 인터페이스를 사냥게임 클래스가 구현
	// class 클래스명 implements 인터페이스명{	}	
public class 사냥게임 implements 키보드{
	// 추상 메소드 구현 -> 오버라이딩
	@Override
	public void akey() {
		System.out.println(">> 공격");
	}
	@Override
	public void bkey() {
		System.out.println(">> 방어");
	}
}
