package IfElseInJava;

import java.util.Scanner;

public class CheckingNumberPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		if(num>0) {
			System.out.println(num+" is a positive number.");
		}
		else if (num==0){
			System.out.println(num+" is zero");
		}
		else {
			System.out.println(num+" is a negative number.");
		}

	}

}
