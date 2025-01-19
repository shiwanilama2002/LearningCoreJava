package FunctionsInJava;

import java.util.Scanner;

public class CheckingPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(palindrome(n)==n) {
			System.out.println(n+" is a palindorme.");
		}
		else {
			System.out.println(n+" is not a palindrome.");
		}

	}
	public static int palindrome(int num) {
		int rev=0;
		int temp=num;
		int rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		return rev;
		
	}
	}
