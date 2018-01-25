package com.student;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStudentAttendance {
	StudentDetails studentDetails = new StudentDetails(null, 0, 0, 0);
	StudentLogic logic = new StudentLogic();

	@Test
	public void studentResult() {
		studentDetails.setstudentScore(760);
		studentDetails.setStudentName("narender balla");
		studentDetails.setStudentRollno(2365);
		
		int result = logic.studentResult(studentDetails);
		Assert.assertEquals(7000, result);
	}
}
