package ArraysInJava;

public class MinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[5];
		ar[0]=100;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		int min=ar[0];
		int i;
		for(i=0;i<5;i++) {
			if(ar[i]<min) {
				min=ar[i];
				}
			else {
				min = min;
			}
		}
		System.out.println(min+"is the minimum element in the given array");
	}

}
