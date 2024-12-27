package day_14;

import java.util.ArrayList;

// ArrayList 클래스 -> 프레임워크
public class Example1 {
	// 배열 -> 고정길이 (이미 지정된 배열의 길이는 변경 불가)
	public static void main(String[] args) {
		// 1. String 객체 3개를 저장할 수 있는 배열 생성
		String[] names = new String[3]; 
		
		// 2. 배열의 인덱스에 객체 대입
		names[0] = "유재석";
		names[1] = "강호동";
		names[2] = "신동엽";
		
		// 3. 배열 모든 요소 순회
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 4. 배열 내 인덱스 이상의 요소 대입
		// names[3] = "하하" // -> 오류 (해당 인덱스는 배열의 길이를 벗어나기 때문에)
		
		// 5. 배열 내 특정 인덱스 요소 삭제 -> 인덱스 자체 삭제 불가
		names[1] = null; // 해당 인덱스를 삭제하는 것이 아닌 값을 null 로 바꾸는 것 -> 인덱스 자체 삭제 불가
		
		
		
		
		// ------- ArrayList 사용 -> 장점 : ArrayList 사용 시 배열과 다른게 가변길이로 사용 가능 | 단점 : 라이브러리이기 때문에 속도 ↓ -------
		// < > : 제네릭 타입 -> <리스트에 저장할 객체의 타입 선언>
		
		// 1. ArrayList 클래스 선언
		// ArrayList <요소의 타입> 변수명 = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		// 2. 리스트에 요소 추가
		// 변수명.add(추가 요소)
		nameList.add("유재석");
		nameList.add("강호동");
		nameList.add("신동엽");
		
		// 3-1. 리스트의 총 개수 반환 함수 
		// 변수명.size()
		for(int index = 0; index <= nameList.size() -1 ; index++) {
			// 3-2. 리스트의 특정 인덱스 요소값 반환 함수
			// 변수명.get(인덱스)
			System.out.print(nameList.get(index));
		}
		
		// 리스트는 배열과 다르게 가변 길이 이므로 요소 추가 시 자동으로 길이 조정
		nameList.add("하하");
		
		// 4. 리스트의 요소 삭제
		// 변수명.remove(인덱스)
		nameList.remove(1); // 배열과 달리 요소 삭제 가능
		
		// 확인
		System.out.println(nameList);
		
		
	}
}
