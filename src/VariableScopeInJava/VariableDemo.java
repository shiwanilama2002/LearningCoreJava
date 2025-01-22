package variablescopeinjava;

public class VariableDemo {
	static int glovbalVar = 5;
   public static void main(String[] args) {
	   int localvar =6;
	   System.out.println("Local variable value is:"+localvar);
	   System.out.println("global variable value is:"+glovbalVar);
   }
}
