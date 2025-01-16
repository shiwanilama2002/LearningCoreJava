package FunctionsInJava;

import java.util.Scanner;

public class FunctionToCalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
//		sum(num1,num2);
		System.out.println(sum(num1,num2)+"is the addition result of two number "+num1+" and "+num2);
		sc.close();

	}
	public static  int sum(int a,int b) {
		
		int sum = a+b;
		return sum;
		
		
	}

}
