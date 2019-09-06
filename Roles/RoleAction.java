package com.shridhar.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shridhar.dao.ClassmarkerDAO;
import com.shridhar.dao.CommonDAO;

public class RoleAction extends ActionSupport implements ModelDriven<Role> {
	private Role role = new Role();
	private ArrayList<Role> rolelist1;
	private List<String> rightlist;
	private FetchRights fetchright = new FetchRights();
	
	

	public FetchRights getFetchright() {
		return fetchright;
	}

	public void setFetchright(FetchRights fetchright) {
		this.fetchright = fetchright;
	}

	public List<String> getRightlist() {
		return rightlist;
	}

	public void setRightlist(List<String> rightlist) {
		this.rightlist = rightlist;
	}

	@Override
	public String toString() {
		return "RoleAction [role=" + role + ", rolelist1=" + rolelist1 
				+ ", rightlist=" + rightlist + ", fetchright="
				+ fetchright + "]";
	}

	public ArrayList<Role> getRolelist1() {
		return rolelist1;
	}

	public void setRolelist1(ArrayList<Role> rolelist1) {
		this.rolelist1 = rolelist1;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Role getModel() {
		// TODO Auto-generated method stub
		return role;
	}
	
	public String addrole() throws ClassNotFoundException, SQLException {
		System.out.println("Name is "+role.getRolename()+" Role is "
           +role.getRoledesc()+" Rights are "+role.getSelectedright());
		if(ClassmarkerDAO.addrole(role.getRolename(), role.getRoledesc(),
				role.getSelectedright())==true) {
			return "success";
		}
		return "fail";
	}
	
	public String fetchroles() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		rolelist1 = new ArrayList<Role>();
		rightlist = new ArrayList<String>();
		rightlist.addAll(fetchright.getRightlist());
		System.out.println("Rights are "+rightlist);
				
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select role_mst.rolename,"
				+ "role_mst.roledesc,right_mst.rightname from "
				+ "role_mst,right_mst,role_right_mapping where "
				+ "role_mst.roleid=role_right_mapping.roleid and "
				+ "right_mst.rightid=role_right_mapping.rightid");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			role = new Role();
			role.setRolename(rs.getString(1));
			role.setRoledesc(rs.getString(2));	
			role.setShowrights(rs.getString(3));
			rolelist1.add(role);			
		}
		System.out.println(rolelist1);
		role.setRolelist(rolelist1);
		System.out.println(role.getRolelist());
		return "success";
	}

}
