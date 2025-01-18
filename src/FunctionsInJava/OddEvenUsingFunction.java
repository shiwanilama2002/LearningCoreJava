package FunctionsInJava;

import java.util.Scanner;

public class OddEvenUsingFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result =EvenOrNot(num);
		System.out.println(num+" is"+result);
	}
	public static String EvenOrNot(int num1) {
		if(num1%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
		
	}
}
