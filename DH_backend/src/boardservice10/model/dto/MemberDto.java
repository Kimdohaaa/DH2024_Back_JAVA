package boardservice10.model.dto;

public class MemberDto {
	// DTO : 서로 다른 레이어 (MVC패턴)들 간의 데이터를 이동하는 객체
	// VIEW (사용자) <--- DTO ---> DB
	// 주로 DB 테이블의 속성과 동일 + 커스텀 가능
	
	
	// [1] 멤버변수 : 객체가 가질 수 있는 고유한 값을 저장하는 속성명
	// 주로 DTO 에서는 멤버변수를 private 으로 지정
	private int mno;		// 회원 번호
	private String mid;		// 회원 아이디
	private String mpwd;	// 회원 비밀번호
	private String mname;	// 이름
	private String mphone;	// 연락처
	private String mdate;	// 가입일
	
	
	// [2] 생성자 
	// DTO의 기본적인 생성자 : 디폴트 / 풀
	public MemberDto(){}
	public MemberDto(int mno , String mid, String mpwd, String mname, String mphone, String mdate){
		super();
		this.mno = mno;
		this.mid = mid;
		this.mpwd = mpwd;
		this.mname = mname;
		this.mphone = mphone;
		this.mdate = mdate;
	}
	// 회원가입을 위한 생성자 
	public MemberDto(String mid, String mpwd, String mname, String mphone) {
		super();
		this.mid = mid;
		this.mpwd = mpwd;
		this.mname = mname;
		this.mphone = mphone;
	}
	// => 생성자 오버로딩 //
	
	
	// [3] 메소드 (getter / setter / toString)
	public int getMno() {
		return mno;
	}
	
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	
	// toString() : 객체 호출 시 참조(주소)값 대신 멤버변수 값을 반환하는 메소드 -> 객체 테스트 용도
	@Override
	public String toString() {
		return "MemberDto [mno=" + mno + ", mid=" + mid + ", mpwd=" + mpwd + ", mname=" + mname + ", mphone=" + mphone
				+ ", mdate=" + mdate + "]";
	}

}
