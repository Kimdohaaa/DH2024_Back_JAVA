package day_12;

class ManagerDto {
	// 멤버 변수
	private String id;
	private String pw;
	private int managerNo;
	
	// 생성자
	ManagerDto(){}
	ManagerDto(String id, String pw, int mangerNo){
		this.id = id;
		this.pw = pw;
		this.managerNo = mangerNo;
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
	public int getManagerNo() {
		return managerNo;
	}
	public void setManagerNo(int managerNo) {
		this.managerNo = managerNo;
	}	
}

class BookDto{
	// 멤버변수
	private int bookNo;
	private String title;
	private int count;
	
	// 생성자
	BookDto(){}
	BookDto(int bookNo, String title, int count){
		this.bookNo = bookNo;
		this.title = title;
		this.count = count;
	}
	
	// 메소드
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}