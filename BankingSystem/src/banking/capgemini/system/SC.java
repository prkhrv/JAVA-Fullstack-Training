package banking.capgemini.system;

public class SC extends BankingModel {
	
	public void addSC() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.038);	
	}
	
	@Override
	public void withdrawAmount() {
		super.withdrawAmount();
		setMinBalance(5000);
		setWithdrawCounter(getWithdrawCounter()+1);
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		if(getAccountBalance() - withdrawnAmount >= getMinBalance()){
			if(getWithdrawCounter()>3) {
				setAccountBalance(getAccountBalance()-getAccountBalance()*0.03 - withdrawnAmount);
			}else {
				setAccountBalance(getAccountBalance()-withdrawnAmount);
			}
			
		}else {
			System.out.println(" Minimum Limit Reached");
		}
		
		System.out.println("Your SC Account Balance is "+getAccountBalance());
		
		
	}

}
