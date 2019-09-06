package com.classmarker.actions;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.classmarker.dao.classmarkerDAO;

public class Login {

	private String userid;
	private String password;
	
	public String dologin() throws ClassNotFoundException, SQLException, NamingException {
		if(classmarkerDAO.login(userid, password)==true) {
			return "success";
		}
		return "fail";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
