package com.shubham.actions;

import java.sql.SQLException;

import com.shubham.dao.classmarkerDAO;

public class Branch {

	private String branchname;
	private String branchdesc;
	
	public String addsem() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addbranch(branchname, branchdesc)==true) {
			return "success";
		}
		return "fail";
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String getBranchdesc() {
		return branchdesc;
	}

	public void setBranchdesc(String branchdesc) {
		this.branchdesc = branchdesc;
	}
	
	
}
