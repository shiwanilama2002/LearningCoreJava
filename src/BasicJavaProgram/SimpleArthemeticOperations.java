package BasicJavaProgram;

import java.util.Scanner;

public class SimpleArthemeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		sc.close();
		int sum = num1+num2;
		System.out.println("The sum of "+num1+ " and "+num2+" is: "+sum);
		int diff = num1-num2;
		System.out.println("The difference of "+num1+ " and "+num2+" is: "+diff);
		int mul = num1*num2;
		System.out.println("The product of "+num1+ " and "+num2+" is: "+sum);
		double quotient = num1/num2;
		System.out.println("The quotient of "+num1+ " and "+num2+" is: "+quotient);
	}

}
