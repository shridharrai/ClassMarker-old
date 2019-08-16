package com.shubham.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.shubham.dao.CommonDAO;

public class FetchBranchSemester extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	List<Branch> branchlist;
	List<Semester> semesterlist;
	
	private String selectedbranch;
	private String selectedsemester;
	
	Branch branch;
	Semester semester;

	public List<Semester> getSemesterlist() {
		return semesterlist;
	}
	public void setSemesterlist(List<Semester> semesterlist) {
		this.semesterlist = semesterlist;
	}
	public String getSelectedsemester() {
		return selectedsemester;
	}
	public void setSelectedsemester(String selectedsemester) {
		this.selectedsemester = selectedsemester;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Semester getSemester() {
		return semester;
	}
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	public String getSelectedbranch() {
		return selectedbranch;
	}
	public void setSelectedbranch(String selectedbranch) {
		this.selectedbranch = selectedbranch;
	}
	public List<Branch> getBranchlist() {
		return branchlist;
	}
	public void setBranchlist(List<Branch> branchlist) {
		this.branchlist = branchlist;
	}
	
	public FetchBranchSemester() throws ClassNotFoundException, SQLException {
		branchlist = new ArrayList<Branch>();
		semesterlist = new ArrayList<Semester>();
		Connection con = null;
		PreparedStatement pstmt,pstmt1 = null;
		ResultSet rs,rs1 = null;

		
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select branchname,branchdesc from branch_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		pstmt1 = con.prepareStatement("select semestername,semesterdesc from semester_mst where status=\"Y\"");
		rs1 = pstmt1.executeQuery();
		while(rs.next()) {
			branch = new Branch();
			branch.setBranchname(rs.getString(1));
			branch.setBranchdesc(rs.getString(2));	
			branchlist.add(branch);	
		}
		while(rs1.next()) {
			semester = new Semester();
			semester.setSemestername(rs1.getString(1));
			semester.setSemesterdesc(rs1.getString(2));	
			semesterlist.add(semester);
			
		}
		
//		for(Branch b : branchlist) {
//			System.out.println(b.getBranchname());
//		}
//		pstmt1.close();
//		pstmt.close();
//		rs1.close();
//		rs.close();
//		con.close();
	}
	
	public String execute() {
		return "success";
	}	
}
