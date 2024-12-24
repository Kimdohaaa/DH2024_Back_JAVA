package day_11;

public abstract class Member {
	private String id;
	private String pw;
	private Boolean state;
	
	Member(){}
	Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	Member(Boolean state){
		this.state = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	
	
}
