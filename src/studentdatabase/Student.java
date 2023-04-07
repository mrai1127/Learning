package studentdatabase;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses =  null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student first name: ");
	    this.firstName = in.nextLine();
	    
	    System.out.println("Enter Student last name: ");
	    this.lastName = in.nextLine();
	    
	    System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
	    this.gradeYear = in.nextInt();
	    
	    
	    setStudentID();
	    
	    
	    System.out.println(firstName + " " + lastName + " " +gradeYear + " " + studentID) ;
	    
	}
	//generate an id
	private void setStudentID() {
		//Grade level + ID
	    id++;
		this.studentID = gradeYear + " " + id;
	}
	
	//enroll in courses
	
	public void enroll() {
		
		//get inside a loop, user hit )
		System.out.println("Enter course to enroll(Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(course != "Q") {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance * costOfCourse;
			
		}
		
		System.out.println("Enrolled in : " +  courses);
		System.out.println("Tution balance: " +  tuitionBalance);
	}
	
	//view balance and 
	
	//pay tuition
	
	//show status

}
