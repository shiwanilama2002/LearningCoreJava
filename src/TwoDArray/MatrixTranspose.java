package TwoDArray;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("Enter the row number:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the column number:");
		int col = sc.nextInt();
		int[][] transpose = new int[col][row];
		System.out.println("Enter the element of the an array:");
		int[][] a = new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]= sc.nextInt();
				
			}
		}
		System.out.println("The original matrix is:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("The transpose of the original matrix:");
		for(j=0;j<row;j++) {
			for(i=0;i<col;i++) {
				transpose[j][i] = a[i][j];
			}
		}
		for(j=0;j<row;j++) {
			for(i=0;i<col;i++) {
				System.out.print(transpose[j][i]+" ");
			}
			System.out.println(" ");
		}
	}

}
