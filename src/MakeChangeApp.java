import java.util.Scanner;
import java.lang.Math;

public class MakeChangeApp {

	public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			double itemPrice = 0, amountPaid = 0;	
			double change = amountPaid - itemPrice;
			
			
			System.out.println("What was the price of your item? ");
			itemPrice = kb.nextDouble();
			
			System.out.println("How much are you paying?");
			amountPaid = kb.nextDouble();
			
			if (amountPaid == itemPrice) {
				System.out.println("No change needed since you paid the exact amount.");
			} else if(amountPaid < itemPrice) {
				System.out.println(change + " is still owed!");
			}
				
			}
	public static void change(double change) {
		System.out.println("Your amount is "+ change);
		int twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
		double finalChange = change;
		int returnedChange = (int)(finalChange*100);
		
		twenties = returnedChange/2000;
		returnedChange %= 2000;
		
		tens = returnedChange/1000;
		returnedChange %= 1000;
		
		fives = returnedChange/500;
		returnedChange %= 500;
		
		ones = returnedChange/100;
		returnedChange %= 100;
		
		quarters = returnedChange/25;
		returnedChange %= 25;
		
		dimes = returnedChange/10;
		returnedChange %= 10;
		
		nickels = returnedChange/5;
		returnedChange %= 5;
		
		pennies = returnedChange/1;
		returnedChange %= 1;
		
		System.out.println("Twenties: "+twenties+"\nTens: "+tens+"\nFives: "+fives+"\nOnes: "+ones+"\nQuarters: "+quarters+"\nDimes: "+dimes+"\nNickels: "+nickels+"\nPennies: "+pennies);
		
		
	}

	}


