package VariableAssignment;

public class CThree {
//System.out.println();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 100, b = 200, c = 300;

		System.out.println("This is before the swapping: " +"a is: " + a +"\t" +" b is: " + b +"\t"+ " c is: " + c);
		
		int temp = 0;
		
		temp = a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println("The final swap is: " + "a is: " + a +"\t" +"b is: " + b +"\t" + "c is: " + c);
		
	}

}
