package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetailsAndLogic {
	EmployeeDetails details = new EmployeeDetails();
	EmployeeBussinessLogic bussinessLogic = new EmployeeBussinessLogic();
	
	@Test
	public void calculateAppraisal(){
		details.setName("Raju");
		details.setAge(65);
		details.setMonthlySalary(23000);
		
		double appraisal = bussinessLogic.calculateAppraisal(details);
		Assert.assertEquals(1000, appraisal, 0.0, "500");
	}
	
	//Test to check yearly salary
	@Test
	public void testCaluculateYearlySalary(){
     	details.setName("Raju");
		details.setAge(65);
		details.setMonthlySalary(23000);
		
		double salary = bussinessLogic.calculateYearlySalary(details);
		Assert.assertEquals(276000, salary, 0.0, "8000");
	}
	
	
}
