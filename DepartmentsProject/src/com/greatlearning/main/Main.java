package com.greatlearning.main;

import com.greatlearning.model.adminDepartment;
import com.greatlearning.model.hrDepartment;
import com.greatlearning.model.superDepartment;
import com.greatlearning.model.techDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superDepartment s=new superDepartment();
		adminDepartment admin=new adminDepartment();
		hrDepartment hr=new hrDepartment();
		techDepartment tech=new techDepartment();
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(s.isTodayAHoliday());
		
		System.out.println();

		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(s.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(s.isTodayAHoliday());

	}

}
