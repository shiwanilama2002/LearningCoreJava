package TwoDArray;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("Enter the number of row:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the number of column:");
		int col = sc.nextInt();
		System.out.println("Enter the element of an array:");
		int[][] a= new int[row][col];
		int[][] add= new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The element of the first array are:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("Enter the element of an second array:");
		int[][] b= new int[row][col];
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				b[i][j]=sc.nextInt();
			}
			}
		System.out.println("The element of the first array are:");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("The sum of the array are:");
	
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				add[i][j] = a[i][j]+b[i][j];
			}
			
		}
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
