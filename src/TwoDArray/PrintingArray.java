package TwoDArray;

import java.util.Scanner;

public class PrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of row:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the value of column:");
		int col = sc.nextInt();
		System.out.println("Enter the elements of the array:");
		int[][] a = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The element of the array are:");
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
