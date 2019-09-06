package com.classmarker.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.classmarker.actions.Branch;
import com.classmarker.dao.CommonDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FetchSemester extends ActionSupport{	// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Semester> semesterlist = new ArrayList<>();

	public ArrayList<Semester> getSemesterlist() {
		return semesterlist;
	}
	public void setSemesterlist(ArrayList<Semester> semesterlist) {
		this.semesterlist = semesterlist;
	}
	
	public FetchSemester() {}
	
	public String execute() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		semesterlist = new ArrayList<Semester>();
		Semester semester = new Semester();
		
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select semestername,semesterdesc from semester_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			semester = new Semester();
			semester.setSemestername(rs.getString(1));
			semester.setSemesterdesc(rs.getString(2));	
			semesterlist.add(semester);
//			
		}
		System.out.println(semesterlist);
		return "success";
	}

//	@Override
//	public ArrayList<Branch> getModel() {
//		// TODO Auto-generated method stub
//		return branchlist;
//	}


//	ResultSet rs = null;
//	
//	public String execute() throws ClassNotFoundException, SQLException {
//		
//		branchlist  = new ArrayList<Branch>();
//		rs = classmarkerDAO.existingbranch();
//		Branch branch = null;
//		if(rs!=null) {
//			while(rs.next()) {
//				branch = new Branch();
//				branch.setBranchname(rs.getString("branchname"));
//				branch.setBranchdesc(rs.getString("branchdesc"));
//				branchlist.add(branch);
//				System.out.println(branchlist);
//			}
//		}
//		return "success";
//	}
	
}
