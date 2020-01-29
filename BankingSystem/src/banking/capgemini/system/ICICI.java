package banking.capgemini.system;

public class ICICI extends BankingModel {
	
	
	public void addICICI() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.023);	
	}
		
	public void withdrawICICI() {
		
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		withdrawAmount(withdrawnAmount, 0.015, 3000);
		
		
		
	}
	
	

}
