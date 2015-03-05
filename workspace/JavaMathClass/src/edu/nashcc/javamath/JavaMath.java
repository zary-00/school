package edu.nashcc.javamath;

public class JavaMath {

	public static void main(String[] args) {
		System.out.println("Square root of 37: " + Math.sqrt(37));
		System.out.println("Cosine of 300: " + Math.cos(300));
		System.out.println("Sine of 300: " + Math.sin(300));
		System.out.println("Floor of 22.8: " + Math.floor(22.8)
				+ "\nCeiling of 22.8: " + Math.ceil(22.8) + "\nRounding 22.8: "
				+ Math.round(22.8));
		System.out.println("The larger of 'd' and 71 is " + Math.max('D', 71));
		System.out.println("The smaller of 'd' and 71 is " + Math.min('D', 71));
		int random = (int) (Math.random() * 20) + 1;
		System.out.println(random);

	}

}
