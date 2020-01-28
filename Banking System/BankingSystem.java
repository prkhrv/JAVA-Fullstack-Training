/*
 *  @Author Capgemini
 *  @Developer Prakhar Varshney 
 *  @Description This Class is performing the banking process
 *  @Created 27/01/2020
 *  @Version 1.0
 *  @Status Release Beta
 * 
 */

package banking.casestudy;

import java.util.Scanner;

public class BankingSystem {
	
//	GLOBAL
	
//	Scanner
	Scanner scan = new Scanner(System.in);
	
	double minBalance = 1000;
	double currentBalance = 1500;
	int addAmountCounter = 0;
	int withdrawCounter = 0;
	

	public static void main(String[] args) {
		BankingSystem mObjectBankingSystem = new BankingSystem();
		
		// TODO Auto-generated method stub
		mObjectBankingSystem.selectBank();
		
		while(mObjectBankingSystem.choice()==1) {
			if(mObjectBankingSystem.selectAction() == 1) {
				mObjectBankingSystem.addAmount();
			}else {
				System.out.println("Withdraw");
			}
			
		}
		
		System.out.println("Thank You For Using our System");
		
		
			
			
		
	
		
	}
	
	//Continue Funtion
	public int choice() {
		System.out.println("Press 1 to continue ?");
		int choice = scan.nextInt();
		return choice;
		
	}
	
	//Select Bank
	public int selectBank(){
		System.out.println("Welcome to IBS\n Select your Bank\n 1:ICIC\n 2:HDFC\n 3:SC\n 4:Axis Bank");
		int selected_bank = scan.nextInt();
		return selected_bank;	
	}
	//Select Action
	public int selectAction(){
		System.out.println("Select Action\n 1:Add\n 2:Widthdraw");
		int selected_action = scan.nextInt();
		return selected_action;
	}
	
	//Add Amount
	public void addAmount() {
		System.out.println("Enter the Amount");
		int amount = scan.nextInt();
		if (addAmountCounter >= 3) {
			currentBalance = (double) (currentBalance + amount + 0.015*currentBalance);
		}else {
			currentBalance = currentBalance + amount;
		}
		
		addAmountCounter = addAmountCounter+1;
		
		
		System.out.println(currentBalance);
		
		
		
		
	}
	
//	public void withdrawAmount() {
//		
//	}

}
