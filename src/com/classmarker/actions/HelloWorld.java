package com.classmarker.actions;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

	 private List<String> stateList = new ArrayList<String>();
	    private List<String> regnList = new ArrayList<String>();
	    private Integer stateId;

	    public Integer getStateId() {
	        return this.stateId;
	    }

	    public void setStateId(Integer stateId) {
	        this.stateId = stateId;
	    }

	    public List<String> getStateList() {
	        return stateList;
	    }

	    public void setStateList(List<String> stateList) {
	        this.stateList = stateList;
	    }

	    public void setRegnList(List<String> regnList) {
	        this.regnList = regnList;
	    }

	    public List<String> getRegnList() {
	        return regnList;
	    }

	    public String execute() throws Exception {

//	        stateList = DB.getStateData();
//	            if (stateId != null) {
//	            regnList = DB.getRegnByStateId(stateId);
//	        }

	        //setMessage(getText(MESSAGE));
	        return "success";
	    }
	    /**
	     * Provide default valuie for Message property.
	     */
}
