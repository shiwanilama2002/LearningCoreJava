package OOPConcept;

class Copy{
	int age;

	Copy(int age){
		this.age = age;
//		
	}
	//Copy constructor
	public Copy(Copy c) {
		// TODO Auto-generated constructor stub
		this.age = c.age;

	}
	 public String toString() {
	        return "Copy{age=" + age + "}";
	    }
	  }
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy c =new Copy(5);
		System.out.println(c);
		
		Copy c1 = new Copy(c);
		System.out.println(c1);
		
		
	}

}
