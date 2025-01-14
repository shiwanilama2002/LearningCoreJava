package IfElseInJava;

import java.util.Scanner;

public class FindingNumberDivisibleBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		//logic to find the number is exactly divisible by both 3 and 5
		
		if(num%3==0 && num%5==0) {
			System.out.println(num+" is exactly divisible by both 3 and 5");
		}
		else {
			System.out.println(num+" is not divisble by both 3 and 5.");
		}
	}

}
