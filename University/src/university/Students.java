package university;

import java.util.ArrayList;

public class Students {
	private String name;
	private String id;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	
	public void addCourse(Course aCourse) {
	
		courses.add(aCourse);
		aCourse.addStudents(this);
	}
	
	public Students(String aName,String anID) {
		name = aName;
		id = anID;
	}
	
	public Students(String aName) {
		name = aName;
		id = "9999";
	}
	
	public void setID(String anID) {
		
		id = anID;
	}
	

	
	//getters
	public String getName() {
		return name;
	}
	
	public String getID() {
		return id;
	}
	public void printInfo() {
		System.out.println("Student Data: ");
		System.out.println("Name:" + name);
		System.out.println("ID:" + id);
		System.out.println("Enrolled in: ");
		   for (Course c: courses) {     
		        System.out.println(c.getName());      
		    }
	
	}
}
