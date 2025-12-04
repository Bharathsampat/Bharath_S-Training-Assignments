package oopsassignment;
import java.util.Scanner;
class Student{
	private String studname;
	private int studregno;
	private float marks;
	
	public void setStudent(String name, int regno, float marks) {

	    this.studname = name;
	    this.studregno = regno;

	    if (marks < 0 || marks > 100) {
	        System.out.println("Invalid marks!");
	    } else {
	        this.marks = marks;
	    }
	}
	String getStudent() {
		return "Student name: " +this.studname +"\t Roll No: "+this.studregno+"\t Marks: "+this.marks;
	}
}

public class StudentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student se=new Student();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name: ");
		String studname = sc.nextLine();
		System.out.println("Enter Roll no: ");
		int studregno = sc.nextInt();
		System.out.println("Enter marks: ");
		float marks=sc.nextFloat();
		
		se.setStudent(studname,studregno,marks);
		System.out.println(se.getStudent());
		
		
	}
}
