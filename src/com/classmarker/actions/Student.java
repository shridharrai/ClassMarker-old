package com.classmarker.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.classmarker.dao.CommonDAO;
import com.classmarker.dao.classmarkerDAO;

public class Student {
	
	private String studentenrollment;
	private String studentname;
	private String studentcontact;
	private String studentemail;
//	private String studentbranch;
//	private String studentsemester;
	
	
	
	public String getStudentenrollment() {
		return studentenrollment;
	}

	public void setStudentenrollment(String studentenrollment) {
		this.studentenrollment = studentenrollment;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentcontact() {
		return studentcontact;
	}

	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

//	public String getStudentbranch() {
//		return studentbranch;
//	}
//
//	public void setStudentbranch(String studentbranch) {
//		this.studentbranch = studentbranch;
//	}
//
//	public String getStudentsemester() {
//		return studentsemester;
//	}
//
//	public void setStudentsemester(String studentsemester) {
//		this.studentsemester = studentsemester;
//	}

	public String execute() {
		return "success";
	}

	@Override
	public String toString() {
		return "Student [studentenrollment=" + studentenrollment + ", studentname=" + studentname + ", studentcontact="
				+ studentcontact + ", studentemail=" + studentemail + "]";
	}
	
}
