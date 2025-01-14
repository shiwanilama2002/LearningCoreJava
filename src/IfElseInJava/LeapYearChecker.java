package javalearning;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("The"+year+"is leap year");
		}
		else {
			System.out.println("The"+year+"is not leap year");
		}

	}

}
