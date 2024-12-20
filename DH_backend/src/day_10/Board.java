package day_10;

public class Board {
	// 멤버변수
	String title;
	String content;
	String writer;
	
	// 디폴트 생성자
	Board (){};
	// 사용자 지정 생성자
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
		// this 키워드로 객체 자신을 가리키고 있음을 알려줌 -> 동일한 이름이지만 컴파일러가 식별 가능
	}
	
	// ---> 오버로드 : 동일한 이름의 생성자를 선언(매개변수의 개수 / 타입 / 순서 가 다를 경우만 가능)
}
