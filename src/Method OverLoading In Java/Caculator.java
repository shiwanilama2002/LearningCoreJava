package MethodOverloading;

import java.util.Scanner;

import ClassAndObjectInJava.Calculator;

public class Caculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the 1st number:");
		Scanner sc = new Scanner(System.in);
		int first=sc.nextInt();
		System.out.print("Enter the 2nd number:");
		int second = sc.nextInt();
		System.out.print("Enter the 3rd number:");
		int third = sc.nextInt();
		Calculator c = new Calculator();
		int result = c.add(first, second,first);
		
		
	}
	public int add(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	public int add(int num1,int num2,int num3) {
		int sum1 = num1+num2+num3;
		return sum1;
	}
}
