package BasicJavaProgram;

import java.util.Scanner;

public class AreaPerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the length:");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		System.out.print("Enter the breadth:");
		int b = sc.nextInt();
		sc.close();
		int area = l*b;
		int peri = 2*(l+b);
		System.out.println("The area of reactangle  having lenght as"+" "+l+" and breadth"+" "+b+" is "+area);
		System.out.println("The  perimeter of reactangle having lenght as "+" " +l+" and breadth "+b+" is "+peri);
	}

}
