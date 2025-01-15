package LoopsInJava;

import java.util.Scanner;

public class PrintingNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println("The N numbers are:");
		for(int i =0;i<=n;i++) {
			System.out.println(i);
		}

	}

}
