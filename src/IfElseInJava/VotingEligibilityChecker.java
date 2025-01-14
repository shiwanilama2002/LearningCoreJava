package javalearning;

import java.util.Scanner;

public class VotingEligibilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the age:");
		Scanner sc = new Scanner(System.in);
		int  age = sc.nextInt();
		if(age>18) {
			System.out.println("The age"+""+age+""+"eligible to vote");
		}
		else {
			System.out.println("The age"+""+age+""+"is not eligible to vote");
		}
	}

}
