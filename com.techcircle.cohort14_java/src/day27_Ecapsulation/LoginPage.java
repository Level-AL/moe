package day27_Ecapsulation;

public class LoginPage {
// instance variables
	private String userName;
	private String password;
	
// Encapsulation simply means binding object state (fields)
// and behaviors (methods) together
	
	// getter reads value
	public String getUserName () {
		return userName;
	}
	
	// setter updates value
	public void setUserName (String userName1){
		userName = userName1;	
	}
	
	
	public String getPassword () {
		return password;
	}
	
	public void setPassword (String password1) {
		password = password1;
	}

	
	public void getInfo () {
		this.getPassword();
		this.getUserName();
	}

	public LoginPage (String userName, String password) {
		this.userName = userName;
		this.password = password;
		
	}








}
