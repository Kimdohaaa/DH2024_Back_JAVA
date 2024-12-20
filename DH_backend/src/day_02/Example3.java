package day_02;

public class Example3 {

	public static void main(String[] args) {
		// 콘솔 출력 함수
		System.out.println();
			// System : 시스템 관련 기능을 제공하는 클래스(설계도)
			// out : 출력 관련 객체를 반환함
			// . : 접근연산자
		
		// 1. println() : 인수 값을 console에 출력 후 줄바꿈 처리를 하는 함수
		System.out.println("JAVA1");
		System.out.println("JAVA2");
		// 2. print() : 인수값을 console에 줄바꿈하지 않고 출력하는 함수
		System.out.print("JAVA3");
		System.out.print("JAVA4");
		// 3. printf() : 인수 값에 형식문자를 이용하여 수식을 출력하는 함수
			/*
			형식문자 : printf() 함수에서 사용되는 의미가 담긴 문자
			1. %s : 문자열
			2. %c : 문자
			3. %d : 정수
			4. %f : 실수
			5. %자릿수d : 자릿수만큼 자릿수 차지 (만일 비어있으면 공백 처리) / 오른쪽 정렬
			6. %-자릿수d : 자릿수만큼 자릿수 차지 (만일 비어있으면 공백 처리) / 왼쪽 정렬
			7. %0자릿수d : 자릿수만큼 자릿수 차지 (만일 비어있으면 '0'처리) / 오른쪽 정렬
			8. %전체 자릿수.표현할 소수점 자릿수f : 자릿수만큼 자릿수 차지 / 소수점은 소수점자릿수 까지 차지
			*/
		// 형식 문자 예시
		System.out.printf("%s", "JAVA5");
		
		String name = "유재석";
		int age = 40;
		
		// 정수 자릿수 형식 문자 예시
		System.out.printf("저는 %s 이고 나이는 %d 입니다.\n", name, age);
		System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n", name , age);
		System.out.printf("저는 %s 이고 나이는 %-6d 입니다 \n", name , age);
		System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name , age);
		// 소수점 자릿수 형식 문자 예시
		System.out.printf("저는 %s 이고 신장은 %5.2f 입니다.\n", name , 188.257);
		
		
		/*
		예제 . 아래와 같이 이스케이프 문자를 이용하여 콘솔에 출력하시오.
		| \_/ |
		| q p |   /}
		(  0  )"""\ 
		|"^"`     |
		||_/=\\__ |
		*/
		
		System.out.println("| \\_/ |");
		System.out.println("| q p |   /}");
		System.out.println("(  0  )\"\"\"\\ ");
		System.out.println("|\"^\"`     |");
		System.out.println("||_/=\\\\__ |");
		
		
	}

}
