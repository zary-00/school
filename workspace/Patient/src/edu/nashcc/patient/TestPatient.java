package edu.nashcc.patient;

public class TestPatient {

	public static void main(String[] args) {
		// instantiating an object of the Patient class using the default/blank
		// constructor
		Patient pat1 = new Patient();

		// instantiating an object of the Patient class using an overloaded
		// constructor requiring parameters (pID, bloodType, age)
		Patient pat2 = new Patient("0001", "A-", 18);
		
		//displaying formatted data
		pat1.getFormattedData(pat1);
		System.out.println();
		pat2.getFormattedData(pat2);
		System.out.println();
		
		//demonstrating getter methods
		System.out.println(pat1.getPID());
		System.out.println(pat1.getBloodType());
		System.out.println(pat1.getAge());
		System.out.println();
		System.out.println(pat2.getPID());
		System.out.println(pat2.getBloodType());
		System.out.println(pat2.getAge());
	}

}
