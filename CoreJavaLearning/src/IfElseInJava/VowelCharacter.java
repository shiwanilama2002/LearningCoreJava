package IfElseInJava;

import java.util.Scanner;

public class VowelCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the character:");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();
		ch = Character.toLowerCase(ch);
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println(ch+" is a vowel.");
		}
		else if('a'<=ch && ch<='z' ) {
			System.out.println(ch+" is a constant.");
		}
		else {
			System.out.println(ch+"is not valid.");
		}
	}

}
