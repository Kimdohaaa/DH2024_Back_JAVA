package day_18.step2_JDBC;

public class Example2 {
	public static void main(String[] args) {
		
		// [1] DB 연동 확인
		DAOd.getInstance();
		
		// [2] insert 확인
		DAOd.getInstance().insert();
		
		// [3] select 확인
		DAOd.getInstance().select();
		
		// [4] update 확인
		DAOd.getInstance().update();
		
		// [5] delete 확인
		DAOd.getInstance().delete();
		
		DAOd.getInstance().select();
	}
}
