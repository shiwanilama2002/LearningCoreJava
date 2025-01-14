package javalearning;

import java.util.Scanner;

public class MaxOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number:");
		Scanner Sc = new Scanner(System.in);
		int num1 = Sc.nextInt();
		System.out.println("Enter the second number:");
		Scanner Sc1 = new Scanner (System.in);
		int num2 = Sc1.nextInt();
		System.out.println("Enther the third number:");
		Scanner sc2 = new Scanner(System.in);
		int num3 = sc2.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("The" +num1+"is greatest");
		}
		else if(num2> num3) {
			System.out.println("The" +num2+ "is greatest");
		}
		else {
			System.out.println("The" +num3+ "is greatest");
		}
		
	}

}
