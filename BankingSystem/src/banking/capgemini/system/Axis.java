package banking.capgemini.system;

public class Axis extends BankingModel {
	
	public void addAxis() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.02);	
	}
	
	
	public void withdrawAxis() {	
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		withdrawAmount(withdrawnAmount, 0.017, 4000);
		
	}
	
	

}
