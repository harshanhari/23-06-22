package assignment5;

import java.util.Arrays;

public class Student extends Person {
	int numCourses;
	String[] courses = {};
	int[] grades = {};
	private static final int maxCourse = 30;

	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[maxCourse];
		grades = new int[maxCourse];
	}

	public String toString() {
		return "Student : " + super.toString();
	}

	public void addCourseGrade(String course, int grade) {
		this.courses[numCourses] = course;
		this.grades[numCourses] = grade;
		numCourses++;
	}

	public void printGrades() {
		System.out.print(this);
		for (int i = 0; i < numCourses; ++i) {
			System.out.print(" " + courses[i] + " : " + grades[i]);
		}
		System.out.println();
	}

	public double getAvarageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum = sum + grades[i];
		}
		return (double) sum / numCourses;
	}

}
