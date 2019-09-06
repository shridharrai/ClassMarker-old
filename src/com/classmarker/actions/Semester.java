package com.classmarker.actions;

import java.sql.SQLException;

import com.classmarker.dao.classmarkerDAO;

public class Semester {

	private String semestername;
	private String semesterdesc;
	
	public String addsem() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addsem(semestername, semesterdesc)==true) {
			return "success";
		}
		return "fail";
	}
	public String getSemestername() {
		return semestername;
	}
	public void setSemestername(String semestername) {
		this.semestername = semestername;
	}
	public String getSemesterdesc() {
		return semesterdesc;
	}
	public void setSemesterdesc(String semesterdesc) {
		this.semesterdesc = semesterdesc;
	}
	@Override
	public String toString() {
		return "Semester [semestername=" + semestername + ", semesterdesc=" + semesterdesc + "]";
	}
	
}
