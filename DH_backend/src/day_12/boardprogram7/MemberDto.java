package day_12.boardprogram7;

public class MemberDto {
	// 멤버함수
	private String id;
	private String pwd;
	private String name;
	
	// 생성자
	MemberDto(){}
	MemberDto(String id, String pwd, String name){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	// getter / setter 메소드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPw(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
