package day_17.step2;

public class 축구게임 implements 키보드 {
	// 추상메소드 구현 (=오버라이딩)
	@Override
	public void akey() {
		System.out.println(">> 슛팅");
	}
	@Override
	public void bkey() {
		System.out.println(">> 패스");
	}
}
