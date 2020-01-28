package banking.capgemini.system;

public class ICICI extends BankingModel {
	
	
	public void addICICI() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.023);	
	}
		
	
	@Override
	public void withdrawAmount() {
		super.withdrawAmount();
		setMinBalance(3000);
		setWithdrawCounter(getWithdrawCounter()+1);
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		if(getAccountBalance() - withdrawnAmount >= getMinBalance()){
			if(getWithdrawCounter()>3) {
				setAccountBalance(getAccountBalance()-getAccountBalance()*0.015 - withdrawnAmount);
			}else {
				setAccountBalance(getAccountBalance()-withdrawnAmount);
			}
			
		}else {
			System.out.println(" Minimum Limit Reached");
		}
		
		System.out.println("Your ICICI Account Balance is "+getAccountBalance());
		
		
	}
	
	

}
