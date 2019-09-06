package com.classmarker.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.classmarker.dao.CommonDAO;
import com.classmarker.dao.classmarkerDAO;

public class Test {

	private String testname;
	private String marksperquestion;
	private String question;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private String selectedbranch;
	private String selectedsemester;
	private String selectedsubject;
	private String selectedgroup;
	private String selectedchoice;
	List<String> branchlist = new ArrayList<String>();
	List<String> semesterlist = new ArrayList<String>();
	List<String> subjectlist = new ArrayList<String>();
	List<String> grouplist = new ArrayList<String>();
	List<String> choicelist = new ArrayList<String>();
	
	public String addtest() throws ClassNotFoundException, SQLException {
		if(classmarkerDAO.addtest(testname,marksperquestion,question,choice1,choice2,choice3,choice4,selectedchoice,selectedbranch, selectedsemester,selectedsubject,selectedgroup)) {
			return "success";
		}
		
		return "fail";
	}
	
	public String fetchbranchsemsubjectgroupchoice() throws ClassNotFoundException, SQLException {
		Connection con = null;
		PreparedStatement pstmt,pstmt1,pstmt2,pstmt3 = null;
		ResultSet rs,rs1,rs2,rs3 = null;

//		branchlist = new ArrayList<String>();
//		semesterlist = new ArrayList<String>();
//		subjectlist = new ArrayList<String>();
//		grouplist = new ArrayList<String>();
		
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement("select branchname from branch_mst where status=\"Y\"");
		rs = pstmt.executeQuery();
		pstmt1 = con.prepareStatement("select semestername from semester_mst where status=\"Y\"");
		rs1 = pstmt1.executeQuery();
		pstmt2 = con.prepareStatement("select subjectname from subject_mst where status=\"Y\"");
		rs2 = pstmt2.executeQuery();
		pstmt3 = con.prepareStatement("select groupname from group_mst ");
		rs3 = pstmt3.executeQuery();
		while(rs.next()) {
			branchlist.add(rs.getString(1));
		}
		while(rs1.next()) {
			semesterlist.add(rs1.getString(1));
		}
		while(rs2.next()) {
			subjectlist.add(rs2.getString(1));
		}
		while(rs3.next()) {
			grouplist.add(rs3.getString(1));
		}
//		choicelist.add("choice 1");
//		choicelist.add("choice 2");
//		choicelist.add("choice 3");
//		choicelist.add("choice 4");
		return "success";
	}

	public String getTestname() {
		return testname;
	}

	public void setTestname(String testname) {
		this.testname = testname;
	}

	public String getMarksperquestion() {
		return marksperquestion;
	}

	public void setMarksperquestion(String marksperquestion) {
		this.marksperquestion = marksperquestion;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public String getChoice4() {
		return choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	public String getSelectedbranch() {
		return selectedbranch;
	}

	public void setSelectedbranch(String selectedbranch) {
		this.selectedbranch = selectedbranch;
	}

	public String getSelectedsemester() {
		return selectedsemester;
	}

	public void setSelectedsemester(String selectedsemester) {
		this.selectedsemester = selectedsemester;
	}

	public String getSelectedsubject() {
		return selectedsubject;
	}

	public void setSelectedsubject(String selectedsubject) {
		this.selectedsubject = selectedsubject;
	}

	public String getSelectedgroup() {
		return selectedgroup;
	}

	public void setSelectedgroup(String selectedgroup) {
		this.selectedgroup = selectedgroup;
	}

	public List<String> getBranchlist() {
		return branchlist;
	}

	public void setBranchlist(List<String> branchlist) {
		this.branchlist = branchlist;
	}

	public List<String> getSemesterlist() {
		return semesterlist;
	}

	public void setSemesterlist(List<String> semesterlist) {
		this.semesterlist = semesterlist;
	}

	public List<String> getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(List<String> subjectlist) {
		this.subjectlist = subjectlist;
	}

	public List<String> getGrouplist() {
		return grouplist;
	}

	public void setGrouplist(List<String> grouplist) {
		this.grouplist = grouplist;
	}

	public String getSelectedchoice() {
		return selectedchoice;
	}

	public void setSelectedchoice(String selectedchoice) {
		this.selectedchoice = selectedchoice;
	}

	public List<String> getChoicelist() {
		return choicelist;
	}

	public void setChoicelist(List<String> choicelist) {
		this.choicelist = choicelist;
	}
	
	
	
}
