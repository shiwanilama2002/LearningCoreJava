package LoopsInJava;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find revers:");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		sc.close();
		int rev = 0;
		int remainder;
		
		int temp = digit;
		while(temp!=0) {
			remainder = temp % 10;
			rev = rev*10+remainder;
			temp = temp/10;
		}
		System.out.println("The reverse of "+digit+" is "+rev);
	}

}
