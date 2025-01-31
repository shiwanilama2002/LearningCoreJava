package BasicJavaProgram;

import java.util.Scanner;

public class InputUserData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the intger:");
		int num = sc.nextInt();
		System.out.print("Enter the double value:");
		double d = sc.nextDouble();
		System.out.print("Enter the boolean value:");
		boolean isStudent = sc.nextBoolean();
		System.out.print("Enter the char:");
		char c = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Enter the string:");
		String s = sc.nextLine();
		System.out.println("int:"+num);
		System.out.println("double"+d);
		System.out.println("isStudent:"+isStudent);
		System.out.println("character"+c);
		System.out.println("string:"+s);
		sc.close();
	}

}
