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
		int twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
		
	}

	}


