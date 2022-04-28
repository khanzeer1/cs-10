package assignments;

import java.util.Scanner;

public class PizzaCost 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);//sets the variable of scanner to input
		
		System.out.println("Enter the diameter of the pizza in inches: ");//prints "Enter the diameter of the pizza in inches:"
		int cost = input.nextInt();//lets the user input
		
		System.out.println("The cost of making the pizza is: "+(0.05*cost*cost+1.75));//prints the total cost
		

	}

}
