package VariableAssignment;

public class EFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 200, b = 300, c = 400, d = 500;
		
		System.out.println("Before swapping a is " + a +"\t"+" b is " +b +"\t"+ " c is " + c+"\t" + " d is " + d);
		int temp=0;
		
		temp = a;
		a = b;
		b = c;
		c = d;
		d = temp;
		
		System.out.println("The final swap is" +"\t a is "+ a +"\t"+ " b is " + b + "\t"+"c is " + c + "\t"+"d is " + d);
		
		
		
		
	}

}
