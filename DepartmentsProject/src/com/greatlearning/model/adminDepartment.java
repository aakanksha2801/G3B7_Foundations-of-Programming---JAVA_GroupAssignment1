package com.greatlearning.model;

public class adminDepartment extends superDepartment {
	public String departmentName() {
		String departmentName="Admin Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		String getTodaysWork="Complete your documents Submission";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		String getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
	}
}
