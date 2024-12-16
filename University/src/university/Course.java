package university;

import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<Students> students = new ArrayList<Students>();
	
	
	public void addStudents(Students aStudents) {
		students.add(aStudents);
	}
	
	public void printInformation() {
		System.out.println("Course Name:"+ name);
		System.out.println("has students: ");
		for(Students s: students) {
			System.out.println(s.getName());
		}
	}
	
	public Course(String aName) {
		name = aName;
	}
	public String getName() {
		return name;
	}
}
