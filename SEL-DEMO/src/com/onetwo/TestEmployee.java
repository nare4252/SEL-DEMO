package com.onetwo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployee {
	String EmployeeName = "nare";
	int EmployeeID = 2;
	double EmployeeSalary = 20000.0;

	EmployeeDetails details;

	@Test
	public void employeeLogic() {
		details = new EmployeeDetails();
		Assert.assertEquals(EmployeeName, "nare");

	}
	
	
	@Test
	public void employeeLogicOne(){
		details = new EmployeeDetails();
		Assert.assertEquals(EmployeeID, 2);
	}
	
	@Test
	public void employeeLogicTwo(){
		details = new EmployeeDetails();
		Assert.assertEquals(EmployeeSalary, 20000.0);
	}
}
