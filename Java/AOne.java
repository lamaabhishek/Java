package VariableAssignment;

public class AOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		int a = 140, b =250;
		
		System.out.println("This is before the swap: " + a + "\t"+b);
		
		int temp = 20;
		
		temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("This is after the swapping: " + temp);
		System.out.println("This is after the swapping which a is: " + a +"\t" +"Then b is: " + b );
		
		
		
	}

}