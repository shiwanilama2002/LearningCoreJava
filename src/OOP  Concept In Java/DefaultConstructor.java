package OOPConcept;

public class DefaultConstructor {
	String name = "Shiwani Lama";
	int age = 23;
	String workingAs = "QA"; 
	DefaultConstructor(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(workingAs);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor constructor = new DefaultConstructor();

	}

}
