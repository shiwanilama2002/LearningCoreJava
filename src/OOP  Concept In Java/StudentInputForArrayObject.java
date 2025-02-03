package OOPConcept;

import java.util.Scanner;

class Student{
	String name;
	boolean isEnrolled;
	String course;
	String semester;
	Student(String name,boolean isEnrolled,String course,String semester){
		this.name = name;
		this.isEnrolled = isEnrolled;
		this.course = course;
		this.semester = semester;
	}
	void display() {
		System.out.println(name);
		System.out.println(isEnrolled);
		System.out.println(course);
		System.out.println(semester);
		System.out.println();
	}
}
public class StudentInputForArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array rows:");
		int row = sc.nextInt();
		System.out.println("Enter the data in the array");
		sc.nextLine();
		Student[] st = new Student[row];
		for(int i =0;i<row;i++) {
			  System.out.println("Enter the name:");
			  String name = sc.nextLine();
			  System.out.println("Is the student enrolled?");
			  Boolean isEnrolled = sc.nextBoolean();
			  sc.nextLine();
			  System.out.println("Enter the course name:");
			  String course = sc.nextLine();
			  System.out.println("Enter the semester:");
			  String semester = sc.nextLine();
			  
			  st[i] = new Student(name, isEnrolled, course, semester);
		}
		for(Student s:st) {
			s.display();
		}
	}

}
