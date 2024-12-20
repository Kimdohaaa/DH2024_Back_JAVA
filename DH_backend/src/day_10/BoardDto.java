package day_10;
// DTO
public class BoardDto{
	// 멤버변수
	private String title;
	private String content;
	private String writer;
	
	// 생성자
	// 1) 디폴트 생성자
	BoardDto(){};
	// 2) 풀매개변수 생성자
	BoardDto(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// 메소드
	// 1) get() 메소드 : private 값 호출
	public String getTitle() {
		return title;
	}
	// 2) set() 메소드 : private 값 저장
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// toString() 메소드 : 기본 출력(주소 / 참조값) -> 원하는 값으로 오버라이딩(재정의)하는 메소드
	@Override
	public String toString() {
		return "BoardDto [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}


