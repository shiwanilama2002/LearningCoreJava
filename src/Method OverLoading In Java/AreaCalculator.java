package MethodOverloading;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculator a = new AreaCalculator();
		int areaofRectangle =a.CalcuateArea(3, 4);
		System.out.println("Area of rectangle is:"+areaofRectangle);
		double areaofCircle =a.CalculateArea(5.0);
		System.out.println("Area of circle"+areaofCircle);
		double areaofSquare =a.CalculateArea(5);
		System.out.println("Area of square:"+areaofSquare);

		

	}
	
	public int CalcuateArea(int l,int b) {
		return l*b;
	}
	public double CalculateArea(double r) {
		double area = 3.14*r*r;
		return area;
	}
	public int CalculateArea(int lenght) {
		return lenght*lenght;
	}
}
