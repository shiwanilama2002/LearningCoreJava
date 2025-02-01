package RandomClassInJava;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array row:");
		int row = sc.nextInt();
		
		int[] a = new int[row];
		for(int i =0;i<row;i++) {
			a[i]= random.nextInt(1,50);
		}
		System.out.println("Printing element of an array with random data:");
		for(int i =0;i<row;i++) {
			System.out.print(a[i]+" ");
			
		}
		sc.close();

	}

}
