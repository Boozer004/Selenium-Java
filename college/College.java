package org.college;

public class College extends Department {
	public void collegeName() {
		System.out.println("College name is Dhanalakshmi Srinivasa College");
	}

	public void collegeCode() {
		System.out.println("College id is 1035");
	}

	public void collegeRank() {
		System.out.println("College rank is 54");
	}

	public static void main(String[] args) {
		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		college.branchName();
		college.deptName();
		college.myId();
		college.myName();
		college.myCGPA();
	}
}
