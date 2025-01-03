package 예제.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
숫자의 합

N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

[입력]
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

[출력]
입력으로 주어진 숫자 N개의 합을 출력한다.

 */
public class 문자열_5 {
	/*
	★ Buffer : 두개의 장치 사이에서 데이터를 전송할 때 데이터 전송 속도 / 처리속도 차이를 완화하는 목적의 기억 장치(임시 저장 공간)

	BufferedReader 클래스 
	- 데이터 전송 과정 
		-> 키보드 입력 시마다 한 문자씩 버퍼로 전송 -> 버퍼가 가득 차거나 개행문자 입력 시 버퍼에 데이터를 한번에 프로그램으로 전송
	- 장점 : 메모리 / 속도면에서 빠르고 효율적이다.
	- 단점 : 데이터를 String 형식으로만 읽고 저장하기 때문에 InputStreamReader / OutputStreamWriter 을 통한 형변환 필요 
	- 주의점 : BufferedReader 사용 시 main 함수에 throws IOException 예외처리 필요
	*/
	
	// BuffereReader 클래스를 사용하기 위해 메인함수에 throws IOException 으로 예외 처리
	public static void main(String[] args) throws IOException {
		// BufferedReader 클래스 인스턴스 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한줄 입력 받기
		br.readLine();
		// .write() -> 값 저장 후 출력
		// .flush() -> 값 출력 후 비우기
		
		int sum = 0;
		
		// byte 타입 value 변수에 입력값 저장하는 for 문
		// .getBytes() : 문자 인코딩을 사용하여 byte 로 표현
		for(byte value : br.readLine().getBytes()) {
			// - '0' 을 통해 숫자값을 추출하여 int 형 변수 sum 에 저장 ?? 이유 ??
			sum += (value - '0');
		}
	
		System.out.println(sum);
		
	}
}
