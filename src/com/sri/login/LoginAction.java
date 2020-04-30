package com.sri.login;

public class LoginAction {

	private String username;
	private String password;
	private LoginService loginService;

	public String execute() {
//		System.out.println(getUsername() + "/t " + getPassword());
		loginService=new LoginService();
		return loginService.authenticateUser(getUsername(), getPassword());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
