package com.student;

public class StudentDetails {
	String studentName;
	int studentRollno;
	int studentScore;
	int studentAttendence;

	public StudentDetails(String studentName, int studentRollno, int studentScore, int studentAttendence) {
		super();
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.studentScore = studentScore;
		this.studentAttendence = studentAttendence;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollno() {
		return studentRollno;
	}

	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}

	public int getstudentScore() {
		return studentScore;
	}

	public void setstudentScore(int studentScore) {
		this.studentScore = studentScore;
	}

	public int getstudentAttendence() {
		return studentAttendence;
	}

	public void setstudentAttendence(int studentAttendence) {
		this.studentAttendence = studentAttendence;
	}
	
	
}
