package com.classmarker.actions;

import java.sql.SQLException;

import com.classmarker.dao.classmarkerDAO;

public class Firsttime {
	private String message;
	private String userid;
	private String password;
	
	public String execute() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.startupstatus()==false) {
			this.message = "Class Marker";
			return "fail";
		}
		this.message = "Class Marker";
		return "success";
	}
	public String firstlogin() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.startupstatus()==true) {
			if(classmarkerDAO.firstlogin(userid, password)==true) {
				System.out.println(userid+password);
				message = "Welcome "+userid;
				return "success";
			}
		}
		else if(classmarkerDAO.startupstatus()==true){
			if(classmarkerDAO.firstlogin(userid, password)==false) {
				message="invalid Userid or password";
				return "partialfail";
			}
		}
		else if(classmarkerDAO.startupstatus()==false) {
			return "startupfail";
		}
		return "fail";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
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