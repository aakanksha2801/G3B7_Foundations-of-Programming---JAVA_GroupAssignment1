package com.greatlearning.model;

public class hrDepartment extends superDepartment {
	public String departmentName() {
		String departmentName="Hr Department";
		return departmentName;
	}
	
	public String getTodaysWork() {
		String getTodaysWork="Fill today’s timesheet and mark your attendance";
		return getTodaysWork;
	}
	
	public String getWorkDeadline() {
		String getWorkDeadline="Complete by EOD";
		return getWorkDeadline;
	}
	
	public String doActivity() {
		String doActivity="team Lunch";
		return doActivity;
	}
}
