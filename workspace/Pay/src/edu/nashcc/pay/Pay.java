/* Name: Matthew S. Coley
 * Assignment: Ch 5 programs
 * Date 23 March 2015
 * 
 */

package edu.nashcc.pay;

import javax.swing.JOptionPane;

public class Pay {

	String skillLevel;
	String medical, dental, disability, retirement;
	double medCost, dentCost, disCost, retireCost, totalDeductions;
	double hoursWorked, perHour, grossPay, overtimePay, overForty, netPay;
	final double OVERTIME_RATE = 1.5D;

	public static void main(String[] args) {
		Pay pay1 = new Pay();
		pay1.inputSkillLevel();
		pay1.inputHoursWorked();

		switch (pay1.getSkillLevel()) {
		case 3:
			pay1.inputMedical();
			pay1.inputDental();
			pay1.inputDisability();
			pay1.inputRetirement();
			break;
		case 2:
			pay1.inputMedical();
			pay1.inputDental();
			pay1.inputDisability();
			break;
		default:
			break;
		}

		pay1.setGrossPay(pay1.hoursWorked); // pay1.setGrossPay(pay1.getHoursWorked()
																// not working
																
		// testing stuff -- getGrossPay() returns 0.0, need to fix
		System.out.println("grossPay: " + pay1.getGrossPay());
		System.out.println("hoursWorked: " + pay1.getHoursWorked());
		System.out.println("skillLevelPay: " + pay1.getSkillLevelPay());
		System.out.println("perHour: " + pay1.perHour);
		System.out.println("medCost: " + pay1.getMedCost());
		System.out.println("dentCost: " + pay1.getDentalCost());
		System.out.println("disCost: " + pay1.getDisCost());
		System.out.println("retireCost: " + pay1.getRetireCost());
		

	}

	public Pay() {

	}

	public void inputSkillLevel() {
		skillLevel = JOptionPane.showInputDialog(null,
				"Enter the worker skill level (1, 2, 3): ");
	}

	public int getSkillLevel() {
		return Integer.parseInt(skillLevel);
	}

	public double getSkillLevelPay() {
		switch (getSkillLevel()) {
		case 1:
			this.perHour = 17.0;
			break;
		case 2:
			this.perHour = 20.0;
			break;
		case 3:
			this.perHour = 22.0;
			break;
		}
		return this.perHour;
	}

	public void inputHoursWorked() {
		this.hoursWorked = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter the total hours worked: "));
	}

	public double getHoursWorked() {
		return this.hoursWorked;
	}

	public void inputMedical() {
		medical = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct medical insurance from your paycheck for $32.50? (Y/N)");
		medical.toUpperCase();
		switch (medical.substring(0)) {
		case "Y":
			this.medCost = 32.5;
			break;
		default:
			this.medCost = 0;
			break;
		}
	}

	public double getMedCost() {
		return this.medCost;
	}

	public void inputDental() {
		dental = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct dental insurance from your paycheck for $20.00? (Y/N)");
		dental.toUpperCase();
		switch (dental.substring(0)) {
		case "Y":
			this.dentCost = 20.0;
			break;
		default:
			this.dentCost = 0;
			break;
		}
	}

	public double getDentalCost() {
		return this.dentCost;
	}

	public void inputDisability() {
		disability = JOptionPane.showInputDialog(null,
				"Do you want to deduct long-term disability insurance "
						+ "from your paycheck for $10.00? (Y/N)");
		disability.toUpperCase();
		switch (disability.substring(0)) {
		case "Y":
			this.disCost = 10.0;
			break;
		default:
			this.disCost = 0;
			break;
		}
	}

	public double getDisCost() {
		return this.disCost;
	}

	public void inputRetirement() {
		retirement = JOptionPane
				.showInputDialog(null,
						"Do you want to participate in a retirement plan of 3% per paycheck? (Y/N)");
		switch (retirement.substring(0)) {
		case "Y":
			this.retireCost = grossPay * 0.03;
			break;
		default:
			this.retireCost = 0;
			break;
		}
	}

	public double getRetireCost() {
		return this.retireCost;
	}

	public void setGrossPay(double hoursWorked) {
		if (hoursWorked < 41) {
			this.grossPay = hoursWorked * this.perHour;
		} else if (hoursWorked > 40) {
			overForty = hoursWorked - 40;
			setOvertimePay(overForty);
			this.grossPay = getOvertimePay() + (hoursWorked * this.perHour);
		}

	}

	public double getGrossPay() {
		return this.grossPay;
	}

	public void setOvertimePay(double overForty) {
		this.overtimePay = (overForty * perHour * OVERTIME_RATE); // fix
	}

	public double getOvertimePay() {
		return this.overtimePay; //returning OT hours * 1.5, fix
	}

	public void setTotalDeductions() {
		this.totalDeductions = this.medCost + this.dentCost + this.disCost
				+ this.retireCost;
	}

	public double getTotalDeductions() {
		return this.totalDeductions;
	}

	public void setNetPay() {
		this.netPay = this.grossPay - this.totalDeductions;
	}

	public double getNetPay() {
		return this.netPay;
	}
}