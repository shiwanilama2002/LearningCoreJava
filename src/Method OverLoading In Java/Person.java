package MethodOverloading;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shiwani";
		Person p = new Person();
		p.printInfo(name);
		p.printInfo(name,22);

	}
	public void  printInfo(String name) {
		System.out.println("Name:"+name);
	}
	public void printInfo(String name,int age) {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
