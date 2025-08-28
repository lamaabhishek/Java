package VariableAssignment;

public class DFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 150, b = 250, c = 300;

		System.out.println("This is before the swapping: " + "a is " + a + "\t" + "b is " + b + "\t" + "c is " + c);

		//After Swapping
		
		
		 a = a + b + c;
		 b = a - (b + c);
		 c = a - (b + c);
		 a = a - (b + c);
		 
		 
		 System.out.println("This is after swapping  a is " + a +"\t"+"b is " + b+"\t" + "c is " + c);

	}

}
