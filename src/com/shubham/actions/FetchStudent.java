package com.shubham.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shubham.dao.CommonDAO;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.shubham.actions.Branch;

public class FetchStudent extends ActionSupport{// implements ModelDriven<ArrayList<Branch>>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Student> studentlist;
	
		public List<Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}

		public FetchStudent() {}
	
	public String execute() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		studentlist = new ArrayList<Student>();
		Student student = new Student();
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select user_mst.userid,user_mst.userenrollment,user_mst.contact,user_mst.email from user_mst,role_mst,user_role_mapping where user_mst.uid=user_role_mapping.userid and role_mst.roleid=user_role_mapping.roleid and role_mst.rolename=\"student\"");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			student = new Student();
			student.setStudentenrollment(rs.getString(1));
			student.setStudentname(rs.getString(2));	
			student.setStudentcontact(rs.getString(3));
			student.setStudentemail(rs.getString(4));
//			student.setStudentbranch(rs.getString(5));
//			student.setStudentsemester(rs.getString(6));
			studentlist.add(student);
			
		}

		System.out.println(studentlist.toString());
		return "success";
	}

}
