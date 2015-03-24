/* Name: Matthew S. Coley
 * Assignment: Ch 5 programs
 * Date 23 March 2015
 * 
 */

package edu.nashcc.pay;

import javax.swing.JOptionPane;

public class Pay {

	String skillLevel, hoursWorked;
	String medical, dental, disability, retirement;
	double medCost, dentCost, disCost, retireCost;
	double grossPay, netPay;
	final double OVERTIME_RATE = 1.5D;

	public static void main(String[] args) {

	}

	public int inputSkillLevel() {
		skillLevel = JOptionPane.showInputDialog(null,
				"Enter the worker skill level: ");
		return Integer.parseInt(skillLevel);
	}

	public double inputHoursWorked() {
		hoursWorked = JOptionPane.showInputDialog(null,
				"Enter the total hours worked: ");
		return Double.parseDouble(hoursWorked);
	}

	public double inputMedical() {
		medical = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct medical insurance from your paycheck for $32.50? (Y/N)");
		medical.toUpperCase();
		switch (medical.substring(0)) {
		case "Y":
			medCost = 32.5;
			break;
		case "N":
			medCost = 0;
			break;
		}
		return medCost;
	}

	public double inputDental() {
		dental = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct dental insurance from your paycheck for $20.00? (Y/N)");
		dental.toUpperCase();
		switch (dental.substring(0)) {
		case "Y":
			dentCost = 20.0;
			break;
		case "N":
			dentCost = 0;
			break;
		}
		return dentCost;
	}

	public double inputDisability() {
		disability = JOptionPane.showInputDialog(null,
				"Do you want to deduct long-term disability insurance "
						+ "from your paycheck for $10.00? (Y/N)");
		disability.toUpperCase();
		switch (disability.substring(0)) {
		case "Y":
			disCost = 10.0;
			break;
		case "N":
			disCost = 0;
			break;
		}
		return disCost;
	}

	public double inputRetirement() {
		retirement = JOptionPane
				.showInputDialog(null,
						"Do you want to participate in a retirement plan of 3% per paycheck? (Y/N)");
		switch (retirement.substring(0)) {
		case "Y":
			retireCost = grossPay * 0.03;
			break;
		case "N":
			retireCost = 0;
			break;
		}
		return retireCost;
		}
	
	public void setGrossPay(int hoursWorked){
		grossPay = hoursWorked * Integer.parseInt(skillLevel);
	}
}
