package CallByValueAndCallByReference;

public class CallByValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =10;
		System.out.println("Before Method Call:"+num);
		modifyValue(num);
		System.out.println("AfterMethod Call:"+num);

	}
	public static void modifyValue(int num) {
		 num = 20;
		System.out.println("Inside Method:"+num);
		
	}

}
