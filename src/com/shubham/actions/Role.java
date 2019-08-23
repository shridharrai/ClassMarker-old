package com.shubham.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shubham.dao.CommonDAO;
import com.shubham.dao.classmarkerDAO;

public class Role {

	private String rolename;
	private String roledesc;
	private String showrights;
	private String selectedright;
	private List<String> rightlist = new ArrayList<String>();
	
	

	public String getShowrights() {
		return showrights;
	}

	public void setShowrights(String showrights) {
		this.showrights = showrights;
	}

	public List<String> getRightlist() {
		return rightlist;
	}

	public void setRightlist(List<String> rightlist) {
		this.rightlist = rightlist;
	}

	public String[] getDefaultright(){
		return new String [] {"addrole"};
	}

	public Role() {}
	
	public String getSelectedright() {
		return selectedright;
	}

	public void setSelectedright(String selectedright) {
		this.selectedright = selectedright;
	}
ArrayList<Role> rolelist = new ArrayList<>();
	
	public ArrayList<Role> getRolelist() {
		return rolelist;
	}

	public void setRolelist(ArrayList<Role> rolelist) {
		this.rolelist = rolelist;
	}
	
	public String fetchroles() throws ClassNotFoundException, SQLException {
		fetchright();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		rolelist = new ArrayList<Role>();
		Role role = new Role();
		
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select role_mst.rolename,role_mst.roledesc,right_mst.rightname from role_mst,right_mst,role_right_mapping where role_mst.roleid=role_right_mapping.roleid and right_mst.rightid=role_right_mapping.rightid");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			role = new Role();
			role.setRolename(rs.getString(1));
			role.setRoledesc(rs.getString(2));	
			role.setShowrights(rs.getString(3));
//			role.setRightlist(rs.getString(3));
			rolelist.add(role);
//			
		}
		System.out.println(rolelist);
		return "success";
	}

	public String addrole() throws ClassNotFoundException, SQLException {
		fetchright();
		if(classmarkerDAO.addrole(rolename, roledesc,selectedright)==true) {
			return "success";
		}
		return "fail";
	}
	
	public String fetchright() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmt1 = null;
		ResultSet rs,rs1 = null;

//		rightlist = new ArrayList<String>();
	
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select rightname from right_mst");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			rightlist.add(rs.getString(1));
		}
		
		return "success";
	}
	
	public String execute() {
		return "success";
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoledesc() {
		return roledesc;
	}

	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}

	@Override
	public String toString() {
		return "Role [rolename=" + rolename + ", roledesc=" + roledesc + "]";
	}

	
	
	
}
