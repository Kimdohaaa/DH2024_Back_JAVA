package studentservice.model.dto;

public class ScoreDto {
	private int sno;
	private int kSco;
	private int eSco;
	private int mSco;
	private int num;
	
	public ScoreDto(int sno, int kSco, int eSco, int mSco , int num) {
		super();
		this.sno = sno;
		this.kSco = kSco;
		this.eSco = eSco;
		this.mSco = mSco;
		this.num = num;
	}
	
	
	public ScoreDto(int kSco, int eSco, int mSco) {
		super();
		this.kSco = kSco;
		this.eSco = eSco;
		this.mSco = mSco;
	}


	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getkSco() {
		return kSco;
	}
	public void setkSco(int kSco) {
		this.kSco = kSco;
	}
	public int geteSco() {
		return eSco;
	}
	public void seteSco(int eSco) {
		this.eSco = eSco;
	}
	public int getmSco() {
		return mSco;
	}
	public void setmSco(int mSco) {
		this.mSco = mSco;
	}
	
	
}
