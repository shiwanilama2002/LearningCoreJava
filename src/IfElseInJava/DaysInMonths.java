package IfElseInJava;

import java.util.Scanner;

public class DaysInMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the month:");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
			System.out.println(month+" has 31 days.");
			break;
		}
		case 2:{
			System.out.println(month+" has 29 days. ");
		}
		case 4: case 6: case 9: case 11:
		{
			System.out.println(month+"has 30 days.");
			break;
		}
		default:{
			System.out.println(month+" invalid month");
		}
		}
	}

}
