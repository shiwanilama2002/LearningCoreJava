package javaLoops;

import java.util.Scanner;

public class ReversPrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		System.out.println("The numbers from n to 1 is:");
		for(i=n; i>=1;i--) {
	
			System.out.println(i);
		}

	}

}
