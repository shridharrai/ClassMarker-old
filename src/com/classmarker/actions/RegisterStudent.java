package com.classmarker.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.classmarker.dao.CommonDAO;
import com.classmarker.dao.classmarkerDAO;

public class RegisterStudent {

	private String userenrollment;
	private String userid;
	private String contact;
	private String email;
	private String pwd;
	private String selectedbranch;
	private String selectedsemester;
	List<String> branchlist;
	List<String> semesterlist;
	
	public String addstudent() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addstudent(userenrollment, userid, contact, email, pwd, selectedbranch, selectedsemester)) {
			return "success";
		}
		
		return "fail";
	}
	
	public String fetchbranchsem() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmt1 = null;
		ResultSet rs,rs1 = null;

		branchlist = new ArrayList<String>();
		semesterlist = new ArrayList<String>();
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select branchname from branch_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		pstmt1 = con.prepareStatement("select semestername from semester_mst where status=\"Y\"");
		rs1 = pstmt1.executeQuery();
		while(rs.next()) {
			branchlist.add(rs.getString(1));
		}
		while(rs1.next()) {
			semesterlist.add(rs1.getString(1));
		}
		return "success";
	}
	
	public String getUserenrollment() {
		return userenrollment;
	}

	public void setUserenrollment(String userenrollment) {
		this.userenrollment = userenrollment;
	}

	public List<String> getBranchlist() {
		return branchlist;
	}

	public void setBranchlist(List<String> branchlist) {
		this.branchlist = branchlist;
	}

	public List<String> getSemesterlist() {
		return semesterlist;
	}

	public void setSemesterlist(List<String> semesterlist) {
		this.semesterlist = semesterlist;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSelectedbranch() {
		return selectedbranch;
	}
	public void setSelectedbranch(String selectedbranch) {
		this.selectedbranch = selectedbranch;
	}
	public String getSelectedsemester() {
		return selectedsemester;
	}
	public void setSelectedsemester(String selectedsemester) {
		this.selectedsemester = selectedsemester;
	}

}
