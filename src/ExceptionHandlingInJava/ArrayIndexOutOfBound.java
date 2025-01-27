package ExceptionHandlingInJava;

import java.util.Scanner;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the row number:");
			int row = sc.nextInt();
			int[] a = new int[row];
			System.out.println("Enter the elements of an array:");
			for(int i=0;i<row;i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(a[row]);
			}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("You have enetered the element greater than the array index");
		}
		
	}

}
