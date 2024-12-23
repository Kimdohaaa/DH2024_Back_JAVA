package day_11;
// 게시물 정보를 갖는 객체의 설계 클래스
public class BoardDto {
	// 멤버변수 -> 접근제한자 / 객체 속성
	private String title;
	private String content;
	private String writer;
	
	// 생성자 -> 객체 생성시 초기화
	// 1) 디폴트 생성자
	public BoardDto() {}
	// 2) 생성자(매개변수 3개)
	public BoardDto(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// 메소드 -> getter / setter : private 멤버변수를 다른 클래스로부터 간접 접근 제공 함수
	// getter : 호출
	// setter : 저장
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
}
