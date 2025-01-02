package day_17.step2;

public class Example2 {

	public static void main(String[] args) {
		// 1. 인터페이스 타입의 변수 생성
		키보드 myKeyBoard;
		
		// 2. 구현체(인터페이스의 추상메소드를 구현한 객체)
			// 사냥 게임해야징 -> 키보드 사냥게임 연결
		myKeyBoard = new 사냥게임();
		myKeyBoard.akey(); // "공격" 출력 
		myKeyBoard.bkey(); // "방어" 출력
			
			// 이제 축구 게임 해야징(= 타입 변환) -> 키보드 축구게임 연결
		myKeyBoard = new 축구게임();
		myKeyBoard.akey(); // "슛팅" 출력
		myKeyBoard.bkey(); // "패스" 출력
		
		
		// 참고 : 키보드 타입이 없어도 게임타입으로 실행 가능은 함
		사냥게임 게임1 = new 사냥게임();
		게임1.akey();
		게임1.bkey();
		
		// 게임1 = new 축구게임(); // 오류 : 게임1 변수는 사냥게임타입의 인스턴스이기 때문에 축구게임타입으로 실행 불가
								// 		-> 인터페이스 사용 시 사냥게임 클래스와 축구게임 클래스 모두 키보드 인터페이스를 구현하기 때문에 각 클래스에서 구체화한 메소드 사용 가능		
	}

}
