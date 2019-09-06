package com.classmarker.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.classmarker.actions.Branch;
import com.classmarker.dao.CommonDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class FetchSubject extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Subject> subjectlist;
	List<String> branchlist;
	List<String> semesterlist;

	
	
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

	public List<Subject> getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(List<Subject> subjectlist) {
		this.subjectlist = subjectlist;
	}

	public FetchSubject() {}
	
	public String execute() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmt1,pstmt2 = null;
		ResultSet rs,rs1,rs2 = null;
		
		subjectlist = new ArrayList<Subject>();
		Subject subject = new Subject();
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select subject_mst.subjectcode, subject_mst.subjectid, subject_mst.subjectname, subject_mst.subjectdesc,"
				+ " branch_mst.branchname, semester_mst.semestername from subject_mst, branch_mst, semester_mst, subject_branch_semester_mapping where "
				+ "subject_mst.sid=subject_branch_semester_mapping.subjectid and branch_mst.branchid=subject_branch_semester_mapping.branchid and "
				+ "semester_mst.semid=subject_branch_semester_mapping.semesterid;");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			subject = new Subject();
			subject.setSubjectcode(rs.getString(1));
			subject.setSubjectid(rs.getInt(2));	
			subject.setSubjectname(rs.getString(3));
			subject.setSubjectdesc(rs.getString(4));
			subject.setSelectedbranch(rs.getString(5));
			subject.setSelectedsemester(rs.getString(6));
			subjectlist.add(subject);
			
		}

		branchlist = new ArrayList<String>();
		semesterlist = new ArrayList<String>();
		
		pstmt1 = con.prepareStatement("select branchname from branch_mst where status=\"Y\"");
		rs1 = pstmt1.executeQuery();
		pstmt2 = con.prepareStatement("select semestername from semester_mst where status=\"Y\"");
		rs2 = pstmt2.executeQuery();
		while(rs1.next()) {
			branchlist.add(rs1.getString(1));
		}
		while(rs2.next()) {
			semesterlist.add(rs2.getString(1));
		}
		System.out.println(subjectlist);
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
