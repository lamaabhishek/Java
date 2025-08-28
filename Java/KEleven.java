package VariableAssignment;

public class KEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double basicSalary = 85000;    //Hima basic salary
		int taPercent = 15;
		int daPercent = 20;
		int hraPercent = 18;
		int pfPercent = 20;
		int taxPercent = 25;
		
		
		//Converting the percentage
		
		double ta = (basicSalary*taPercent) / 100;   // 12750
		double da = (basicSalary*daPercent) / 100;   //17000
		double hra = (basicSalary * hraPercent) /100; // 15300
		double pf = (basicSalary * pfPercent) / 100; //17000
		double tax = (basicSalary * taxPercent) / 100; //21250
		
		double grossAmount = basicSalary + ta + da + hra;
		
		System.out.println("The gross Amount is: " + grossAmount);		
		
		
		double netAmount = grossAmount - (pf + tax);
		System.out.println("The net Amount is: " + netAmount);
		
		
	}

}
