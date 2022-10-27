package com.cg;

public class Student {
	 private int rollNo;
	    private String studentName;

	    private Marks marks;
	    private School school;

	    public String getStudentName() {
	        return studentName;
	    }

	    public void setStudentName(String studentName) {
	        this.studentName = studentName;
	    }

	    Student(){
	        System.out.println("student class :: costructor");
	    }


	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }


	    public Marks getMarks() {
	        return marks;
	    }

	    public void setMarks(Marks marks) {
	        this.marks = marks;
	    }

	    public School getSchool() {
	        return school;
	    }

	    public void setSchool(School school) {
	        this.school = school;
	    }

	}



