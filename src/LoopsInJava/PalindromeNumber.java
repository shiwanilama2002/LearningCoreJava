package LoopsInJava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int temp = num;
		int rev=0;
		int rem;
		while(temp!=0) {
			rem = temp % 10;
			rev = rev*10+rem;
			temp = temp/10;
		}
//		System.out.println("The reverse of the "+num+ " is "+rev);
		if(rev==num) {
			System.out.println(num+ " is a  palindrome number.");
		}
		else {
			System.out.println(num+" is not a palindrome number");
		}
	
	}

}
