package javalearning;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		Scanner sc1 = new Scanner(System.in);
		int num2 = sc1.nextInt();
	
		if(num1>num2) {
			System.out.println("The"+num1+"is greater");
		}
		else {
			System.out.println("The"+num2+"is greater");

	}
	}

}
