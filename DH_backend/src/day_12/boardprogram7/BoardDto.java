package day_12.boardprogram7;

public class BoardDto {
	// 멤버함수
	private String title;
	private String content;
	
	// 생성자
	BoardDto(){}
	BoardDto(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	// getter / setter 메소드
	public String getTitle() {
		return this.title;
	}
	public String getContent() {
		return this.content;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
