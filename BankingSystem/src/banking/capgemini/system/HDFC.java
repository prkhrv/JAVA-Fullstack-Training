package banking.capgemini.system;

public class HDFC extends BankingModel {
	
	public void addHDFC() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.0275);
		
	}
	
	public void withdrawHDFC() {
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		withdrawAmount(withdrawnAmount, 0.02, 2000);
		
		
	}

}
