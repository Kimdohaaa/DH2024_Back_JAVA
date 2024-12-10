package day_2;

//import java.lang.classfile.attribute.LocalVariableTableAttribute;
import java.util.Scanner;
import java.util.zip.Inflater;

public class Example5 {

	public static void main(String[] args) {
		// 연산자 예제
		/*
		예제
		1. 국어, 영어, 수학 점수를 각각 입력받아 각 변수에 저장하고
		    총점과 평균을 계산 하여 consloe 탭에 출력하시오.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 국어점수를 입력하시오.");
		int sco1 = scan.nextInt();
		System.out.println("1. 영어점수를 입력하시오.");
		int sco2 = scan.nextInt();
		System.out.println("1. 수학점수를 입력하시오.");
		int sco3 = scan.nextInt();
		
		int total1 = sco1 + sco2 + sco3;
		int mean = total1 / 3;
		
		System.out.println(total1);
		System.out.println(mean);
		/*
		예제
		2. 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
		*/
		System.out.println("2. 반지름을 입력하시오");
		double rd = scan.nextDouble();
		final double pi = 3.14;
		
		double area = rd * rd * pi;
		System.out.println(area);
		/*
		예제
		3. 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
		*/
		System.out.println("3. 실수 1을 입력하시오");
		double d1 = scan.nextDouble();
		System.out.println("3. 실수 2을 입력하시오");
		double d2 = scan.nextDouble();
		
		double prc = (d1 / d2) * 100;
		System.out.println(prc);
		/* 
		 예제
		 4. 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
	    */
		System.out.println("4. 정수 1을 입력하시오.(홀수)");
		int i1 = scan.nextInt();
		
		boolean bool1 = (i1 % 2 == 1)? true : false;
		System.out.println(bool1);
		
		/* 
		예제
		5. 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오. 
	    */
		System.out.println("5. 정수를 입력하시오.(7 배수)");
		int i2 = scan.nextInt();
		boolean bool2 = (i2 % 7 == 0)? true : false;
		System.out.println(bool2);
		
		/*
		예제 
		6. 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
	    */
		System.out.println("6. 정수를 입력하시오.(홀수 / 7 배수)");
		int i3 = scan.nextInt();
		boolean bool3 = (i3 % 2 == 1 && i3 % 7 ==0) ? true : false;
		System.out.println(bool3);
		/*
		예제 
		7. prompt 함수로 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
	    -> 입력 예] 356789 입력시 , 출력 예] 십만원:3장 만원:5장 천원6장
		*/
		System.out.println("7. 십만원단위 금액을 입력하시오.");
		int money = scan.nextInt();
		int money1 = money / 100000;
		int money2 = ( money / 10000) - (money1 * 10);
		int money3 = (money /  1000) - (money1 * 100) - (money2 * 10);
		
		System.out.println("십만원권 : "+ money1);
		System.out.println("만원권 : "+ money2 );
		System.out.println("천원권 : " + money3 );
		
		/*
		예제 
		8. . 1차점수 와 2차점수 각각 입력받아서 
          	-> 총점이 150점이상이면 '합격' 아니면 '불합격' 으로 console탭에 출력하시오.
		*/
		System.out.println("8. 점수 1을 입력하시오");
		int sco4 = scan.nextInt();
		System.out.println("8. 점수 2을 입력하시오");
		int sco5 = scan.nextInt();
		
		int total2 = sco4 + sco5;
		String str1 = (total2 >= 150)? "합격" : "불합격";
		System.out.println(str1);
		}

}
