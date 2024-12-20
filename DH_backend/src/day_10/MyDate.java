package day_10;
// 캡슐화
public class MyDate {
	// 멤버변수
	private int day;
	private int month;
	private int year;
	
	// 메소드
	// 유효성 검사 : month 가 2 일 때 day 값을 유효범위 외로 선언하면 오류
	public void setDay(int day) {
		if(month == 2) {
			if(day <1 || day >28) {
				System.out.println("오류입니다.");
			}else {
				this.day = day;
			}
		}
	}
}
