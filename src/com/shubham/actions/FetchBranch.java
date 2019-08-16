package com.shubham.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.shubham.dao.CommonDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shubham.actions.Branch;

public class FetchBranch extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Branch> branchlist = new ArrayList<>();

	public ArrayList<Branch> getBranchlist() {
		return branchlist;
	}
	public void setBranchlist(ArrayList<Branch> branchlist) {
		this.branchlist = branchlist;
	}
	
	public FetchBranch() {}
	
	public String execute() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		branchlist = new ArrayList<Branch>();
		Branch branch = new Branch();
		
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select branchname,branchdesc from branch_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			branch = new Branch();
			branch.setBranchname(rs.getString(1));
			branch.setBranchdesc(rs.getString(2));	
			branchlist.add(branch);
//			
		}
		System.out.println(branchlist);
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
