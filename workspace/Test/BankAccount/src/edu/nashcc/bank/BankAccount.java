/*Name: Matthew S. Coley
 * Assignments: chapter 3 programs
 * Date: 3 March 2015
 */

package edu.nashcc.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankAccount {

	// global variables
	String accountNo, name;
	double balance;

	public BankAccount(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public BankAccount() {
		this.accountNo = "000000";
		this.name = "John Smith";
		this.balance = 1200.0D;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	// to display formatted data
	public void showValues(BankAccount bank) {
		System.out.println(String.format(
				"Account No.:\t%s \nAccount Name:\t%s\nBalance:\t%s",
				this.accountNo, this.name, decForm(this.balance)));
		double newBalance = bank.deductMonthlyFee(this.balance);
		explainAccountPolicy();
		System.out.println("New balance:\t" + decForm(newBalance));

	}

	// getting data input
	public void getData(BankAccount bank) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the account number: ");
		this.accountNo = input.nextLine();
		System.out.println("Enter the name on the account: ");
		this.name = input.nextLine();
		System.out.println("Enter the current account balance: ");
		this.balance = input.nextDouble();

	}

	public double deductMonthlyFee(double balance) {
		this.balance = balance - 4.0D;
		return this.balance;
	}

	public static void explainAccountPolicy() {
		System.out
				.println("******************************"
						+ "\nThere is a $4/month service fee"
						+ "\nthat is automatically deduced "
						+ "\nfrom your account balance."
						+ "\n******************************");
	}

	// creating a decimal format method
	public String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		return formatter.format(decimal);
	}
}