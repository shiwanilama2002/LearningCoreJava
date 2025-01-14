package IfElseInJava;

import java.util.Scanner;

public class AssigingGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the grade:");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		sc.close();
		if(grade>=90 && grade<=100) {
			System.out.println(grade+" percentage is A grade");
		}
		else if(grade>=80 && grade<=89) {
			System.out.println(grade+" percentage is B grade.");
		}
		else if( grade>=70 && grade<=79) {
			System.out.println(grade+" percentage is C grade.");
		}
		else if(grade>=60 && grade<=69) {
				System.out.println(grade+" perecentage is D grade.");
		}
		else {
			System.out.println(grade+" is not graded.");
		}
		
		
	}

}
