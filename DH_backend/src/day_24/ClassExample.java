package day_24;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.sun.jdi.Method;

public class ClassExample {
	public static void main(String[] args) {
		
		// [2] Class 클래스 
		
		// 해당 변수 / 타입 / 인스턴스 타입을 JVM 으로 가져오는 방법 
		// 1) getClass 
		String s = new String();
		Class c = s.getClass();
		System.out.println(c); // class java.lang.String 출력 -> c(인스턴스)가 참조하는 클래스 반환
		
		Integer i = 3;
		Class c1 = i.getClass();
		System.out.println(c1); // class java.lang.Integer 출력 -> c1(인스턴스)가 참조하는 클래스 반환
		
		// 2) Class
		Class c2 = String.class;
		System.out.println(c2);
		
		// 3) forName ★ 사용 시 예외처리 필수
		try {
			Class.forName("java.lang.String");
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		// 클래스 정보 반환 함수
		// 1) getFields
		Field[] fields = c.getFields();
		for(int index = 0 ; index < fields.length ; index++) {
			System.out.println(fields[index]);
		}

		Constructor[] constructors = c.getConstructors();
		for(int index = 0; index <= constructors.length ; i++) {
			System.out.println(constructors[index]);
		}
		
		Method[] methods = c.getMethods();
		for(int index = 0; index < methods.length; index++) {
			System.out.println(methods[index]);
		}
		
	}
	

}
