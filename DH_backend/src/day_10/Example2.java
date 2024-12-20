package day_10;

public class Example2 {

	public static void main(String[] args) {
		// 캡슐화
		
		MyDate date = new MyDate();
		// MyDate 클래스에서 멤버변수가 private 으로 지정되어있기 때문에 호출 불가
		//date.month = 2;
		//date.day= 31;
		//date.year = 2018;
	
		date.setDay(31);
		date.setDay(25);
	}

}
