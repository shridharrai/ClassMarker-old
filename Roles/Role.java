package com.shridhar.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shridhar.dao.ClassmarkerDAO;
import com.shridhar.dao.CommonDAO;

public class Role {
	private String rolename;
	private String roledesc;
	private String showrights;
	private String selectedright;
	private List<String> rightlist = new ArrayList<String>();
	private ArrayList<Role> rolelist;
	public ArrayList<Role> getRolelist() {
		return rolelist;
	}
	public void setRolelist(ArrayList<Role> rolelist) {
		this.rolelist = rolelist;
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
	public String getShowrights() {
		return showrights;
	}
	public void setShowrights(String showrights) {
		this.showrights = showrights;
	}
	public String getSelectedright() {
		return selectedright;
	}
	public void setSelectedright(String selectedright) {
		this.selectedright = selectedright;
	}
	public List<String> getRightlist() {
		return rightlist;
	}
	public void setRightlist(List<String> rightlist) {
		this.rightlist = rightlist;
	}
	@Override
	public String toString() {
		return "Role [rolename=" + rolename + ", roledesc=" + roledesc + 
				", showrights=" + showrights
				+ ", selectedright=" + selectedright + ", rightlist=" + "]";
	}
	
}
