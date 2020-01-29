package banking.capgemini.system;

public class SC extends BankingModel {
	
	public void addSC() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.038);	
	}
	

	public void withdrawSC() {
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		withdrawAmount(withdrawnAmount, 0.03, 5000);
	}

}
