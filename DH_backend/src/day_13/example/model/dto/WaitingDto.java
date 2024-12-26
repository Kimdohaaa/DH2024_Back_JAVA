package day_13.example.model.dto;

public class WaitingDto {
	// 멤버변수
	private String tel;
	private int count;
	
	// 생성자
	public WaitingDto(){}
	public WaitingDto(String tel , int count){
		this.tel = tel;
		this.count = count;
	}
	
	// getter , setter
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
