package javalearning;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the student mark:");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if(mark>=90 && mark<=100) {
			System.out.println("The mark"+mark+"grade is A");
		}
		else if(mark>=80 && mark<=89) {
			System.out.println("The mark"+mark+"grade is B");
		}
		else if(mark>=70 && mark<=79) {
			System.out.println("The mark"+mark+"grade is C");
		}
		else if(mark>=60 && mark<=69) {
			System.out.println("The mark"+mark+"grade is D");
		}
		else {
			System.out.println("This mark"+mark+"is failed");
		}
		

	}

}
