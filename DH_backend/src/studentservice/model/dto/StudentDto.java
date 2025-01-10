package studentservice.model.dto;

public class StudentDto {
	private int num;
	private String sName;
	
	
	public StudentDto() {}


	public StudentDto(int num, String sName) {
		super();
		this.num = num;
		this.sName = sName;
	}


	public StudentDto(String sName) {
		super();
		this.sName = sName;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}

	
}
