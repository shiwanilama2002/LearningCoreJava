package variablescopeinjava;

public class Person {
	String name = "Shiwani";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println(p.name);
		p.setName();
		

	}
	public void setName() {
		String name= "Cwani";
		System.out.println("The name in setName method is :"+name);
		
	}

}
