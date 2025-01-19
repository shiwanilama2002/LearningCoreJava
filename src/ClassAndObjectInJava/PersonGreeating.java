package ClassAndObjectInJava;

import java.util.Scanner;

public class PersonGreeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name:");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		sc.close();
		PersonGreeating pg = new PersonGreeating();
		pg.greating(username);

	}
	public void greating(String name) {
		System.out.println("Hello! "+name);
	}
}
