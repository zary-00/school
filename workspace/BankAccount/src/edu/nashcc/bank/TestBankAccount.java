package edu.nashcc.bank;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank1 = new BankAccount();
		BankAccount bank2 = new BankAccount();
		BankAccount bank3 = new BankAccount();
		BankAccount bank4 = new BankAccount();
		
		bank1.getData(bank1);
		bank2.getData(bank2);
		bank3.getData(bank3);
		
		bank1.showValues(bank1);
		//new line to separate accounts
		System.out.println("");
		bank2.showValues(bank2);
		//new line to separate accounts
		System.out.println("");
		bank3.showValues(bank3);
		//new line to separate accounts
		System.out.println("");
		bank4.showValues(bank4);
		
	}


	
}
