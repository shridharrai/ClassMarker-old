package com.shubham.actions;

import java.sql.SQLException;
import java.util.List;

import com.shubham.dao.classmarkerDAO;

public class Subject {
	
	private int subjectid;
	private String subjectcode;
	private String subjectname;
	private String subjectdesc;
	private Branch selectedbranch;
	private Semester selectedsemester;
	List<Branch> branchlist;
	List<Semester> semesterlist;
	

	public String addsubject() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addsub(subjectcode, subjectid, subjectname, subjectdesc,selectedbranch.getBranchname(),selectedsemester.getSemestername())) {
			return "success";
		}
		return "fail";
	}
	
	
	public List<Branch> getBranchlist() {
		return branchlist;
	}

	public void setBranchlist(List<Branch> branchlist) {
		this.branchlist = branchlist;
	}

	public List<Semester> getSemesterlist() {
		return semesterlist;
	}

	public void setSemesterlist(List<Semester> semesterlist) {
		this.semesterlist = semesterlist;
	}

	
	public Branch getSelectedbranch() {
		return selectedbranch;
	}

	public void setSelectedbranch(Branch selectedbranch) {
		this.selectedbranch = selectedbranch;
	}

	public Semester getSelectedsemester() {
		return selectedsemester;
	}

	public void setSelectedsemester(Semester selectedsemester) {
		this.selectedsemester = selectedsemester;
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
	
	public String execute() {
		return "success";
	}
	
}
