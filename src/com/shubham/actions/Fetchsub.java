package com.shubham.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.shubham.dao.CommonDAO;

public class Fetchsub extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	List<Branch> branchlist;
	
	private String selectedbranch;
	Branch branch;
	

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
	
	public Fetchsub() throws ClassNotFoundException, SQLException {
		branchlist = new ArrayList<Branch>();
//		Branch branch = new Branch();
//		branch.setBranchname("dfghjbk");
//		branch.setBranchdesc("fsd");
//		branchlist.add(branch);
//		
//		branch = new Branch();
//		branch.setBranchname("ddfshcfgvjbnfghjbk4356");
//		branch.setBranchdesc("fsddfghjfgcvterty5646");
//		branchlist.add(branch);
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select branchname,branchdesc from branch_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			branch = new Branch();
			branch.setBranchname(rs.getString(1));
			branch.setBranchdesc(rs.getString(2));	
			branchlist.add(branch);
			
		}
	}
	
//	public String execute() throws ClassNotFoundException, SQLException {
//		
//		return "success";
//	}
	public String display() {
		return "none";
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
