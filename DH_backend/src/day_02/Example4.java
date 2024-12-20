package day_02;
import java.util.Scanner; 

public class Example4 {

	public static void main(String[] args) {
		// 콘술 입력 함수
		// Scanner
		// 1) 입력 객체 만들기 -> new 클래스명()
		Scanner scan = new Scanner(System.in);
		// 2) 입력 객체로 부터 console 에서 키보드로 입력받은 값을 가져오는 함수
		// -> 입력객체.nextXXX();
		
		// 문자열 입력 받기 -> 변수명.next(); : 엔터 기준으로 하나의 (next) 입력을 마침 처리 / 띄어쓰기 불가능
		System.out.print(".next() 문자열 입력 : "); // 입력 안내 문구
		String str1 = scan.next(); // 입력받은 값을 String 타입으로 변환 -> 값을 변수에 저장
		System.out.println("[1] .next() 문자열 결과 :" + str1); // 값 출력
		
		// 문자열 입력 받기 -> 변수명.nextLine(); : .next()와 같으나 띄어쓰기 가능
		// 주의점 . 다른 nextXXX()코드와 같이 사용 시 앞 전 .nextXXX의 엔터를 포함하므로 하나로 인식함 
		// 해결법 . 의미없는 scan.nextLine()을 사용하므로 실 사용할 nextLine()과 구분함.
		System.out.print("[2] .nextLine() 문자열 입력 :"); // 입력 안내 문구
		scan.nextLine(); // 의미없는 nextLine()생성 (엔터처리)
		String str2 = scan.nextLine();
		System.out.println("[2] .nextLine() 문자열 결과 :" +str2);
		
		
		// 정수형 입력 받기 -> 변수명.nextInt();
		System.out.println("[3] .nextInt() 정수int 입력 :"); // 입력 안내 문구
		int value1 = scan.nextInt();
		System.out.println("[3] .nextInt() 정수int 결과 : " + value1);
		
		// 정수형 입력받기 -> 변수명.nextByte();
		System.out.println("[3] .nextByte() 정수int 입력 :"); // 입력 안내 문구
		int value2 = scan.nextByte();
		
		System.out.println("[3] .nextByte() 정수int 결과 : " + value2);
		
		// 위와 같은 형식으로 모든 자료형 가능 (char형만 불가능)
		// 주의점 . 해당 자료형의 허용범위 초과 시 오류 발생
		
		// boolean 입력 받기
		boolean value3 = scan.nextBoolean();
		System.out.println("[4] .nextBoolean() 결과 : ");
		// 주의점 . boolean형이기 때문에 입력 값이 true / false 만 가능
		
		}

}
