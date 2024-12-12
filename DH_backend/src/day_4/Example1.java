package day_4;

public class Example1 {

	public static void main(String[] args) {
		// switch - case 문
		/*
		형식
		switch(조건) {
			case 값1 :
				실행문;
				break; // switch 종료
			case 값2 :
				실행문;
				break; // switch 종료
			default :  // 조건에 해당되는 케이스 값이 없을 때 실행
				실행문;
		}
		- 조건문의 논리연산 / 비교연산에 따른 논리 결과 제어 불가
		- 논리 결과에 따른 제어가 아닌 값에 따른 제어 -> 논리 결과에 따른 제어가 필요한 경우 if문을 사용해야 함
		*/
		
		// switch 문 사용
		int ranking = 1;
		char medalColor;
		
		switch (ranking) {
			case 1 : medalColor = 'G';
			break;
			
			case 2 : medalColor = 'S';
			break;
			
			case 3 : medalColor = 'B';
			break;
					
			default: medalColor = 'A';
		}
		
		System.out.println(ranking + " 등 메달 색깔은 " + medalColor +  "입니다." );
		
		// case 중첩하여 사용하기
		int month = 10;
		int day ;
		
		switch (month) {
		case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31;
			break;
			case 4 : case 6 : case 9 : case 11 :
				day = 30;
				break;
			case 2 :
				day =  28;
				break;
		}
		
		// case 문에 문자열 사용
		String medal = "Gold";
		
		switch (medal) {
			case "Gold" :
				System.out.println("금메달입니다.");
				break;
			case "ilver" :
				System.out.println("은메달입니다.");
				break;
			case "Bronze" :
				System.out.println("동메달입니다.");
				break;
			
			default: 
				System.out.println("메달이 없습니다.");
				break;
		}
		
		
		// 예제 p . 106
		int floor = 1;
		
		switch (floor) {
			case 1:
				System.out.println("1층은 약국입니다.");
				break;
			case 2:
				System.out.println("2층은 정형외과입니다.");
				break;
			case 3:
				System.out.println("3층은 피부과입니다.");
				break;
			case 4:
				System.out.println("4층은 치과입니다.");
				break;
			case 5:
				System.out.println("5층은 헬스클럽입니다.");
				break;
		}
		
		
	}
}


