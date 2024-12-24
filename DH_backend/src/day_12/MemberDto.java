package day_12;

public class MemberDto {
	// 멤버변수
	private String id;
	private String pw;
	private String[] rentalArr;
	
	// 생성자
	MemberDto(){}
	MemberDto(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	MemberDto(String[] rentalArr){
		
		this.rentalArr = rentalArr;
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
	public String[] getRentalArr() {
		return rentalArr;
	}
	public void setRentalArr(String[] rentalArr) {
		this.rentalArr = rentalArr;
	}
	
	public String rental(String[] rentalArr) {
		String index = null;
		for(int i = 0; i < rentalArr.length; i++) {
			if(rentalArr[i] == null) {
				rentalArr[i] = index;
			}
		}
		return index;
	}
	

}
