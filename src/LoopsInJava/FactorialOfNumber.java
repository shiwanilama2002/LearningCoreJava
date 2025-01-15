package LoopsInJava;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int fact=1;
		for(int i =1; i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of "+n+" is "+fact);
	}

}
