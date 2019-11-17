import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			double itemPrice = 0, amountPaid = 0;
			double twenties = 20;
			double tens = 10;
			double fives = 5;
			double ones = 1;
			double quarters = 0.25;
			double dimes = 0.10;
			double nickels = 0.05; 
			double pennies = 0.01;	
			
			
			System.out.println("What was the price of your item? ");
			itemPrice = kb.nextDouble();
			
			System.out.println("How much are you paying?");
			amountPaid = kb.nextDouble();
				
			}

	}


