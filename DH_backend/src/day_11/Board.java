package day_11;

public class Board {
	// 멤버변수 -> 접근제한자 / 객체 속성
	private String title;
	private String content;

	// 생성자 -> 객체 생성시 초기화
	// 1) 디폴트 생성자
	public Board() {}
	// 2) 생성자(매개변수 3개)
	public Board(String title, String content) {
		this.title = title;
		this.content = content;

	}
	
	// 메소드 -> getter / setter : private 멤버변수를 다른 클래스로부터 간접 접근 제공 함수
	// getter : 호출
	// setter : 저장
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	
}
