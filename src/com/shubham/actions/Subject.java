package com.shubham.actions;

import java.sql.SQLException;

import com.shubham.dao.classmarkerDAO;

public class Subject {
	
	private int subjectid;
	private String subjectcode;
	private String subjectname;
	private String subjectdesc;
	
	public String addsub() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addsub(subjectcode, subjectid, subjectname, subjectdesc)) {
			return "success";
		}
		return "fail";
	}
	
	public int getSubjectid() {
		return subjectid;
	}
	public void setSubjectid(int subjectid) {
		this.subjectid = subjectid;
	}
	public String getSubjectcode() {
		return subjectcode;
	}
	public void setSubjectcode(String subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getSubjectdesc() {
		return subjectdesc;
	}
	public void setSubjectdesc(String subjectdesc) {
		this.subjectdesc = subjectdesc;
	}
	
	
}
