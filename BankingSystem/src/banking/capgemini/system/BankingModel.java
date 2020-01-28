package banking.capgemini.system;

public class BankingModel extends BankingSystem {
	
	double minBalance,accountBalance;
	int addCounter=0,withdrawCounter=0;
	
	
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAddCounter() {
		return addCounter;
	}
	public void setAddCounter(int addCounter) {
		this.addCounter = addCounter;
	}
	public int getWithdrawCounter() {
		return withdrawCounter;
	}
	public void setWithdrawCounter(int withdrawCounter) {
		this.withdrawCounter = withdrawCounter;
	}
	public void addAmount(double addedAmount,double d) {
		// TODO Auto-generated method stub
		if(getAddCounter()>=3) {
			setAccountBalance(getAccountBalance()+getAccountBalance()*d+ addedAmount);
		}else {
			setAccountBalance(getAccountBalance()+addedAmount);
			
		}
		setAddCounter(getAddCounter()+1);
		System.out.println("Your Account Balance is "+getAccountBalance());
		
	}
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		
	}
	
	
	public int selectBankMenu() {
		System.out.println("Welcome to Capgemini Banking System\n 1:ICICI Bank\n 2:HDFC Bank\n 3:AXIS Bank\n 4:SC Bank");
		int option = scan.nextInt();
		return option;
	}
	
	public int bankingOptions() {
		System.out.println("Select What you want to Perform\n 1:Add Amount\n 2:Withdraw Amount");
		int bankingChoice = scan.nextInt();
		return bankingChoice;
		
	}
	
	public int continueBanking() {
		System.out.println("Want to Continue banking?\n 1:Yes\n 2:No");
		int continueBankingChoice = scan.nextInt();
		return continueBankingChoice;
		
	}
	
	
	
	

}
