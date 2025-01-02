package day_17.step2;

// 키보드를 인터페이스로 사용하는 이유 -> 여러 프로그램(클래스) 들을 조작하기 위해서
public interface 키보드 {
	// 상수
	public static final String 제조사 = "HP";
	String 제조일 = "2025-01-02"; // public static final 생략 가능
	
	// 추상메소드
	public abstract void akey();
	void bkey(); // public abstract 생략 가능
}
