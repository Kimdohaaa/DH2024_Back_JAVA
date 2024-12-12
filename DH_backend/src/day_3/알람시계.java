package day_3;

import java.lang.classfile.attribute.LocalVariableTableAttribute;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.logging.Handler;

public class 알람시계 {

	public static void main(String[] args) {
		// 알람으로 설정한 시간에 130분 뒤로 알람이 설정되게 하라.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알람 시를 입력하세요.");
		int inH = scan.nextInt();
		System.out.println("알람 분을 입력하세요.");
		int inM = scan.nextInt();
		
	/*	if(inM - 45 < 0) {
			inM = inM - 45 + 60;
			if(inH == 0) {
				inH = 23;
			}else {
				inH--;
			}
		}else {
			inM = inM - 45;
		}
		System.out.printf("알람시간은 %d 시 %d 분 입니다. ", inH , inM);
		*/
		
		int M = (inH * 60) + inM;
		int alarmT = M - 130;
		int alarmH = alarmT / 60;
		int alarmM = alarmT % 60;
		
		if(alarmH > 0 && alarmM < 0 ) {
			alarmM += 60;
			System.out.printf("3. 알람시간은 %d 시 %d 분 입니다.", alarmH , alarmM);
		}else if(alarmH < 0 && alarmM > 0 ) {
				alarmH += 24;
				System.out.printf("2 . 알람시간은 %d 시 %d 분 입니다.", alarmH , alarmM);		
		}else if(alarmH < 0 && alarmM < 0) {
				alarmH += 24;
				alarmM += 60;
				
				System.out.printf("1 . 알람시간은 %d 시 %d 분 입니다.", alarmH , alarmM);
		}else if(alarmT <= 130) {
				alarmM += 60;
		
				System.out.printf("4. 알람시간은 %d 시 %d 분 입니다.", alarmH , alarmM);
		}else  {
		
			System.out.printf("5. 알람시간은 %d 시 %d 분 입니다.", alarmH , alarmM);
		}
		
		
		
		
		

	}

}
