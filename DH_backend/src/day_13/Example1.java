package day_13;

public class Example1 {
	public static void main(String[] args) {
		
		// 4 단계 : 싱글톤 호출
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1); // 출력 : day_13.Company@5305068a
		System.out.println(myCompany2); // 출력 : day_13.Company@5305068a
		// 두 변수가 참조하는 객체는 동일한 객체(싱글톤)이다.
	
		// 참고 1
		// Company myCompany3 = new Company(); // -> 오류 : 생성자가 private 이기 때문에 접근 불가

		// 참고 2 : 싱글톤을 사용하는 객체의 메소드 호출  
		// -> 참조(Company 클래스 -> getInstance() 메소드 -> (싱글톤)instance 반환 -> method() 메소드)를 통해  접근 
		Company.getInstance().method();
	}
}	
