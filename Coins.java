/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		//number of cents that given by the user
		int numUser = Integer.parseInt(args[0]); 
		
		//represents how many quarters
		int quarter = numUser / 25; 
		
		//represents how many cents
		int cents = numUser % 25; 
		
		//prints how many quarters and cents
		System.out.println("Use " + quarter + " quarters and " + cents + " cents");
	}
}