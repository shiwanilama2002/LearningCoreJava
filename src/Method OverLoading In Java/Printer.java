package MethodOverloading;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =3;
		double d1 = 9.99;
		String ss="Shiwani";
		Printer p = new Printer();
		p.print(num);
		p.print(d1);
		p.print(ss);

	}
	public void print(int n) {
		System.out.println("Value in int method: "+n);
	}
	public void print(double d) {
		System.out.println("Value in double method: "+d);
	}
	public void print(String s) {
		System.out.println("Value in string method: "+s);
	}

}
