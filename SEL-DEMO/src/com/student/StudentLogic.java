package com.student;

public class StudentLogic {
	
	public int studentResult(StudentDetails details){
		int studentMonthlyAverageScore;
		studentMonthlyAverageScore = details.getstudentScore() / 100 * 1000;
		return studentMonthlyAverageScore;
		
	}
	
	public int studentAttendance(StudentDetails details){
		int studentAttendance;
		studentAttendance = details.getstudentAttendence() / 100 * 31;
		return studentAttendance;
	}
}
