package VariableAssignment;

public class JTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float amount = 500000f;
		
		int time = 5;
		float rate = 6.8f;
		
		
		float interestAmount = (amount * time * rate) / 100;
		
		System.out.println("The interest amoount is: " + interestAmount);
		
				
		float finalAmount =amount + interestAmount;
		
		System.out.println("The final amount is: " + finalAmount);
	}

}
