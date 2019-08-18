package com.shubham.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shubham.dao.CommonDAO;
import com.shubham.dao.classmarkerDAO;

public class Subject {
	
	private int subjectid;
	private String subjectcode;
	private String subjectname;
	private String subjectdesc;
	private String selectedbranch;
	private String selectedsemester;
	List<String> branchlist;
	List<String> semesterlist;
	

	public String addsubject() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addsub(subjectcode, subjectid, subjectname, subjectdesc,selectedbranch,selectedsemester)) {
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
