/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle{
	public static void main(String[] args) {
		//creates three numbers that given by the user
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		boolean isTriangle= false;
		
		//checking if the three given numbers can create a triangle
		if(num1 + num2 > num3 && num3 + num2 > num1 && num1 + num3 > num2){
			isTriangle = true;
		}
		
		//prints if the three given numbers creating a triangle
		System.out.println(num1 + ", " + num2 + ", " + num3 + ": " + isTriangle);
	}
}
