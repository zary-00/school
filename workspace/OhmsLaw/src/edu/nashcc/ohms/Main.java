package edu.nashcc.ohms;

public class Main {

	public static void main(String[] args) {
		
		// testy mctesterson
		OhmsLaw test = new OhmsLaw();
		test.setUserInput();
		
		System.out.println(test.getUserInput());
		
		int input = Integer.parseInt(test.getUserInput());
		System.out.println(test.calc(input));
		
	}

}
