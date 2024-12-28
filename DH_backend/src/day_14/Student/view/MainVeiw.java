package day_14.Student.view;

import java.util.Scanner;

public class MainVeiw {
	// 싱글톤 s
	private MainVeiw() {}
	
	private static MainVeiw instance = new MainVeiw() ;
	
	public static MainVeiw getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		while(true) {
			System.out.println(">> 1. 학생 2. 수업 3. 수강신청");
			int choose = scan.nextInt();
			
			if(choose == 1) {
				StudentView.getInstance().run();
			}else if(choose == 2 ) {
				// ClassView 연동
			}else if(choose == 3 ) {
				// AcceptView 연동
			}
		}
	}
}
