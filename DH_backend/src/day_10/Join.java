package day_10;

public class Join {
	private String id;
	private String password;
	private String nickName;
	
	Join(){};
	Join(String id, String password, String nickName){
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}
	Join(String id, String password){
		this.id = id;
		this.password = password;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return "Join [id=" + id + ", password=" + password + ", nickName=" + nickName + "]";
	}
	
	
}
