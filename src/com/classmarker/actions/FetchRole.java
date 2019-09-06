package com.classmarker.actions;
//package com.shubham.actions;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import com.shubham.dao.CommonDAO;
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import com.shubham.actions.Branch;
//
//public class FetchRole extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	ArrayList<Role> rolelist = new ArrayList<>();
//	
//	public ArrayList<Role> getRolelist() {
//		return rolelist;
//	}
//
//	public void setRolelist(ArrayList<Role> rolelist) {
//		this.rolelist = rolelist;
//	}
//
//	public FetchRole() {}
//	
//	public String execute() throws ClassNotFoundException, SQLException {
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		rolelist = new ArrayList<Role>();
//		Role role = new Role();
//		
//		
//		con = CommonDAO.getConnection();
//		pstmt = con.prepareStatement("select rolename,roledesc from role_mst where status=\"Y\"");
//		rs = pstmt.executeQuery();
//		while(rs.next()) {
//			role = new Role();
//			role.setRolename(rs.getString(1));
//			role.setRoledesc(rs.getString(2));	
//			rolelist.add(role);
////			
//		}
//		System.out.println(rolelist);
//		return "success";
//	}
//
////	@Override
////	public ArrayList<Branch> getModel() {
////		// TODO Auto-generated method stub
////		return branchlist;
////	}
//
//
////	ResultSet rs = null;
////	
////	public String execute() throws ClassNotFoundException, SQLException {
////		
////		branchlist  = new ArrayList<Branch>();
////		rs = classmarkerDAO.existingbranch();
////		Branch branch = null;
////		if(rs!=null) {
////			while(rs.next()) {
////				branch = new Branch();
////				branch.setBranchname(rs.getString("branchname"));
////				branch.setBranchdesc(rs.getString("branchdesc"));
////				branchlist.add(branch);
////				System.out.println(branchlist);
////			}
////		}
////		return "success";
////	}
//	
//}
