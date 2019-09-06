package com.shridhar.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shridhar.dao.CommonDAO;

public class FetchRights {
	private Role role = new Role();
	private List<String> rightlist = new ArrayList<String>();

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<String> getRightlist() {
		return rightlist;
	}

	public void setRightlist(List<String> rightlist) {
		this.rightlist = rightlist;
	}
	
	@Override
	public String toString() {
		return "FetchRights [role=" + role + ", rightlist=" + rightlist + "]";
	}

	public String fetchright() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmt1 = null;
		ResultSet rs,rs1 = null;		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select rightname from right_mst");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			rightlist.add(rs.getString(1));
		}
		System.out.println(rightlist);
		role.setRightlist(rightlist);
		return "success";
	}
}
