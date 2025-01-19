package FunctionsInJava;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the first number:");
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		System.out.print("enter the second humber to divide first number:");
		int n2 = sc.nextInt();
		sc.close();
		divide(n1,n2);
		}
	public static void divide(int a,int b) {
		try {
			int result = a/b;
			System.out.println("The result of division of "+a+" and "+b+" is "+result);
		}
		catch(Exception e) {
			System.out.println("Error occured when dividing a number "+a+" by the "+b);
		}
		
	}

}
