package BasicJavaProgram;

import java.util.Scanner;

public class SwappingVariableUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int swap;
		System.out.print("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		swap = num2;
		num2 = num1;
		num1 = swap;
		System.out.println("The value of num1 after swap is "+num1);
		System.out.println("The value of num2 after swap is "+num2);
	}

}
