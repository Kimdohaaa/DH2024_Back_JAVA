package jobkorea.view;

import java.util.Scanner;

public class IndexView {
	private IndexView() {}
	private static IndexView instance = new IndexView();
	public static IndexView getInstance () {
		return instance;
	}
	Scanner scan = new Scanner(System.in);
	
	// 메인
	public void index() {
		System.out.println(">> 1. 지원관리 2. 후기관리");
		int choose = scan.nextInt();
		
		if(choose == 1) {
			ApplyView.getInstance().apply();
		}else if(choose == 2) {
			
		}
	}
}