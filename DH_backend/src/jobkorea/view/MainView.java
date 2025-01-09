package jobkorea.view;

import java.util.Scanner;

import jobkorea.controller.MainController;
import jobkorea.model.dto.PostDto;
import jobkorea.model.dto.ReviewDto;
public class MainView {
	// 싱글톤 s
	// 생성자
	private MainView() {}
	// 객체 생성
	private static MainView instance = new MainView();
	public static MainView getInstance () {
		return instance;
	}
	// 싱글톤 e

	Scanner scan = new Scanner(System.in);

	// 1 : 회원 로그인 / 회원가입 메소드 연동 -> 성공 시 지원 / 후기 view 연동 
	// 2 : 기업 로그인 / 회원가입 메소드 연동 -> 성공 시 기업 view 연동 
	// 3 : 취업 연동
	public void run() {
		System.out.println(">> 1.일반 2.기업 3.취업");
		int choose = scan.nextInt();
		
		if(choose == 1) {
			
			System.out.println(">> 1. 일반회원가입 2. 일반로그인");
			int choose2 = scan.nextInt();
			
			if(choose2 == 1) {
				mSignUp();
			}else if(choose2 == 2) {
				mLogin();	// 성공 시 지원 / 후기 View 연동
			}
			
		}else if(choose == 2) {
			System.out.println(">> 1. 기업회원가입 2. 기업 로그인");
			
			int choose3 = scan.nextInt();
			
			if(choose3 == 1) {
				eSignUp();
			}else if(choose3 == 2) {
				 eLogin();	// 성공 시 기업 View 연동
			}
			
		}else if(choose == 3) {
			System.out.println(">> 1. 우수기업 2. 기업후기 3. 메인페이지");
			int choose4 = scan.nextInt();
			
			if(choose4 == 1) {
				bestList();
			}else if(choose4 == 2) {
				System.out.print(">> 후기를 볼 기업명 : ");
				String ename = scan.next();
				reviewList(ename);
			}else if (choose4 ==3) {
				
			}
		}
	}

    // [1] 회원 회원가입 메소드
    public void mSignUp() {
       
    }
    // [2] 회원 로그인 메소드
    public void mLogin() {
       
    }
    // [3] 회원 로그아웃 메소드
    public void mLogout() {
    	int result = MainController.getInstance().mLogout();
    	
    	if(result == 0) {
    		System.out.println(">> 로그아웃 성공");
    	
    	}
    }
    
    
    
    // [1] 기업 회원가입 메소드
    public void eSignUp() {
       
    }
    // [2] 기업 로그인 메소드
    public void eLogin() {
       
    }
    // [3] 기업 로그아웃 메소드
    public void eLogout() {
       int result = MainController.getInstance().eLogout();
       System.out.println(">> 로그아웃 성공");
       
       if(result == 0) {
    	   System.out.println(">> 로그아웃 성공");
    	  
       }
    }
    
    
    
    // [1] 우수기업 R
    public void bestList() {
		System.out.println("======= 우수기업리스트 =======");
		PostDto postDto = new PostDto();
		MainController.getInstance().bestList(postDto);
	}
    // [2] 후기 R
    public void reviewList(String ename) {
    	ReviewDto reviewDto = new ReviewDto();
    	MainController.getInstance().reviewList(ename);;
	}
}

