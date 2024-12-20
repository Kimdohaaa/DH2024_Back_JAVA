package day_10;

public class Example3 {
	public static void main(String[] args) {
	// DTO
		
		// DTO 객체 생성
		BoardDto board = new BoardDto();
		
		// private 멤버변수에 접근해 값을 저장하기 위해 setTitle 메소드 사용
		board.setTitle("안녕하세요.");
		
		// private 멤버변수에 접근해 값을 출력 위해 getTitle 메소드 사용
		System.out.println(board.getTitle());

		// BoardDto 클래스 내에 toString 메소드를 오버라이딩했기 때문에 주소값이 아닌 toString() 메소드의 return 값 출력 
		System.out.println(board);
	}
}
