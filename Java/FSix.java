package VariableAssignment;

public class FSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 100, b = 150, c = 200, d = 250;
		System.out.println("Before swap a: " +a  + "\t"+ "b is " +b +"\t"+ "c is " + c  +"\t"+ "d is " + d );
		
	
	a = a + b + c + d;
	b = a - (b + c + d);
	c = a - (b + c + d);
	d = a - (b + c + d);
	a = a - (b + c + d);
	
		System.out.println("Final swap swifting numbers to right: " +"\t" +"a is "+ a +"\t" +"b is "+ b +"\t" + " c is "+ c + "\t" + "d is " + d);
//		System.out.println("");
	}
	
	

}
