package com.vcubeprograms;

/* 1. Create a Student class with fields: name, rollNo, and marks.
Add a parameterized constructor, a copy constructor, and a display() method.
In main(), create one student object, copy it using the copy constructor, change the marks of the first student, and display both objects.*/
public class StudentconstruTask {

	int stdno;
	String stdname;
	int stdmarks;

	StudentconstruTask() {
		System.out.println("no-arg constructor called");

	}

	StudentconstruTask(int stdno, String stdname, int stdmarks) {
		this.stdno = stdno;
		this.stdname = stdname;
		this.stdmarks = stdmarks;
	}

	StudentconstruTask(StudentconstruTask s1, int marks) {
		this.stdmarks = marks;
		this.stdname = s1.stdname;
		this.stdno = s1.stdno;

	}

	void show() {
		System.out.println("****************");
		System.out.println("std_id:" + stdno);
		System.out.println("std_name:" + stdname);
		System.out.println("std_marks:" + stdmarks);

	}

	public static void main(String[] args) {
		System.out.println("main method Started");
		StudentconstruTask s1 = new StudentconstruTask(101, "siva", 100);
		s1.show();

		StudentconstruTask s2 = new StudentconstruTask(s1, 200);
		s2.show();

	}

}
