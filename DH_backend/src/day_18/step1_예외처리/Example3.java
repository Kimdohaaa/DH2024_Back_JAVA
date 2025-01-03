package day_18.step1_예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


// 예외처리방법_1 : try ~ catch
// 예외처리방법_2 : throws (예외던지기)
public class Example3  {
	
	// [1] 메소드 내부의 예외를 호출했던 곳으로 예외 던지기
		// 예외 던지기 : 접근제한자 반환타입 메소드명 (타입 매개변수) throws 예외클래스명 { }
	public static Class LoadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName); // throws x 시 -> 일반 예외 발생
		Class c = Class.forName(className); // throws x 시 -> 일반 예외 발생
		
		return c;
	}
	
	// [2] 메소드 내부의 예외를 호출했던 곳으로 예외 던지기
	public static void method() throws NullPointerException{
		String str = null;
		System.out.println(str); // 예측 : NullPointerException 발생 (null 은 참조할 수 없기 때문)
	}
	
	// LoadClass() 와 method() 는 static 으로 메모리를 우선 할당 받는다. -> 인스턴스를 생성하지 않아도 사용할 수 있다.(static 으로 이미 실체가 존재하기 때문)
	
	public static void main(String[] args) {
		
		// [1] 예외처리
		try {
			// 메소드 호출 -> 호출한 메소드가 throws 를 이용하여 메소드 내부에 발생한 예외를 반환함
			LoadClass("a.txt", "java.lang.String"); // throws O 시 -> 일반 예외 발생 
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		
		// [2] 예외처리
		try {
			// 메소드 호출 -> 호출한 메소드가 throws 를 이용하고 메소드 내부에 발생한 예외를 반환함
			method();
		}catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
