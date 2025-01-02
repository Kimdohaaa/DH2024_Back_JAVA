package day_17.step4;

public class CustomerTest {

	public static void main(String[] args) {
		// customer 인스턴스 생성
		Customer customer = new Customer()	;
		
		// customer -형 변환-> Buy
		Buy buyer = customer;
		buyer.buy(); 
		/* Buy 인터페이스 의 buy() 메소드는 추상 메소드로 실체가 없고 
		   문법 상 오버라이드된 메소드가 최우선 순위이기때문에 Customer 클래스의 Buy() 메소드가 호출됨 */

		// customer -형변환-> Sell
		Sell seller = customer;
		seller.sell();
		/* Sell 인터페이스 의 sell() 메소드는 추상 메소드로 실체가 없고 
		   문법 상 오버라이드된 메소드가 최우선 순위이기때문에 Customer 클래스의 sell() 메소드가 호출됨 */

		
		// instanceof : 변수가 참조하는 인스턴스의 타입 조회
		if(seller instanceof Customer) { // 만약 seller 변수가 Customer 타입을 참조하고 있다면
			Customer customer2 = (Customer) seller; // seller -강제형변환-> Customer
			customer2.buy();
			customer2.sell();
		}
	}

}
