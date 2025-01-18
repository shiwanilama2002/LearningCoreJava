package FunctionsInJava;

import java.util.Scanner;

public class MultiplicationUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		int result =multiply(num1,num2);
		System.out.println("The product of "+num1+" and "+num2+"is:"+result);
		
	}
	public static int multiply(int a,int b) {
		int c = a*b;
		return c;
		
		
	}

}
