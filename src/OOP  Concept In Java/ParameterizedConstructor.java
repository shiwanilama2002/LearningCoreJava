package OOPConcept;

import java.util.Scanner;

public class ParameterizedConstructor {
	String name;
	String learning;
	int hour;
	ParameterizedConstructor(String name){
		this.name = name;
		
		System.out.println(name);
	}
	ParameterizedConstructor(String name,int hour){
		this.name = name;
		this.hour = hour;
		System.out.println(name);
		System.out.println(hour);
	}
	ParameterizedConstructor(String name,int hour,String learning){
		this.name = name;
		this.hour = hour;
		this.learning = learning;
		System.out.println(name);
		System.out.println(hour);
		System.out.println(learning);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your name:");
		String name = sc.nextLine();
		System.out.println("Enter what are you learning:");
		String learning = sc.nextLine();
		System.out.println("What is your learning hour?");
		int hour = sc.nextInt();
		ParameterizedConstructor para = new ParameterizedConstructor(name);
		ParameterizedConstructor para1 = new ParameterizedConstructor(name,hour,learning);
		ParameterizedConstructor para2 = new ParameterizedConstructor(name,hour);
	}

}
