package org.college;

public class StudentDetails {
	public void studentName() {
		System.out.println("student name=bala");
	}

	public void studentDept() {
		this.studentName();
		System.out.println("department=EEE");
	}

	public static void main(String[] args) {
		StudentDetails a = new StudentDetails();
		a.studentDept();

	}
}
