/*
 *  @Author Capgemini
 *  @Developer Prakhar Varshney 
 *  @Description This Class is performing the banking process
 *  @Created 28/01/2020
 *  @Version 1.0.1
 *  @Status Release Beta
 * 
 */

package banking.capgemini.system;

import java.util.Scanner;

public class BankingSystem {
	
	Scanner scan = new Scanner(System.in);
	static int selectedOption;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingModel mobjectBankingModel = new BankingModel();
		ICICI mObjectIcici = new ICICI();
		HDFC mObjectHdfc = new HDFC();
		Axis mObjectAxis = new Axis();
		SC mObjectSC = new SC();
		
		do {
			int selectedBank = mobjectBankingModel.selectBankMenu();
			if(selectedBank == 1) {
				selectedOption = mobjectBankingModel.bankingOptions();
				if(selectedOption==1) {
					mObjectIcici.addAmount();
				}else if (selectedOption==2){
					mObjectIcici.withdrawAmount();
				}
			}else if(selectedBank == 2){
				selectedOption = mobjectBankingModel.bankingOptions();
				if(selectedOption==1) {
					mObjectHdfc.addAmount();
				}else if(selectedOption == 2){
					mObjectHdfc.withdrawAmount();
					
				}
			}else if(selectedBank == 3) {
				selectedOption = mobjectBankingModel.bankingOptions();
				if(selectedOption==1) {
					mObjectAxis.addAmount();
				}else if(selectedOption == 2){
					mObjectAxis.withdrawAmount();
					
				}
			}else if (selectedBank == 4) {
				selectedOption = mobjectBankingModel.bankingOptions();
				if(selectedOption==1) {
					mObjectSC.addAmount();
				}else if(selectedOption == 2){
					mObjectSC.withdrawAmount();
					
				}
				
			}	
		}while(mobjectBankingModel.continueBanking()==1);
		
		System.out.println("Thank You For Banking With Us");
		
		
		
	}
	
	
	

}