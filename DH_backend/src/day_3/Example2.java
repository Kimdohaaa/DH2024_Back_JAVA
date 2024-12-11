package day_3;

import java.sql.ShardingKey;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class Example2 {

	public static void main(String[] args) {
		// 연산자 예제 p. 88 
		// 1번
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		// 2번
		int num2;
		num2 = -5 + 3 *10 / 2;
		System.out.println(num2); // 10 출력
		
		// 3번
		int num3 = 10;
		
		System.out.println(num3); // 10 출력
		System.out.println(num3++); // 10 출력
		System.out.println(num3); // 11 출력
		System.out.println(--num3); // 10 출력
		
		// 4번
		int num4_1 = 10;
		int num4_2 = 20;
		boolean result1;
		
		result1 = ((num4_1 > 10) && (num4_2 > 10)); // false
		result1 = ((num4_1 > 10) || (num4_2 > 10)); // true
		System.out.println(!result1); // false
		
		// 6번
		int num6 = 8;
		
		System.out.println(num6 += 10); // 18 출력
		System.out.println(num6 -= 10); // 8 출력
		
		// 7번
		int num7_1 = 10;
		int num7_2 = 20;
		
		int result2 = (num7_1 >= 10) ? num7_1 + 10 : num7_2 - 10;
		System.out.println(result2); // 30 출력
		
	}

}
