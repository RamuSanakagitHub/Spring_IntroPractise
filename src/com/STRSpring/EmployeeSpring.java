package com.STRSpring;

public class EmployeeSpring
{
	private String empName;
	private int empId;
	public EmployeeSpring()
	{
		System.out.println("Default Cnstructor");
	}	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

}
