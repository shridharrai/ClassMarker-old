package com.shubham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.shubham.dao.CommonDAO;

public interface classmarkerDAO {

	public static boolean startupstatus() throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select status from app_startup where user_time=\"First Time\" and status =?");
		pstmt.setString(1, "Y");
		rs = pstmt.executeQuery();
		if(rs.next()) {
			
				System.out.println("Status Y is checked");
				return true;
		}
//		System.out.println(rs);
		rs.close();
		pstmt.close();
		con.close();
		return false;
	}
	public static boolean firstlogin(String userid,String password) throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select userid,password from user_mst where userid=? and password=?");
		pstmt.setString(1, userid);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			
				System.out.println("userid check");
				return true;
		}
//		System.out.println(rs);
		rs.close();
		pstmt.close();
		con.close();
		return false;
		}
	
	public static boolean firstupdatepwd(String userid,String contact,String email,String pwd) throws ClassNotFoundException, SQLException {
		try {
		Connection con = null;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		int p = 0;
		con = CommonDAO.getConnection();
		System.out.println("Before Running update Statement");
		pstmt = con.prepareStatement(" update user_mst set userid=?, contact=?, email=? , password=? where uid=1");
		pstmt.setString(1,userid);
		pstmt.setString(2, contact);
		pstmt.setString(3, email);
		pstmt.setString(4,pwd);
		pstmt.executeUpdate();
//		rs = pstmt.executeQuery();
		System.out.println("After executing update statement");
//		if(rs.next()) {
//			System.out.println("Update successful");
//			return true;
//		}
//		rs.close();
//		System.out.println(p);
//		if(p!=0) {
//			System.out.println(p);
//			return true;
//		}
		pstmt.close();
		con.close();
		return true;
		}catch(Exception e) {
			System.out.println("Got an exception "+e.getMessage());
		
		return false;
	}
	}
	
	public static boolean startupfinish() throws ClassNotFoundException, SQLException {
		try {
		Connection con = null;
		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("update app_startup set status=? where user_time=\"First Time\"");
		pstmt.setString(1, "N");
		pstmt.executeUpdate();
//		if(rs.next()) {
			System.out.println("Status N is checked");
//			return true;
//		}
//		System.out.println(rs);
//		rs.close();
		pstmt.close();
		con.close();
		return true;
		}catch(Exception e) {
			System.out.println("Got an exception "+e.getMessage());
			return false;
			}
		}
	
	public static boolean login(String userid, String password) throws ClassNotFoundException, SQLException, NamingException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select userid,password from user_mst where userid=? and password=?");
//		pstmt = con.prepareStatement("select userid, password "
//				+ "from user_mst where userid=? and password=?");
		pstmt.setString(1, userid);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		System.out.println(pstmt);
		System.out.println(rs);
		if(rs.next()){
			 return true;
		 }
//		if(rs.next()) {
////			msg = "Welcome "+userid;
//			System.out.println("Login successful");
//			return true;
//		}
//		 return false;
//		 return userDTO;
		 return false;
	}
	
	public static boolean addsub(String subjectcode,int subjectid,String subjectname,String subjectdesc) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into subject_mst(subjectcode,subjectid,subjectname,subjectdesc) values(?,?,?,?)");
		pstmt.setString(1, subjectcode);
		pstmt.setInt(2, subjectid);
		pstmt.setString(3, subjectname);
		pstmt.setString(4, subjectdesc);
		int recordCount = pstmt.executeUpdate();
		if(recordCount>0) {
			System.out.println("Subject Added");
			return true;
		}
		return false;
	}
	
	public static boolean addsem(String semestername,String semesterdesc) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into semester_mst(semestername,semesterdesc) values(?,?)");
		pstmt.setString(1, semestername);
		pstmt.setString(2, semesterdesc);
		int recordCount = pstmt.executeUpdate();
		if(recordCount>0) {
			System.out.println("Semester Added");
			return true;
		}
		return false;
	}
	
	public static boolean addbranch(String branchname,String branchdesc) throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String msg ="Invalid Userid or Password";
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("insert into branch_mst(branchname,branchdesc) values(?,?)");
		pstmt.setString(1, branchname);
		pstmt.setString(2, branchdesc);
		int recordCount = pstmt.executeUpdate();
		if(recordCount>0) {
			System.out.println("Branch Added");
			return true;
		}
		return false;
	}
}

