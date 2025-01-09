
package jobkorea.controller;

import java.util.ArrayList;
import java.util.HashMap;

import jobkorea.model.dao.MainDao;
import jobkorea.model.dto.PostDto;

public class MainController {
	// 싱글톤
	// 생성자
	private MainController() {}
	// 객체생성
	private static MainController instance = new MainController();
	// 메소드
	public static MainController getInstance() {
		return instance;
	}
	// 싱글톤 e
	
	private int loginMno = 0;
	private int loginEno = 0;
	
    // [1] 회원 회원가입 메소드
    public void mSignUp() {
       
    }
    // [2] 회원 로그인 메소드
    public void mLogin() {
       
    }
    // [3] 회원 로그아웃 메소드
    public int mLogout() {
    	loginMno = 0;
    	
    	return loginMno;
    }
    
    
    
    // [1] 기업 회원가입 메소드
    public void eSignUp() {
       
    }
    // [2] 기업 로그인 메소드
    public void eLogin() {
       
    }
    // [3] 기업 로그아웃 메소드
    public int eLogout() {
    	loginEno = 0;
    	
    	return loginEno;
    }
    
    
    // [1] 우수기업 R
    public ArrayList<HashMap<String, String>> bestList() {
    	ArrayList<HashMap<String, String>> result = MainDao.getInstance().bestList();
	
    	return result;
    }
    // [2] 후기 R
    public ArrayList<HashMap<String, String>> reviewList(String ename) {
    	ArrayList<HashMap<String, String>> result = MainDao.getInstance().reviewList(ename);
    	
    	return result;
	}
}

