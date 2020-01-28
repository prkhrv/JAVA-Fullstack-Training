package banking.capgemini.system;

public class HDFC extends BankingModel {
	@Override
	public void addAmount() {
		super.addAmount();
		
		System.out.println("Enter the amount to be added");
		double addedAmount = scan.nextDouble();
		if(getAddCounter()>=3) {
			setAccountBalance(getAccountBalance()+getAccountBalance()*0.0275+ addedAmount);
		}else {
			setAccountBalance(getAccountBalance()+addedAmount);
			
		}
		setAddCounter(getAddCounter()+1);
		System.out.println("Your HDFC Account Balance is "+getAccountBalance());
	}
	
	@Override
	public void withdrawAmount() {
		super.withdrawAmount();
		setMinBalance(2000);
		setWithdrawCounter(getWithdrawCounter()+1);
		System.out.println("Enter the amount to be withdrawn");
		double withdrawnAmount = scan.nextDouble();
		if(getAccountBalance() - withdrawnAmount >= getMinBalance()){
			if(getWithdrawCounter()>3) {
				setAccountBalance(getAccountBalance()-getAccountBalance()*0.02 - withdrawnAmount);
			}else {
				setAccountBalance(getAccountBalance()-withdrawnAmount);
			}
			
		}else {
			System.out.println(" Minimum Limit Reached");
		}
		
		System.out.println("Your HDFC Account Balance is "+getAccountBalance());
		
		
	}

}
