package day_3;

import java.sql.ShardingKey;

public class Example2 {

	public static void main(String[] args) {
		// 연산자 예제 p. 88
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
	}

}
