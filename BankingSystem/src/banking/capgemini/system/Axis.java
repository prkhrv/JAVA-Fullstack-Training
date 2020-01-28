package banking.capgemini.system;

public class Axis extends BankingModel {
	
	public void addAxis() {
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		addAmount(addedAmount,0.02);	
	}
	@Override
	public void withdrawAmount() {
		super.withdrawAmount();
		setMinBalance(4000);
		setWithdrawCounter(getWithdrawCounter()+1);
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		if(getAccountBalance() - withdrawnAmount >= getMinBalance()){
			if(getWithdrawCounter()>3) {
				setAccountBalance(getAccountBalance()-getAccountBalance()*0.017 - withdrawnAmount);
			}else {
				setAccountBalance(getAccountBalance()-withdrawnAmount);
			}
			
		}else {
			System.out.println(" Minimum Limit Reached");
		}
		
		System.out.println("Your Axis Bank Account Balance is "+getAccountBalance());
		
		
	}
	
	

}
