package FunctionsInJava;

import java.util.Scanner;

public class FactorialUsingFunction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = fact(num);
		System.out.println("The factorial of "+num+" is "+result);

	}
	public static int fact(int n) {
		int i;
		int fact=1;
		for(i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
		
	}

}
