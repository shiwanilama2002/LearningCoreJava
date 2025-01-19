package ClassAndObjectInJava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first number:");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		sc.close();
		Calculator c = new Calculator();
		int sum = c.add(num1, num2);
		System.out.println(num1+"and "+num2+" sum is "+sum);

	}
	public int add(int a ,int b) {
		int c = a+b;
		return c;
	}
}
