package day_10;
// DTO(Date Transfer Object ) : 데이터 이동 객체 -> 여러 사람이 작업 시 클래스명에 공통적으로 DTO를 명시함으로써 클래스의 사용처 파악
public class BoardDto {
	
	// 관례적인 기본 형식
	
	// 1. 멤버변수 : private
	private String title;
	private String content;
	private String writer;
	
	// 2. 생성자 : 디폴트 생성자 / 풀매개변수 생성자 / 설계에 따라 생성자 추가 선언
	// 1) 디폴트 생성자
	public BoardDto() {}
	// 2) 풀매개변수 생성자
	public BoardDto(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// 3. 메소드 : 멤버변수 마다 getter / setter 생성 / toString  생성
	// private 멤버변수는 외부 클래스로부터 차단했으므로 간접적으로 접근할 수 있도록 public 메소드 제공
	// 1) get() : 호출
	public String getTitle() {
		return this.title;
	}
	// 2) set() : 저장
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	public  void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return this.writer = writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// 기본적으로 객체 호출 시 주소 / 참조값이 반환되기 때문에 오버라이딩(재정의)을 통해 참조값 대신 원하는 반환값을 출력하도록 만드는 메소드
	@Override
	public String toString() {
		return "BoardDto [title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
