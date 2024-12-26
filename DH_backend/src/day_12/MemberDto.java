package day_12;

class MemberDto {
	// 멤버변수
	private String id;
	private String pw;
	
	// 생성자
	MemberDto(){}
	MemberDto(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	// 메소드
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

	
}
class RentalArr{
	private String rentalArr;
	
	RentalArr(){};
	RentalArr(String rentalArr){
		this.rentalArr = rentalArr;
	}
	public String getRentalArr() {
		return rentalArr;
	}
	public void setRentalArr(String rentalArr) {
		this.rentalArr = rentalArr;
	}
	

}