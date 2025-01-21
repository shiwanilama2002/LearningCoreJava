package MethodOverloading;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		double  num2 = 4.566;
		Converter c = new Converter();
		System.out.println(c.convert(num2));
		System.out.println(c.convert(num));;
		

	}
	public double convert(int num) {
	
		return (double) num;
	}
	public int convert(double num) {
		return (int) num;
		
	}
}
