/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree{
    public static void main(String[] args) {
		//creats two given numbers bu the user
        	int num1 = Integer.parseInt(args[0]); 
		int num2 = Integer.parseInt(args[1]); 
		
		//defines who is the min number and who is the max number
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		//generates three random numbers
		int random1 = (int)((Math.random() * (max - min)) + min);
		int random2 = (int)((Math.random() * (max - min)) + min);
		int random3 = (int)((Math.random() * (max - min)) + min);
		
		//prints the three random numbers
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		
		//prints the minimal number from the three random numbers
		System.out.println("The minimal generated number was " + Math.min(random1, Math.min(random2, random3)));
    }
}
