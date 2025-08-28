package VariableAssignment;

public class GSeven {
//	System.out.println("");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cost = 699;
		float rate = 18;
		
		float forrate = (cost * rate) / 100;
		System.out.println("The for rate will be: " + forrate);
		
//		float finalplatCost = (cost + rate) / 100;
		float finalcost = (cost + forrate);
		
		System.out.println("The final Cost is: " + finalcost);
		
		
	}

}
