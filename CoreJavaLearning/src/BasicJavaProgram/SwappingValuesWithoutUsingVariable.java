package BasicJavaProgram;

import java.util.Scanner;

public class SwappingValuesWithoutUsingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first Number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number:");
		int num2 = sc.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("The value of num1 is:"+num1);
		System.out.println("The value of num2 is:"+num2);
	}

}
