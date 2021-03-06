/*Name: Matthew S. Coley
 * Assignments: chapter 3 programs
 * Date: 3 March 2015
 */

package edu.nashcc.paint;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Painting {
	String title, artist, medium;
	double price, commission;

	public Painting(String title, String artist, String medium) {
		this.title = title;
		this.artist = artist;
		this.medium = medium;

	}

	public Painting(String title, String artist, String medium, double price) {
		this.title = title;
		this.artist = artist;
		this.medium = medium;
		this.price = price;

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}

	public String getArtist() {
		return this.artist;
	}

	public String getMedium() {
		return this.medium;
	}

	public double getPrice() {
		return this.price;
	}

	// calculating the 20% commission
	public double calcCommission() {
		this.commission = this.price * 0.2D;
		return this.commission;
	}

	// Scanner input for setting values
	public void getUserInput(Painting paint) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the title: ");
		this.title = input.nextLine();
		System.out.println("Enter the artist: ");
		this.artist = input.nextLine();
		System.out.println("Enter the medium: ");
		this.medium = input.nextLine();
		System.out.println("Enter the price: ");
		this.price = input.nextDouble();
		// this.price = Double.parseDouble(input.nextLine());
		// input.close();
	}

	// formatting the data into a string block
	public void formattedData() {
		// return
		// String.format("Title: %s \nArtist: %s \nMedium: %s \nPrice: %s \nCommission: %s",
		// this.title, this.artist, this.medium, this.price,
		// this.commission);
		double com = calcCommission();
		System.out
				.println(String
						.format("Title: %s \nArtist: %s \nMedium: %s \nPrice: %s \nCommission: %s",
								this.title, this.artist, this.medium,
								decForm(this.price), decForm(com)));

	}

	// commission message
	public void commissionMsg() {
		System.out
				.println("There is a 20% gallery commission applied to each painting.");
	}

	// creating a decimal format method
	public String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		return formatter.format(decimal);
	}
}
