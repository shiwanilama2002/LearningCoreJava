package BasicJavaProgram;

import java.util.Scanner;

public class CalculatingSquareAndCubeOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number to find square and the cube:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int square = num * num;
		int cube = num*num*num;
		System.out.println("The square of the given number "+num+" is "+square);
		System.out.println("The cube of the given number "+num+" is "+cube);
	}

}
