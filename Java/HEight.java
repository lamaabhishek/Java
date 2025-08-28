package VariableAssignment;

public class HEight {
	public static void main(String[] args) {
		
		
		
		float pizzaCost = 399.0f;
		float discount = 20f;  //20%discount provided
		
		float discountAmount = (pizzaCost * 20) / 100;
		
		System.out.println("The price deducted from 20% discount is " + discountAmount);
	
		float reduceAmount = pizzaCost - discountAmount;
		System.out.println("The price for 1 pizza after discount is: " + reduceAmount);
		
		
		System.out.println("The final price of 2 pizza after 20% discount is " + (reduceAmount * 2));
		
		
		
	}
}
