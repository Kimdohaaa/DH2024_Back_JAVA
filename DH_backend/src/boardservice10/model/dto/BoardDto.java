package boardservice10.model.dto;

public class BoardDto {
	private int bno;
	private String bTitle;
	private String bContent;
	private int bView;
	private String bDate;
	private int mno;
	private int cno;
	
	private String mid;
	private String cname;
	
	public BoardDto() {}

	public BoardDto(int bno, String bTitle, String bContent, int bView, String bDate, int mno, int cno) {
		super();
		this.bno = bno;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bView = bView;
		this.bDate = bDate;
		this.mno = mno;
		this.cno = cno;
	}
	

	public BoardDto(int bno, String bTitle, String bContent, int bView, String bDate, int cno) {
		super();
		this.bno = bno;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bView = bView;
		this.bDate = bDate;
		this.cno = cno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public int getbView() {
		return bView;
	}

	public void setbView(int bView) {
		this.bView = bView;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bView=" + bView
				+ ", bDate=" + bDate + ", mno=" + mno + ", cno=" + cno + "]";
	}


	
	
}
