package com.shubham.actions;

import java.sql.SQLException;

import com.shubham.dao.classmarkerDAO;

public class Firstupdatepwd {
	private String userid;
	private String contact;
	private String email;
	private String password;
	
	public String firstupdatepwd() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.firstupdatepwd(userid, contact, email, password)==true) {
			if(classmarkerDAO.startupfinish()==true) {
				return "success";
			}
		}
		return "fail";
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
