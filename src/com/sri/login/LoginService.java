package com.sri.login;

public class LoginService {

	public String authenticateUser(String username,String pwd) {
		if(username.equals("sri") && pwd.equals("sri")) {
			return "login";
		}
		else return "error";
		
	}
}
