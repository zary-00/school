package edu.nashcc.ohms;

import javax.swing.JOptionPane;

public class OhmsLaw {

/* TODO: 
 * 		- loop (do while?)
 */
	
	private double voltage, current, resistance;
	private int userInput;
	
	public OhmsLaw(){
		
	}

	public String displayUserOptions(){
		StringBuilder sb = new StringBuilder();
		sb.append("Choose the value you wish to calculate: \n");
		sb.append("1 - Voltage\n");
		sb.append("2 - Current\n"); 
		sb.append("3 - Resistance\n");
		sb.append("\n0 - QUIT");
		return sb.toString();
	}
	
	public void setUserInput(){
		
	}
	public int getUserInput(){
		return userInput;
	}
	
	private double getCalcInput(String myPrompt){
		return Double.parseDouble(JOptionPane.showInputDialog(null, myPrompt));
	}
	public double calc(int userInput){
		double answer = 0;
		switch(userInput) {
		case 1:
			current = getCalcInput("Enter the current: ");
			resistance = getCalcInput("Enter the resistance: ");
			answer = current * resistance;
			break;
		case 2:
			voltage = getCalcInput("Enter the voltage: ");
			resistance =  getCalcInput("Enter the resistance: ");
			answer = voltage / resistance;
			break;
		case 3:
			voltage = getCalcInput("Enter the voltage: ");
			current = getCalcInput("Enter the current: ");
			answer = voltage / current;
			break;
		//default: (error message?)
		}
		return answer;
	}
	
	
	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public double getResistance() {
		return resistance;
	}

	public void setResistance(double resistance) {
		this.resistance = resistance;
	}
}
