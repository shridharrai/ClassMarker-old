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

public class FetchTest extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Test> testlist;
	
	public FetchTest() {}
	
	public String execute() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmt1,pstmt2 = null;
		ResultSet rs,rs1,rs2 = null;
		
		testlist = new ArrayList<Test>();
		Test test = new Test();
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select ");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			test = new Test();
			test.setTestname(rs.getString(1));
			test.setMarksperquestion(rs.getString(2));	
			test.setSelectedbranch(rs.getString(3));
			test.setSelectedsemester(rs.getString(4));
			test.setSelectedsubject(rs.getString(5));
			test.setSelectedgroup(rs.getString(6));
			testlist.add(test);
			
		}
		System.out.println(testlist);
		return "success";
	}

	public List<Test> getTestlist() {
		return testlist;
	}

	public void setTestlist(List<Test> testlist) {
		this.testlist = testlist;
	}
	
}
