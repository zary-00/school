package edu.nashcc.c3dbg;

import java.text.DecimalFormat;

// This program calculates tuition bills as credits times rate per credit hour
public class DebugThree4
{
   public static void main(String args[])
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84D;
      System.out.println("My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits, rate);
      
   }
   public static void tuitionBill(int c, double r)
   {

	   //decimalformat
	  DecimalFormat decForm = new DecimalFormat("0.00");
	   
      System.out.println("Total due $" + decForm.format(r*c));
   }
}

