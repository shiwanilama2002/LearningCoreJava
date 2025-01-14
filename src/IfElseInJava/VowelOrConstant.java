package javalearning;

import java.util.Scanner;

public class VowelOrConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the character:");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);//taking first character of input
		//converting into the lowercase to handle uppercase
		ch = Character.toLowerCase(ch);
		if(ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u' ) {
			System.out.println(ch+" is a vowel");
		}
		else if (ch>='a' && ch <='z') {
			System.out.println(ch+" is a constant.");
		}
		else {
			System.out.println(ch+"is not valid alphabet");
		}
		
		
	}

}
