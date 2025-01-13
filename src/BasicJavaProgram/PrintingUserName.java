package BasicJavaProgram;

import java.util.Scanner;

public class PrintingUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the name of the user:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next().strip();
		sc.close();
		System.out.println("Hello"+" "+name+"!");

	}

}
