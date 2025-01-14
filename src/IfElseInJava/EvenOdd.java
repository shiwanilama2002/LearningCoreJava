package javalearning;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to test odd or even");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			System.out.println("The"+num1+"is an even number");
		}
		else {
			System.out.println("The"+num1+"is an odd number");
		}
	}

}
