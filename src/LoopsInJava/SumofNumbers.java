package LoopsInJava;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum =0;
		for(int i =0; i<=n;i++) {
			sum = sum+i;
		}
		System.out.println("The sum of 1 to "+n+" numbers is "+sum);
	}

}
