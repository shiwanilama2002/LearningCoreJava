package IfElseInJava;

import java.util.Scanner;

public class LargestOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		sc.close();
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}
		else if(num2>num1) {
			System.out.println(num2+" is greater than "+num1);
		}
		else {
			System.out.println(num1+" and "+num2+" are equal.");
		}
	}

}
